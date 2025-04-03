import java.util.Scanner;

public class ceilAndfloor {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		System.out.println("ceil : " +ceil(arr, k));
		System.out.println("floor : " +floor(arr, k));
		
	}
	
	static int ceil(int[] arr, int key)
	{
		
		int l = 0, r = arr.length - 1, mid = 0;
		while(l <= r)
		{
			mid = (l + r)/2;
			if(arr[mid] == key)
			{
				return mid;
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
		
		return  (l < arr.length)? arr[l] : -1 ;
	}
	
	static int floor(int[] arr, int key)
	{
		int l = 0, r = arr.length - 1, mid = 0;
		
		while(l <= r)
		{
			mid = (l + r)/ 2;
			if(arr[mid] == key)
			{
				return mid;
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
		return(r >= 0) ? arr[r] : -1 ;
	}
}
