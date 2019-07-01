/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class TrinomialDP {
    // Returns the trinomial coefficient T(n, k).

    public static long trinomial(long[][] dp, int n, int k) {
        // using property of trinomial triangle
        if (k < 0) k = -k;
        // if value aready calculated, return that.
        if (dp[n][k] != 0) return dp[n][k];

        // base case
        if (n == 0 && k == 0) return 1;
        if (k < -n || k > n) return 0;

        // recursive step and storing the value
        dp[n][k] = trinomial(dp, n - 1, k - 1) + trinomial(dp, n - 1, k) + trinomial(dp, n - 1, k + 1);
        return dp[n][k];
    }
    // Takes two integer command-line arguments n and k and prints T(n, k).

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        long[][] dp = new long[100][100];
        StdOut.println(trinomial(dp, n, k));
    }
}
