package Arrays;

public class rotatedArray 
{
	//searching in sorted rotated array
	//array -> {50,100,10,20,30,35,40} target -> 20
	//brute force ->compare each value with target loop
	public static int search(int[] num, int target)
	{
		int start = 0, end = num.length-1;
		int mid = (start+end)/2;
		while(start <= end)
		{
			mid = (start+end)/2;
			if(target == num[mid])
			{
				return mid;
			}
			if(num[start]<=num[mid])
			{
				if(num[start]<=target && num[mid]>=target)
				{
					end = mid-1;
					
				}
				else
				{
					start = mid+1; 
				}
			}
			else
			{
				if(num[end]>=target && num[mid]<=target)
				{
					start = mid+1;
					
				}
				else
				{
					end = mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int a[]= {50,100,10,35,40,20,30};
		int t=35;
		System.out.println("The position of searched number is:"+search(a,t));
		
		}
}
