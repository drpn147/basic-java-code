import java.util.Arrays;

public class Quick {
	int partition(int arr[],int lb,int ub)
	{
		/*---------------first element-------------------------
		int pivot=arr[lb];
		int start=lb;
		int end=ub;
		while(start<end)
		{
			while(arr[start]<pivot)
			{
				start++;
			}
			while(arr[end]>pivot)
			{
				end--;
			}
			if(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		int temp=arr[lb];
		arr[lb]=arr[end];
		arr[end]=temp;
		//System.out.print(Arrays.toString(arr));
		return end;*/
		
		//------------last element----------------------
		
		int pivot=arr[ub];
		int i=lb-1;
		for(int j=lb;j<=ub-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[ub];
		arr[ub]=temp;
		return (i+1);
	}
	void QuickSort(int arr[],int lb,int ub)
	{
		if(lb<ub)
		{
			int loc=partition(arr,lb,ub);
			//System.out.print(Arrays.toString(arr));
			QuickSort(arr,lb,loc-1);
			//System.out.print(Arrays.toString(arr));
			QuickSort(arr,loc+1,ub);
		}
	}
	public static void main(String args[])
	{
		Quick q=new Quick();
		int arr[]= {3,7,2,8,1};
		int len=arr.length-1;
		q.QuickSort(arr, 0, len);
		System.out.println(Arrays.toString(arr));
	}



}
