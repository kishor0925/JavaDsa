import java.util.*;

public class ArraysOperations{
    
    public static void findMissingNumber(int[] arr) {
        int n = arr.length + 1; 

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int actualSum = 0;

        	
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            actualSum += num;
        }

        
        int expectedSum = (max * (max + 1) / 2) - ((min - 1) * min / 2);

        
        System.out.println(expectedSum - actualSum);
    }
     
    
    
public static void ArrayRotation(int[] arr, int n)
{
    	int min = Integer.MAX_VALUE;
    	int max= Integer.MIN_VALUE;
    	
    	for(int i = 0; i < arr.length; i++)
    	{
    		int rotated = 0;
    		for(int j = 1; j < arr.length; j++)
    		{
    			int value = arr[(i + j)% n];
    			rotated += value;
    			
    		}
    		min = Math.min(min, rotated);
    		max = Math.max(max, rotated);
    	}
    	
    	System.out.println(min);
    	System.out.println(max);
    	
    	
    }
    
    public static void Countk(int[] arr , int k)
    {
    	int c = 0;
    	for(int i = 0; i < arr.length; i++)
    	{
    		if(arr[i] == k)
    		{
    			c++;
    		}
    		
    	}
    	System.out.println(c);
    	
    	
    }
    
    public static void indexk(int[] arr , int k)
    {
    	int c = 0;
    	boolean f = false;
    	for(int i = 0; i < arr.length; i++)
    	{
    		if(arr[i] == k)
    		{
    		    c = i;
    		    f = true;
    		}
    		
    	}
    	if(f)
    	{    		
    		System.out.println(c);
    	}
    	else
    	{
    		System.out.println(-1);
    	}
    	
    	
    }
    
    public static int max(int[] arr)
    {
    	
    	int max = Integer.MIN_VALUE;
    	for(int i = 0; i < arr.length; i++)
    	{
    		if(arr[i] > max)
    		{
    			max = arr[i];
    		}
    	}
    	return max;
    }

    public static int min(int[] arr)
    {
    	
    	int min = Integer.MAX_VALUE;
    	for(int i = 0; i < arr.length; i++)
    	{
    		if(arr[i] < min)
    		{
    			min = arr[i];
    		}
    	}
    	return min;
    }
    public static int sum(int[] arr)
    {
    	
    	int sum = 0;
    	for(int i = 0; i < arr.length; i++)
    	{
    		sum += arr[i];
    	}
    	return sum;
    }
    public static int[] product(int[] arr)
    {
    	
    	int product = 1;
    	int[] res = new int[arr.length];
    	
    	for(int i = 0; i < arr.length; i++)
    	{
    		product *= arr[i];
    	}
    	
    	
    	for(int i = 0; i < arr.length; i++)
    	{
    		res[i] = product/arr[i];
    	}
    	return res;

    	
    }
    
    public static void SecondLargest(int[] arr) 
    {
        for (int i = arr.length - 2; i >= 0; i--) 
        {
            if (arr[i] < arr[arr.length - 1]) 
            { 
                System.out.println(arr[i]); 
                return; 
            }
        }
        System.out.println("No second largest element found"); 
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n]; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        Arrays.sort(arr); 
        findMissingNumber(arr); 
        
    
              
    }


}
