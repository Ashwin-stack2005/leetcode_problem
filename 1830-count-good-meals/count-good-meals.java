class Solution {
    private static final int Q = 1000000007;
    public int countPairs(int[] deliciousness) {
        int n = deliciousness.length, i, j, x, y;
        if (n <= 1) {
            return 0;
        }

        Arrays.sort(deliciousness);
        long[] dp = new long[n];
        var cache = new HashMap<Integer, Integer>();
        cache.put(deliciousness[0], 1);
        
        for (i = 1; i < n; ++i) {
            x = deliciousness[i];
            dp[i] = dp[i - 1];
            if (x == 0) {
                dp[i] = 0;
            } else {
                y = powerOf2(x) ? x << 1 : 1 << (int) Math.ceil(Math.log(x) / Math.log(2));
                
                for ( ; y >= x; y >>= 1) {
                    dp[i] += cache.getOrDefault(y - x, 0) % Q;
                    dp[i] %= Q;
                }
            }
            cache.put(x, cache.getOrDefault(x, 0) + 1);
        }
        return (int) dp[n - 1];
    }

    private boolean powerOf2 (int x) {
        return x == 0 || (x & (x - 1)) == 0;
    }

}