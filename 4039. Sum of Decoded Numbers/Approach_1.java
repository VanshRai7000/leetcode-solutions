
class Solution {
    static final long mod = 1000000007L;

    private long BinaryPower(long x, long y) {
        if (y == 0)
            return 1;
        long half = BinaryPower(x, y / 2);
        long res = (half * half) % mod;
        if (y % 2 != 0) {
            res = (res * x) % mod;
        }
        return res;
    }

    long getX(long d, long w) {
        String str = String.valueOf(d);
        String sub = str.substring(0, (int) w);
        long num = Long.parseLong(sub);
        return num;
    }

    long getY(long d, long w) {
        String str = String.valueOf(d);
        String sub = str.substring((int) w);
        long num = Long.parseLong(sub);
        return num;
    }

    public int sumDecoded(long[] nums) {
        long ans = 0;

        for (int i = 0; i < nums.length; i++) {
            long width = nums[i] % 10;
            long d = nums[i] / 10;
            long x = getX(d, width);
            long y = getY(d, width);
            long temp = BinaryPower(x, y);
            ans = (ans + temp) % mod;
        }
        return (int) ans;
    }
}