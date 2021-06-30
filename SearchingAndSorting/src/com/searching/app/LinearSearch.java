package com.searching.app;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int key = 5;
		System.out.println(key + " is found at index: " + linearSearch(a1, key));

	}

	private static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
