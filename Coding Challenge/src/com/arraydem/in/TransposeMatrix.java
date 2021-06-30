package com.arraydem.in;

import java.util.Scanner;

public class TransposeMatrix {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int row=3,col=3;
		int matrix[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
		displayMatrix(matrix,row,col);
		matrix=transpose(matrix,row,col);
		System.out.println("Transpose Matrix:");
		displayMatrix(matrix,row,col);
	}
	private static int[][] transpose(int[][] matrix, int row, int col) {
		int transposeMatrix[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				transposeMatrix[j][i]=matrix[i][j];
			}
		}
		return transposeMatrix;
	}
	private static void displayMatrix(int[][] matrix, int row, int col) {
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
