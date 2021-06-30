
public class Prime {

	public static void main(String[] args) {
		//boolean isPrime=true;
		int count=0;
		
		for(int i=1;i<=1;i++)
		{ 
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
			System.out.println(i);
			count++;
		}

	}
		System.out.println(count);

}
}
