
public class Pattern_Programming 
{
	public static void SquarePattern(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		*****
		*****
		*****
		*****
		*****
		*/		
	}
	
	public static void SquarePattern01(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		/*
		11111
		22222
		33333
		44444
		55555
		*/
		
	}
	public static void HollowSquarePattern01(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || j == 1 || i == n  || j == n )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*
		
		*****
		*   *
		*   *
		*   *
		*****

		*/
	}
	
	
	public static void SquarePattern02(int n)
	{
		int count = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(count < 10)
				{
					System.out.print(0);
				}
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
		
		/*
		01 02 03 04 05 
		06 07 08 09 10 
		11 12 13 14 15 
		16 17 18 19 20 
		21 22 23 24 25 

		*/
		
	}
	
	public static void SquarePattern03(int n)
	{
		
		for(int i = 1; i <= n; i++)
		{
			int count = i;
			for(int j = 1; j <= n; j++)
			{
			
			 System.out.print(count++ + " ");
			}
			System.out.println();
		}
		
		/*
		
		1 2 3 4 5 
		2 3 4 5 6 
		3 4 5 6 7 
		4 5 6 7 8 
		5 6 7 8 9 

		*/
		
	}
	
	public static void SquarePattern04(int n)
	{
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i * j < 10)
				{
					System.out.print(0);
				}
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		
		/*
		01 02 03 04 05 
		02 04 06 08 10 
		03 06 09 12 15 
		04 08 12 16 20 
		05 10 15 20 25 
		*/
		
	}
	
	
	public static void trianglePattern01(int n)
	{
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void trianglePattern02(int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int k = 0; k < (n - 1) - i; k++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		    *
		   **
		  ***
		 ****
		*****
	   */
	}
	public static void trianglePattern03(int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int k = 0; k < (n - 1) - i; k++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		/*
		     	* 
			   * * 
			  * * * 
			 * * * * 
			* * * * * 

		 */
	}
	public static void trianglePattern04(int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int k = 0; k < (n - 1) - i; k++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++)
			{
				if(j == 0|| i == n - 1 || j == i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
	}
	
	public static void trianglePattern05(int n)
	{
		for(int i = 0; i < n; i++)
		{
			
			for(int j = 0; j < (n - 1) - i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++)
			{
				if(k == 0 || k == i || i == n - 1)
				{
				System.out.print(k+1+" ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void trianglePattern06(int n)
	{
		for(int i = 0; i < n; i++)
		{
			int count = 1;
			for(int j = 0; j <= i; j++)
			{
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
	
	public static void trianglePattern07(int n)
	{
		for(int i = 0; i < n; i++)
		{
			int count = 1;
			for(int j = 0; j <= i; j++)
			{
				if(j == 0 || j == i || i == n - 1)
				{
					System.out.print(count++ +" ");
				}
				else
				{
					System.out.print("  ");
					count++;
				}
				
			}
			System.out.println();
		}
	}
	public static void trianglePattern08(int n)
	{
		
		for(int i = 1; i <= n; i++)
		{
			int count = i;
			for(int j = 1; j <= (n - i) + 1; j++)
			{
				
				if(j == 1 || i == 1 || j == (n - i)+1)
				{
					System.out.print(count++ +" ");
				}
				else
				{
					System.out.print("  ");
					count++;
				}
			}
			System.out.println();
			
		}
	}
	
	public static void trianglePattern09(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= (2*i) - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void trianglePattern10(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int k = 1; k <= (n - i); k++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (2*i) - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void trianglePattern11(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			int count = 1;
			for(int k = 1; k <= (n - i); k++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= (2*i) - 1; j++)
			{
				if(j < i)
				{
					System.out.print(count++);
				}
				else
				{
					System.out.print(count--);
				}
			}
			System.out.println();
		}
	}
	public static void trianglePattern12(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			int count = 1;
			
			for(int j = 1; j <= (2*i) - 1; j++)
			{
				if(j < i)
				{
					System.out.print(count++);
				}
				else
				{
					System.out.print(count--);
				}
			}
			System.out.println();
		}
	}
	
	public static void trianglePattern13(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			int count = (i*(i + 1))/2;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(count--);
				if(j < i )
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void trianglePattern14(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+1 + " ");
			}
			
			for(int j = 1; j <= n; j++)
			{
				System.out.print(i+" ");
			}
			
			if(i % 2 != 0)
			{
				System.out.print(i+1 + " ");
			}
			System.out.println();
		}
			
		
	}
	
	public static void trianglePattern15(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j ++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n - i; j ++)
			{
				System.out.print(n - i+" ");
			}
			System.out.println();
		}
			
		
	}
	
	
	public static void trianglePattern16(int n)
	{
		int ch = 65;
		for(int i = 1; i <= n; i++)
		{
			
			if(i % 2 == 0)
			{
				int chRev = (char)(ch + i - 1);
				for(int j = 1; j <= i; j++)
				{
					System.out.print((char)chRev--);
					ch++;
				}
				
			}
			else	
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print((char)ch++);
				}
				
			}
			System.out.println();
			
		}
			
		
	}
	public static void main(String[] args) 
	{
	 
	 int n = 5;
	 trianglePattern16(n);
      
	}

}
