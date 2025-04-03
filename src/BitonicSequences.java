public class BitonicSequences {
    
    static int ascendingBinarySearch(int[] arr, int key, int range) {
        int l = 0, r = range, mid;
        
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    static int descendingBinarySearch(int[] arr, int key, int range) {
        int l = range, r = arr.length - 1, mid;
        
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {  
                l = mid + 1;  
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    static int findBitonicPoint(int[] arr) {
        int l = 0, r = arr.length - 1, mid;
        
        while (l <= r) {
            mid = (l + r) / 2;

            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                    return mid;
                } else if (arr[mid] > arr[mid - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                return (arr.length == 1 || arr[0] > arr[1]) ? 0 : arr.length - 1;
            }
        }
        return -1;
    }

    static int searchBitonic(int[] arr, int key, int BIndex) {
        if (key == arr[BIndex]) {
            return BIndex;
        }
        if (key > arr[BIndex]) {
            return -1;
        }

        int res1 = ascendingBinarySearch(arr, key, BIndex - 1); 
        if (res1 != -1) {
            return res1;
        }
        int res2 = descendingBinarySearch(arr, key, BIndex + 1); 
        if (res2 != -1) {
            return res2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 14, 16, 18, 15, 10, 5, 2};  
        int b = 12;

        int BIndex = findBitonicPoint(arr);

        System.out.println(searchBitonic(arr, b, BIndex));
    }
}
