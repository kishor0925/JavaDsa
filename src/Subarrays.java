import java.util.Scanner;

public class Subarrays 

{

  public static void main(String[] args)
  {
	  Scanner sc  = new Scanner(System.in);
	  int n = sc.nextInt();
	  int[] arr = new int[n];
	  for(int i = 0 ; i < arr.length; i++)
	  {
		  arr[i] = sc.nextInt();
	  }
	  int k = sc.nextInt();
	 
	  
	  printLongestSubarrays(arr, k);
  }
  
	public static void printLongestSubarrays(int[] arr, int k) 
	{
		for(int size = arr.length; size >=  1; size--)
		{
			for (int i = 0; i <= arr.length-size; i++) 
			{
				int sum = 0;
				for (int j = i; j < i + size; j++) 
				{
				  	sum += arr[j];
				}
				if(sum == k)
				{
					for (int j = i; j < i + size; j++)
					{
					  System.out.print(arr[j]+" ");
					  
					}
					return;
				}
				
			}
		}
	
	   
    }







	public static void printAllSubarrayslengthisK(int[] arr, int k) 
	{
		int c = 0; 
		for (int size = 0; size <= arr.length; size++) {
			
			for (int i = 0; i <= arr.length - size; i++) 
			{
				int sum = 0;
				
				for (int j = i; j < i + size; j++) 
				{
					sum += arr[j];
				}
				if(sum == k)
				{
					for (int j = i; j < i +size; j++) 
					{
					     System.out.print(arr[j]+" ");	
					}
					System.out.println();
				}
			}
			
		}
    }







	public static void printAllSubarraysSumisK(int[] arr, int k) 
	{
	
	  int c = 0;
	  for(int size = 1; size <= arr.length; size++)
	  {
		  for(int i = 0; i <= arr.length - size; i++)
		  {
			  int sum = 0;
			  for(int j = i; j < i + size; j++)
			  {
				  sum += arr[j];
			  }
			  if(sum == k)
			  {
				  for(int  j = i; j <= arr.length - size; j++)
				  {
					  System.out.print(arr[j]);
				  }
				  System.out.println();
			  }

		  }
	  }
    }







public static void printAllSubarraysCountisK(int[] arr, int k) 
	{
		int count = 0;
		for(int size = 1; size <= arr.length; size++)
		{
			for(int i = 0; i <= arr.length - size; i++)
			{
				int sum = 0;
				for(int j = i; j < i +size; j++)
				{
					sum += arr[j];
				}
				if(sum == k)
				{
					count++;
				}
				
			}
		}
		System.out.println(count);
	
	
    }







	public static void printAllSubarrays(int[] arr) 
	{
	
		 for(int size  = 1; size <= arr.length; size++)
		 {
			 for(int i = 0; i <= arr.length - size; i++)
			 {
				 for(int j = i; j < i + size; j++)
				 {
					 System.out.print(arr[j]+" ");
				 }
				 System.out.println();
			 }
		 }
    }



	public static void printSubbarrayofsum(int[] arr, int k, int sum) 
	{
		
		for(int i = 0; i <= arr.length - k; i++)
		{
			int sum1= 0;
			for(int j = i; j < i + k; j++)
			{
				sum1 += arr[j];	
			}
			if(sum1 == sum)
			{
				for(int j = i; j < i + k; j++)
				{
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
		
		
	}



	public static void Subarraysoflength(int[] arr, int k) 
	{
	   
		for(int i = 0; i <= arr.length - k ; i++)
		{
			for(int j = i; j < i + k; j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			
		}
	}
	public static void CountSubbarraylength(int[] arr , int k)
	{
		
	  for(int i = 0; i <= arr.length - k; i++)
	  {
		  int sum = 0;
		  for(int  j = i; j < i + k ; j++)
		  {
			 sum += arr[j];  
		  }
		  System.out.println(sum);
		
	  }
	}
	public static void CountofSubbarraylength(int[] arr , int k, int sum)
	{
	  int c = 0;
	  for(int i = 0; i <= arr.length - k; i++)
	  {
		  int sum1 = 0;
		  for(int j = i; j < i + k; j++)
		  {
			  sum1 += arr[j];
		  }
		  if(sum1 == sum)
		  {
			  c++;
		  }
	  }
	  System.out.print(c);
	}
}
