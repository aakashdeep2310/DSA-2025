class Solution {
    public int fib(int n) {
        if(n<=1) return n;

        // int dp[] = new int[n+1];

        // dp[0] = 0;
        // dp[1] = 1;

        // for(int state = 2; state<=n; state++){
        //     dp[state] = dp[state-1] + dp[state-2]; 
        // }
        // return dp[n];

        // approach to save memory
        int prev2 = 0;
        int prev1 = 1;
        int ans = 0;

        for(int state = 2; state <= n; state++){
            ans = prev1 + prev2;
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }
}
