/*class Excep extends Thread
{
	public void run()
	{
		int c=10+3;
		System.out.println(c+" "+getName());
	}
	static int m1()
	{
		try
		{
			System.out.println("in try");
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			//return 10;
			System.out.println("In finally");
			//int arr[]=new int[-5];
			//return;
		}
	return 20;
	}
	public static void main(String args[])
	{
		Excep e=new Excep();
		Excep e1=new Excep();
		//Excep e2=new Excep();
		e.setPriority(5);
		e1.setPriority(6);
		e.start();
		//Excep e1=new Excep();
		//e1.setPriority(1);
		e1.start();
		Excep e2=new Excep();
		e2.setPriority(1);
		e2.start();
		//m1();
		//System.out.println("Main executed");
		//System.out.println(m1());
	}
}*/


class Excep1 extends Thread
{
	public void run()
	{
		System.out.println(getName()+"run executed");
	}
}
class Excep
{
	public static void main(String args[])
	{
		Excep1 e=new Excep1();
		Excep1 e1=new Excep1();
		e.setPriority(5);
		e1.setPriority(9);
		e.start();
		e1.start();
		System.out.println(" e"+e.getPriority());
		System.out.println("Main executed");
	}
}