class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }

        int prefix[] = new int[n];
        int suffix[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                prefix[i] = 0;
            } else if (i == 1) {
                prefix[i] = nums[i-1];
            } else {
                prefix[i] = nums[i - 1] + prefix[i - 1];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                suffix[i] = 0;
            } else if (i == n - 2) {
                suffix[i] = nums[i + 1];
            } else {
                suffix[i] = nums[i + 1] + suffix[i + 1];
            }
        }

        for (int i = 0; i < n; i++) {
            if (prefix[i] == suffix[i]) {
                System.out.println(prefix[i]);
                return i;
            }
        }
        return -1;
    }
}