
public class RotatedSortedArray 
{
   public static int search(int[] arr, int target)
   {
	   int l = 0, mid, high = arr.length - 1;
	   
	   while(l <= high)
	   {
		   mid = (l + high)/2;
		   
		   if(target == arr[mid])
		   {
			   return mid;
		   }
		   else if(arr[l] <= arr[mid]) {   
			   if(arr[l] <= target && arr[mid] < target) 
			   {
				   high = mid - 1;
			   }
			   else
			   {
				   l = mid + 1;
			   }
		   }
		   else
		   {
			   if(target > arr[mid] && target <= arr[high])
			   {
				   l = mid + 1;
			   }
			   else
			   {
				   high = mid - 1;
			   }
		   }
	   }
	   return -1;
   }
}
