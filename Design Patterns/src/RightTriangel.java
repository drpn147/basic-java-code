import java.util.Scanner;

//import java.util.Scanner;

public class RightTriangel {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scan.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		int size1=scan.nextInt();
		for(int i=size1;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			//System.out.println("*");
			System.out.println();
		}

	}
}
