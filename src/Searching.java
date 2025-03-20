import java.util.Scanner;

public class Searching 
{
	
   public  static void main(String[] args)
   {
   Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for (int i = 0; i < arr.length; i++) 
	{
		arr[i] = sc.nextInt();
	}
	int k = sc.nextInt();
	
	binarySearch(arr, k);
   }
   
   public static void linearSearch(int[] arr, int key)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == key)
			{
				System.out.print(i+" ");
			}
		}
		
	}
   
   public static void binarySearch(int[] arr, int k) 
   {
	   int low = 0, high = arr.length - 1, mid = 0;
	   
	   while(low <= high)
	   {
		   mid = (low + high)/2;
		   if(k == arr[mid])
		   {
			   System.out.print(mid);
			   return;
			   
		   }
		   else if(k < arr[mid])
		   {
			   high = mid - 1;
			   
		   }
		   else
		   {
			   low = mid + 1;
		   }
		   
	   }
	
   }
}


