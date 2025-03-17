import java.util.Scanner;

public class ConsecutiveSubarrays 
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
		
		ConsecutiveElementsPrintLongestCount(arr);
	 }

	public static void ConsecutiveElementsPrintLongestCount(int[] arr)
	{
	   		int max = 0;
	   		int count = 1;
	   		
	   		for(int i = 0; i < arr.length - 1; i++)
	   		{
	   			if(arr[i + 1] - arr[i] == 1)
	   			{
	   				count++;
	   			}
	   			else
	   			{
	   				if(count > max)
	   				{
	   					max = count;	
	   				}
	   				count = 1;
	   			}
	   		}
	   		if(count > max)
	   		{
	   			max = count;
	   		}
	   		System.out.println(max);
	}

	public static void ConsecutiveElementsCount(int[] arr) 
	{
		int count = 1;
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i + 1] - arr[i] == 1)
			{
				count++;
			}
			else
			{
				System.out.println(count);
				count = 1;
			}
		}
		System.out.println(count);
	}

	public static void ConsecutiveElements(int[] arr) 
	{
	   for(int i = 0; i < arr.length - 1; i++)
	   {
		   if(arr[i + 1] - arr[i] == 1)
		   {
			   System.out.print(arr[i]+" ");
		   }
		   else
		   {
			   System.out.print(arr[i]+" ");
			   System.out.println();
		   }
	   }
	   System.out.println(arr[arr.length - 1]);
	}
}
