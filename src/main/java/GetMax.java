public class GetMax {
    /**
     * Returns the maximum value in the given array.
     *
     * @param arr an array of integers.
     * @return the largest value in arr.
     */
    public int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int max = arr[0]; // Assume the first element is the maximum initially.

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger value is found.
            }
        }

        return max;
    }
}