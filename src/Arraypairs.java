import java.util.*;
public class Arraypairs 
{
   public static void LargestPair(int[] arr)
   {

	  	   
	   int largest =  arr[arr.length - 1];
	   int secondlargest = arr[arr.length - 2];
	   
	   int smallest = arr[0];
	   int secondsmallest = arr[1];
	   
	  int p1 = largest * secondlargest;
	  int p2 = smallest * secondsmallest;
	  int p3 = largest * smallest;
	  
	  System.out.println(Math.max(p1,Math.max(p2 , p3)));
	   
	  
	   
   }
   
   public static void SmallestPair(int[] arr)
   {

	  	   
	   int largest =  arr[arr.length - 1];
	   int secondlargest = arr[arr.length - 2];
	   
	   int smallest = arr[0];
	   int secondsmallest = arr[1];
	   
   	   int p1 = largest * secondlargest;
       int p2 = smallest * secondsmallest;
       int p3 = largest * smallest;
       
       
	   System.out.println(Math.min(p1 ,Math.min(p2, p3)));
	  
	   
   }
   public static void ArraysPair(int[] arr)
   {
	   for(int i = 0; i < arr.length - 1; i++)
	   {
		   for(int j = i + 1; j < arr.length; j++)
		   {
			   System.out.println(arr[i]+" "+arr[j]);
		   }
	   }
   }
   
   
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   
	   int[] arr = new int[n];
	   
	   for(int  i = 0; i < arr.length; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
//	   Arrays.sort(arr);
	   
	   ArraysPair(arr);
	   
   }
}
