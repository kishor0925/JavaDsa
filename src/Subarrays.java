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
	  int k =sc.nextInt();
	  int sum = sc.nextInt();
	  
	  printSubbarrayofsum(arr, k, sum);
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
