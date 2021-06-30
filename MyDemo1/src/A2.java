import java.util.Arrays;
import java.util.StringTokenizer;

public class A2
{
	static {
		System.out.println("A2 load");
	}
	private int a=10;
	static class A3
	{ 
		int b=20;
		static {
			System.out.println("A3 load");
		}
	  void show()
		{
		 A2 x=new A2();
			System.out.println(x.a);
			x.a++;
		}
		/*public static void main(String args[])
		{
			A2 a=new A2();
			//a.show();
			a.showouter();
			A3 a1=new A3();
			a1.show();
		}*/
	}
	void show()
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		/*A2 a=new A2();
		//a.show();
		a.show();
		A3 a1=new A3();
		a1.show();
		a.show();*/
		//System.out.println(a1.b);
		StringTokenizer s=new StringTokenizer("Hi Buddy");
		System.out.println(s.countTokens());
		String x="  Hello World ";
		String s1=x.trim();
		StringBuffer b=new StringBuffer("hello world");
		System.out.println(b.capacity());
		System.out.println(s1.toLowerCase().equals(b));
		System.out.println(s1.length());
		String[]g=x.split("e");
		System.out.println(Arrays.toString(g));
		System.out.println(g.length);
		System.out.println(x.substring(1));
		System.out.println(x.contains("fc"));
		System.out.println(x.hashCode());
		System.out.println(x.equals("a"));
		System.out.println(x.compareTo("a"));
		System.out.println(x.length());
		System.out.println(x.equalsIgnoreCase("a"));
		System.out.println(x.lastIndexOf("sdf"));
	}
	
}