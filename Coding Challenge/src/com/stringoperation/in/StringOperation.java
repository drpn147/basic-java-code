package com.stringoperation.in;

import java.util.Scanner;

/*
 * 
 * 1. Replace firstWord with the lastWord where word in is reverse order
 * 2. In between words, replace vowel with next uppercase letter
 * 
 * input:- Java is programming language
 * output:- egaugnal Js prPgrBmmJng avaj 
 */
public class StringOperation {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the sentence:");
		String sentence = scan.nextLine();
		System.out.println("Enter the special character");
		String specialCharacter=scan.nextLine();
		char splitChar=specialCharacter.charAt(0);
		String words[] = spliting(sentence, splitChar);
		int noOfWords = words.length;
		String firstWord = swapingReverseLast(words);
		String lastWord = swapingReverseFirst(words);
		String inBetweenWords[] = replaceVowel(words, noOfWords);
		String result = "";
		int j = 0;
		for (int i = 0; i < noOfWords; i++) {
			if (i == 0) {
				result = result + firstWord + splitChar;
			} else if (i == noOfWords - 1) {
				result = result + lastWord + splitChar;
			} else {
				result = result + inBetweenWords[j] + splitChar;
				j++;
			}
		}
		System.out.println(result);

	}

	private static String swapingReverseLast(String[] words) {
		int len = words.length;
		String result = words[len - 1];
		String lastWord = "";
		for (int i = result.length() - 1; i >= 0; i--) {

			lastWord = lastWord + result.charAt(i);
		}
		return lastWord;
	}

	private static String[] replaceVowel(String[] words, int noOfWords) {
		int len = words.length;
		String inBetween[] = new String[len - 2];
		int j = 0;
		for (int i = 0; i < noOfWords; i++) {
			if (i == 0) {
				continue;
			} else if (i == noOfWords - 1) {
				break;
			} else {
				String resultVowel = words[i];
				inBetween[j] = vowelOp(resultVowel);
				j++;
			}
		}

		return inBetween;

	}

	private static String vowelOp(String sentence) {
		String result = "";
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				int value = c + 1;
				c = (char) (value - 32);
				result = result + c;
			} else {
				result = result + c;
			}
		}
		return result;
	}

	private static String swapingReverseFirst(String[] words) {
		String result = words[0];
		String lastWord = "";
		for (int i = result.length() - 1; i >= 0; i--) {
			lastWord = lastWord + result.charAt(i);
		}
		return lastWord;
	}

	private static String[] spliting(String sentence, char splitChar) {
		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == splitChar) {
				count++;
			}
		}
		String splitValue[] = new String[count + 1];
		int j = 0;
		String tempValue = "";
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == splitChar) {
				j++;
				tempValue = "";
			} else {
				tempValue = tempValue + sentence.charAt(i);
			}
			splitValue[j] = tempValue;
		}
		return splitValue;

	}

}
