import java.util.*;
/*class A
{
	static void a()
	{
		System.out.print("g");
	}
}*/
class A1
{
	//@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String args[])
	{
		/*A x=new A();
		A.a();*/
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scan.nextInt();
		int mid=(size+1)/2;
		
		for(int i=1;i<=mid;i++)
		{
			for(int s=1;s<=mid-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
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