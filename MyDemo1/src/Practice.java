import java.util.Arrays;

//import java.util.Arrays;

public class Practice {
	public static void main(String args[])
	{
		
		int arr[]= {1,2,3,4,5,6,7};
		
		//*****************Occurance*********************
		/*int counter=0;
		int found=1;
		for(int i=0;i<arr.length;i++)
		{
			counter=1;
			found=0;	
			for(int j=0;j<arr.length;j++)
			{
				if(j>=i)
				{
					if(arr[i]==arr[j]&&j!=i)
					{
						counter++;
					}
				}
				else if(arr[i]==arr[j])
				{
					found=1;
					break;
				}
			}
			if(found!=1)
			{
				System.out.println(arr[i]+"found"+counter+"times");
			}
		}
		System.out.println("out of loop");*/
		////*************alternate array printing*****************
		/*int arr1[]=new int[arr.length];
		int temp = 0;
		for(int i=0;i<arr.length;i++)
		{
		//		temp=arr[arr.length-1];
			if(i%2==0)
			{
				temp=arr[arr.length-1];
				for(int j=arr.length-2;j>=i;j--)
				{
					arr[j+1]=arr[j];
				}
				arr[i]=temp;
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		//*********missing number in array*****************
		int sum=(arr.length*(arr.length+1))/2;
		System.out.println(sum);
		//int newsum=0;
		for(int i=0;i<arr.length-1;i++)
		{
			sum=sum-arr[i];
		}
		System.out.println(sum);
		
		//********prime no. 1 to 100**************
		//boolean isPrime=true;
		/*for(int i=2;i<=100;i++)
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
				System.out.print(i+" ");
			}
		}
		System.out.println("Prime");*/
		String s1="abc";
		String s2="bcd";
		int a=s1.compareTo(s2);
		System.out.println(s1.equals(s2));
	}

}
