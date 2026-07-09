class Solution {
    public void rotate(int[] nums, int k) {
          int n = nums.length;
        k = k % n;

        int[] ans = new int[n];
        int index = 0;

        // Copy last k elements
        for (int i = n - k; i < n; i++) {
            ans[index++] = nums[i];
        }

        // Copy remaining elements
        for (int i = 0; i < n - k; i++) {
            ans[index++] = nums[i];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }
    }
}