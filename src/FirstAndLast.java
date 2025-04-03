import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
        int[] res1 = FirstandLast(arr, key);

        for (int num : res1) {
            System.out.print(num + " ");
        }
    }

    public static int[] FirstandLast(int[] arr, int key) {
        int[] res = {-1, -1};    
        int l = 0, mid, r = arr.length - 1;

       
        while (l <= r) {
            mid = (l + r) / 2;
            if (key == arr[mid]) {
                res[0] = mid;
                r = mid - 1; 
            } else if (key < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        l = 0;
        r = arr.length - 1;

       
        while (l <= r) {
            mid = (l + r) / 2;
            if (key == arr[mid]) {
                res[1] = mid;
                l = mid + 1; 
            } else if (key < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
    }
}
