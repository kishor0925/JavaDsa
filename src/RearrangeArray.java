import java.util.Scanner;

public class RearrangeArray 
{
  public static void main(String[] args)
  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
		arr[i] = sc.nextInt();
	    }
		
		RearrangZerovalueaEnd(arr);
  }


  public static void RearrangeNegativevalueatfirst(int[] arr) 
  {
	  int i = arr.length - 1, j = arr.length - 1;
	  
	  while(i >= 0)
	  {
		  if(arr[i] == -1)
		  {
			  i--;
		  }
		  else
		  {
			  arr[j] = arr[i];
			  j--;
			  i--;
		  }
	  }
	  while(j >= 0)
	  {
		  arr[j] = -1;
		  j--;
	  }
	  
	  for(int nums : arr)
	  {
		  System.out.print(nums+" ");
	  }
	  
  }
  
  public static void RearrangZerovalueaEnd(int[] arr) 
  {
	  int i = 0, j = 0;
	  
	  while(i < arr.length)
	  {
		  if(arr[i] == 0)
		  {
			  i++;
		  }
		  else
		  {
			  arr[j] = arr[i];
			  j++;
			  i++;
		  }
	  }
	  while(j < arr.length)
	  {
		  arr[j] = 0;
		  j++;
	  }
	  
	  for(int nums : arr)
	  {
		  System.out.print(nums+" ");
	  }
	  
  }

	public static void MissingElement(int[] arr)
	{
	   int n = arr.length + 1;
	   int sum1 = n*(n+1)/2;
	   int sum2 = 0;
	   
	   for(int i = 0; i < arr.length; i++)
	   {
		   sum2 += arr[i];
	   }
	   
	   System.out.println(sum1-sum2);
		
	}
}
