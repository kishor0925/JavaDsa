import java.util.Scanner;

public class ConsecutiveSubarraytwo 
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		LongestSortedSubarrays(arr);
    }

	public static void LongestSortedSubarrays(int[] arr)
	{
		int c = 1;
		int max = 0, si = 0, ei = 0;
	  	for(int i = 0; i < arr.length - 1; i++)
	  	{
	  		if(arr[i]  < arr[i + 1])
	  		{
				c++;
	  		}
	  		else
	  		{
	  			if(c > max)
	  		  	{
	  		  		max = c;
	  		  		ei = i;
	  		  	}
				c = 1;
	  		}
	  	}
	  	
	  	if(c > max)
	  	{
	  		max = c;
	  		ei = arr.length - 1;
	  	}
	  	
	  	si = ei - max + 1;
	  	
	  	for(int i = si; i <= ei; i++)
	  	{
	  		System.out.print(arr[i]+" ");
	  	}
	}

	public static void LongestConsecutiveSubarrays(int[] arr) 
	{
		
		
		int c = 1, max = 0, ei = 0, si = 0;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i + 1] - arr[i] == 1)
			{
				c++;
			}
			else
			{
				if(c > max)
				{
					max = c;
					ei = i;
					
				}
				c = 1;
			}
		}
		if(c > max)
		{
			max = c;
			ei = arr.length - 1;
			
		}
		
		si = ei - max + 1;
		
		for (int i = si; i <= ei; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
	}
    
}
