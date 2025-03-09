import java.util.*;
public class SortedArrays {

	public static void OccurrenceofEach(int[] arr)
	{
		int count =  1;
		for(int i = 0; i < arr.length - 1; i++)
		{
				if(arr[i] == arr[i +1])
				{
					count++;
				}
				else
				{
					System.out.println(arr[i]+" - "+count);
					count = 1;
				}
			
		}
		if(count >= 1)
		{
			System.out.println(arr[arr.length - 1]+" - "+count);
		}
		
		
				
		
	}
	public static void WithoutRepeating(int[] arr)
	{
		
		for(int i = 0; i < arr.length - 1; i++)
		{
				if(arr[i] != arr[i +1])
				{
					System.out.print(arr[i]+" ");
				}
		}
		System.out.print(arr[arr.length - 1]+" ");
		
		
	}
	public static void UniqueElements(int[] arr)
	{
		
		int count =  1;
		for(int i = 0; i < arr.length - 1; i++)
		{
				if(arr[i] == arr[i +1])
				{
					count++;
				}
				else	
				{
					if(count == 1)
					{
					System.out.println(arr[i]+" ");
					}
					count = 1;
				}
			
		}
		if(count == 1)
		{
			System.out.println(arr[arr.length - 1]+"  ");
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
		 UniqueElements(arr);
		
	}

}
