package com.stringoperation.in;

import java.util.Scanner;

/*
 * 1. Input string
 * 2. find the longest substring between same character
 * 3. excluding the same character and print;
 * 
 * input: cabbac
 * output: abba
 * 
 * input: dabccbaxd
 * output: bccb
 * 
 */
public class SubString {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String word = scan.nextLine();
		String result = substring(word);
		System.out.println(result);
	}

	private static String substring(String word) {
		String result = "";
		String resultValue = "";
		int maxLen = 0;
		for (int i = 0; i < word.length()-1; i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					result = inbetweenSubstring(word, i, j);
					if (checkCondition(result)) {
						int len = result.length();
						if (len > maxLen) {
							maxLen = len;
							resultValue = result;
						}
					}
				}
			}
		}
		return resultValue;
	}

	private static boolean checkCondition(String result) {
		String palindrom="";
		for(int i=result.length()-1;i>=0;i--)
		{
			palindrom=palindrom+result.charAt(i);
		}
		if(palindrom.equals(result))
		{
			return true;
		}
		return false;
	}

	private static String inbetweenSubstring(String word, int i, int j) {
		String result = "";
		for (int iValue = i + 1; iValue < j; iValue++) {
			result = result + word.charAt(iValue);
		}
		return result;
	}

}
