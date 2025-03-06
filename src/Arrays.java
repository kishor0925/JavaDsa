import java.util.Scanner;

public class Arrays {
    
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayRotation(arr, n);
    }
}
