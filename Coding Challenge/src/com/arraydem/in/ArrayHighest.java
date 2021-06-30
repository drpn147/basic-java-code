package com.arraydem.in;
/*
 * 1. getting array element from the console
 * 2. getting input from the user to find the nearest element present in array
 * 3. comparing number with the array 
 * 	a. if greater than finding the difference between them and compare with the min 
 * 	b. if min is greater than the difference then min=difference value
 */
import java.util.Scanner;

public class ArrayHighest {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int array[]=new int[5];
		System.out.println("Enter the array element:");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		System.out.println("Enter the number:");
		int number=scan.nextInt();
		int highestNumber=higestValue(number,array);
		System.out.println(highestNumber);
	}
	private static int higestValue(int number, int[] array) {
		int min=0;
		int value=0;
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>number)
			{
				int difference=array[i]-number;
				if(count==0)
				{
					min=difference;
					value=array[i];
					count++;
				}
				else
				{
					if(difference<min)
					{
						min=difference;
						value=array[i];
						count++;
					}
				}
					
			}
		}
		return value;
	}

}
