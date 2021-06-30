
public class New {
@SuppressWarnings("finally")
static int m1() throws ArithmeticException 
{
	try
	{
		try {
			System.out.println(10/0);
			//throw new ArithmeticException();
			//System.out.print("hjfff");
		}
		finally
		{
			System.out.println("inner finall");
			//return 7;
		}
	}
	//catch(Exception e)
	//{
	//	System.out.print("in catch");
	//	return 11;
	//}
	finally
	{
		System.out.println("in static finally");
		//int []arr=new int[-9];
		return 77;
	}
	//System.out.print("hhhh");
}
	public static void main(String[] args) {
		System.out.print(m1());
		int a=99;
		try
		{
		a=9;	
		}
		catch(Exception e)
		{
			System.out.print(a);
		}
		finally
		{
			System.out.print(a);
		}
		System.out.print(a);
	}

}
