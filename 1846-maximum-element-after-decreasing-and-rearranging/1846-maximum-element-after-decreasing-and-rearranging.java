class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);

        // First element must be 1
        arr[0] = 1;

        // Adjust each element
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }

        // Maximum element
        return arr[arr.length - 1];
    }
}