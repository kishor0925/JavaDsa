import java.util.Scanner;

public class MultipleArrays {

	public static void main(String[] args) 
	{
	   
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr1 = new int[n];	
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i]  = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] arr2 = new int[m];	
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i]  = sc.nextInt();
		}
	     
		int l = sc.nextInt();
		int[] arr3 = new int[l];	
		for (int i = 0; i < arr3.length; i++) 
		{
			arr3[i]  = sc.nextInt();
		}
	     
		MergeThreeArrays(arr1, arr2, arr3);

	}

	public static void MergeThreeArrays(int[] arr1, int[] arr2, int[] arr3)
	{
	   int[] res = new int[arr1.length+arr2.length+arr3.length];
	   int k = 0, i = 0;
	   while(i < res.length)
	   {
		   if(i < arr1.length)
		   {
			   System.out.print(arr1[i]+" ");
		   }
		   if(i < arr2.length)
		   {
			   System.out.print(arr2[i]+" ");
		   }
		   if(i < arr3.length)
		   {
			   System.out.print(arr3[i]+" ");
		   }
		   i++;
	   }
		
	}

	public static void MergeArrays(int[] arr1, int[] arr2) 
	{
		int i = 0, j = 0, k = 0;
		int[] res = new int[arr1.length + arr2.length];
		
		while(i < arr1.length && j < arr2.length)
		{
			if(arr2[j] <= arr1[i])
			{
				res[k++] = arr2[j++];
			}
			else if(arr2[j] > arr1[i])
			{
				res[k++] = arr1[i++];
			}
				
		}
		while(i < arr1.length)
		{
			res[k++] = arr1[i++];
		}
		while(j < arr2.length)
		{
			res[k++] = arr2[j++];
		}
		
		for(int z = 0; z < res.length; z++)
		{
			System.out.print(res[z]+" ");
		}
		
	}

	public static void CommonArraysElements(int[] arr1, int[] arr2) 
	{
		int i = 0, j = 0; 
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] == arr2[j])
			{
				System.out.print(arr1[i]+ " ");
				j++;
				i++;
			}
			else if(arr1[i] > arr2[j])
			{
				j++;
				
			}
			else
			{
				i++;
			}
		}
		
		
		
	}
	
	
	
}