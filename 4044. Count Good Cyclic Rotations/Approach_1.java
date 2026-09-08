class Solution {
    public int countGoodRotations(int[] nums) {

        long sum = 0, firstHalf = 0;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length / 2; i++) {
            firstHalf += nums[i];
        }

        int r = nums.length, i = 0, k = nums.length / 2;
        int n = nums.length;

        while(r != 0) {

            if (firstHalf > sum - firstHalf) {
                cnt++;
            }

            firstHalf -= nums[i];
            firstHalf += nums[(i + k) % n];
            i++;
            r--;
        }
        return cnt;
    }
}