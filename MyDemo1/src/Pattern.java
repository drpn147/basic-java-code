//import java.util.ArrayList;
import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String result="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			//System.out.println((char)news);
			if(c!=' ')
			{
				result=result+c;
			}
			else
			{
				break;
			}
			count++;
		}
		String result1="";
		int lcount=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			//char c=s.charAt(i);
			if(s.charAt(i)!=' ')
			{
				result1=result1+s.charAt(i);
				lcount++;
			}
			else
			{
				break;
			}
		}
		//System.out.println(result1+" "+lcount);
		for(int i=count;i<s.length()-lcount;i++)
		{
			if(s.charAt(i)==' ')
			{
				result=result+s.charAt(i);
			}
			else
			{
				int ascii=(int)s.charAt(i);
				result=result+(char)(ascii+1);
			}
		}
		int lascii=(int)result1.charAt(result1.length()-1);
		System.out.println(lascii);
		//System.out.println(result+" "+(char)(lascii+20));
		
		
		
		
	}

}
