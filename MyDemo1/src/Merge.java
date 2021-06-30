import java.util.Arrays;

public class Merge {
void merge(int a[],int lb,int ub)
{
	int mid=0;
	if(lb<ub)
	{
		mid=(lb+ub)/2;
		merge(a,lb,mid);
		merge(a,mid+1,ub);
		mergesort(a,lb,mid,ub);
	}
}

 void mergesort(int a[],int lb,int mid,int ub)
{
	int i=lb;
	int j=mid+1;
	int k=lb;
	int b[]=new int[ub];
	while(i<=mid&&j<=ub)
	{
		if(a[i]<=a[j])
		{
			b[k]=a[i];
			i++;
		}
		else
		{
			b[k]=a[j];
			j++;
		}
		k++;
	}
	
	if(i>mid)
	{
		while(j<=ub)
		{
			b[k]=a[j];
			j++;
			k++;
		}
	}
	else
	{
		while(i>=mid)
		{
			b[k]=a[i];
			i++;
			k++;
		}
	}
	
	for(int s=lb;i<=ub;i++)
	{
		a[s]=b[s];
	}
	//System.out.print(Arrays.toString(a));
}
	public static void main(String[] args) {
		int arr[]= {2,1,5,3,9};
		Merge m=new Merge();
		int len=arr.length-1;
		m.merge(arr,0,len);
		System.out.print(Arrays.toString(arr));
	}

}
