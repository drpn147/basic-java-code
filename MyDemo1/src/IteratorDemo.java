import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(3);
		al.add("aa");
		al.add(4);
		al.add("dd");
		al.add(38);
		al.add("aad");
		System.out.println("AL element:"+al);
		int count=1;
		ListIterator lt=al.listIterator();
		while(lt.hasNext())
		{
			Object obj=lt.next();
			System.out.println("Current Element:"+obj);
			if(obj instanceof String)
			{
				String s=(String)obj;
				lt.set(s.toUpperCase());
				//System.out.println("String element:"+s);
			}
			else if(obj instanceof Integer)
			{
				if(count==1)
				{
					lt.add(20);
					count++;
				}
				System.out.println("Integer element:"+obj);
			}
		}
		
		System.out.println("New AL:"+al);
		//List<String> l=new ArrayList<Object>();
		//List<Object> l1=new ArrayList<String>();
			
	}

}
