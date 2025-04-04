public class woodCutting {
    public static long findWoodCollected(int[] heights, long cutHeight) {
        long wood = 0;
        for (int height : heights) {
            if (height > cutHeight) {
                wood += height - cutHeight;
            }
        }
        return wood;
    }

    public int solve(int[] heights, int requiredWood) {
        int max = 0;
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }

        long low = 0, high = max, answer = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long woodCollected = findWoodCollected(heights, mid);

            if (woodCollected >= requiredWood) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int)answer;
    }
}
