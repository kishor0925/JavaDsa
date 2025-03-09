import java.util.Scanner;

public class MultipleArrays {

	public static void main(String[] args) 
	{
	   
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] ar = new int[n];	
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]  = sc.nextInt();
		}
		
		int n1 = sc.nextInt();
		int[] ar1 = new int[n1];	
		for (int i = 0; i < ar1.length; i++) 
		{
			ar1[i]  = sc.nextInt();
		}
		
		printCommonElements(ar, ar1);

	}

	public static void printCommonElements(int[] ar, int[] ar1) 
	{
	   	int i = 0 , j = 0;
	   	
	   	while(i < ar.length && j < ar1.length)
	   	{
	   		if(ar[i] == ar1[j])
	   		{
	   			System.out.print(ar[i]+" ");
	   			i++;
	   			j++;
	   		}
	   		else if(ar[i] > ar1[j])
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

