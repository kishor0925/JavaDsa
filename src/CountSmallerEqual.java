import java.util.*;
public class CountSmallerEqual {
	
	static int CountSmallEqualElements(int[] arr, int key)
	{
		int l = 0, r = arr.length - 1, mid = 0;
		while(l <= r)
		{
			mid = (l + r)/2;
			if(key == arr[mid])
			{
				while(mid + 1 < arr.length && arr[mid + 1] == key)
				{
					mid++;
				}
				break;
			}
			else if(key < arr[mid])
			{
				r = mid - 1;
			}
			else
			{
				l = mid + 1;
			}
		}
		
		
		if(arr[mid] > key)
		{
		    return mid;
		}
		else
		{
			return mid + 1;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		
		System.out.println(CountSmallEqualElements(arr, key));
	}

}
