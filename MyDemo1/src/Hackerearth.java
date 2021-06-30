//import java.io.*;
import java.util.*;

class Hackerearth {
	/*static private int fun(int a,int b)
	{
		int sum=0;
		if(a>1)
		{
		
			System.out.println(sum);
			sum=fun(b-3,a+1);
			return sum;
		}
		else
		{
			System.out.println("inside else");
			return a+b;
		}
	}*/
	public static void main(String args[]) throws Exception {
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int col=scan.nextInt();
		int A[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				A[i][j]=scan.nextInt();
			}
		}
		int largestrow=0;
		for(int i=0;i<row;i++)
		{
			int result=0;
			for(int j=0;j<col;j++)
			{
				result=result+A[i][j];
			}
			if(largestrow<result)
			{
				largestrow=result;
			}
		}
		//System.out.println(largestrow);
		int largestcol=0;
		for(int i=0;i<col;i++)
		{
			int result=0;
			//int j=0;
			for(int j=0;j<row;j++)
			{
				result=result+A[j][i];
			}
			if(largestcol<result)
			{
				largestcol=result;
			}
		}
		System.out.println(largestcol+largestrow);
	
}
}
