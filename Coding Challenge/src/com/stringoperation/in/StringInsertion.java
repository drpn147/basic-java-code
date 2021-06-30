package com.stringoperation.in;

import java.util.Scanner;

/*
 * 1. Take string as input
 * 2. replace duplicate words with its next ascii character
 * 3. pass the resultant string for insertion sort
 * 4. return result
 * Enter the string
	input: 	i loove Javvaa Programming
	output: Replacing duplicate words: i lppve Jbwwbb Psohsanninh 
			Sorting using Insertion sort: Jbwwbb Psohsanninh i lppve 
 * 
 */
public class StringInsertion {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String sentence = scan.nextLine();
		char splitWord = ' ';
		String words[] = spliting(sentence, splitWord);
		words = duplicateWords(words);
		System.out.print("Replacing duplicate words: ");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + splitWord);
		}
		words = insertionSort(words);
		System.out.println();
		System.out.print("Sorting using Insertion sort: ");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
	}

	private static String[] insertionSort(String[] words) {
		String key;
		int i;

		for (int j = 1; j < words.length; j++) {
			key = words[j];
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(words[i]) > 0) {
					break;
				}
				words[i + 1] = words[i];
				i--;
			}
			words[i + 1] = key;
		}
		return words;
	}

	private static String[] duplicateWords(String[] words) {

		for (int i = 0; i < words.length; i++) {
			char value[] = stringToChar(words[i]);
			int changeIndex[] = new int[value.length];
			int index = 0;
			for (int j = 0; j < value.length; j++) {
				int count = 0;
				char letter = 0;
				if (findChangeIndex(j, changeIndex)) {
					continue;
				} else {
					for (int k = j + 1; k < value.length; k++) {
						if (value[j] == value[k]) {
							int asciiValue = (int) value[k];
							letter = (char) (asciiValue + 1);
							value[k] = letter;
							changeIndex[index] = k;
							index++;
							count++;
						}
					}
				}
				if (count > 0) {
					value[j] = letter;
					changeIndex[index] = j;
					index++;
				}
			}
			words[i] = charToString(value);

		}

		return words;
	}

	private static boolean findChangeIndex(int j, int[] changeIndex) {
		for (int i = 0; i < changeIndex.length; i++) {
			if (j == changeIndex[i]) {
				return true;
			}
		}
		return false;
	}

	private static String charToString(char[] value) {
		String result = "";
		for (int i = 0; i < value.length; i++) {
			result = result + value[i];
		}
		return result;
	}

	private static char[] stringToChar(String string) {
		int len = string.length();
		char value[] = new char[len];
		for (int i = 0; i < len; i++) {
			value[i] = string.charAt(i);
		}
		return value;
	}

	private static String[] spliting(String sentence, char splitWord) {
		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == splitWord) {
				count++;
			}
		}
		String splitValue[] = new String[count + 1];
		int j = 0;
		String tempValue = "";
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == splitWord) {
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
