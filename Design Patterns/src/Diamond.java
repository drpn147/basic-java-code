import java.util.Scanner;

public class Diamond {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scan.nextInt();
		int mid=(size+1)/2;
		for(int i=1;i<=mid;i++)//row
		{
			for(int s=1;s<=mid-i;s++)//space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)//column
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=mid-1;i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*(mid-i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
