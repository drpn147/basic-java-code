import java.util.Arrays;
public class demo {
	int partition(int array[],int low,int high)
	{
		
		int pivot=array[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(array[j]<=pivot)
			{
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
		int temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		return(i+1);
	}
	void quicksort(int array[],int low,int high)
	{
		if(low<high)
		{
			int pi=partition(array,low,high);
			quicksort(array,low,pi-1);
			quicksort(array,pi+1,high);
		}
	}
public static void main(String arg[])
{
	int data[]= {23,106,33,5,87,78,98,89};
	int len=data.length-1;
	demo d= new demo();
	d.quicksort(data,0,len);
	System.out.print(Arrays.toString(data));
	}
}
