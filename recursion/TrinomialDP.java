/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class TrinomialDP {
    public static long trinomial(int n, int k) {
        long[][] dp = new long[200][200];
        return trinomial(dp, n, k);
    }

    // private static long[][] resize(long[][] dp) {
    //     long[][] temp = new long[dp.length][dp[0].length];
    //     for (int i = 0; i < dp.length; i++) {
    //         for (int j = 0; j < dp[0].length; j++) {
    //             temp[i][j] = dp[i][j];
    //         }
    //     }
    //     return temp;
    // }

    // Returns the trinomial coefficient T(n, k).
    private static long trinomial(long[][] dp, int n, int k) {
        // using property of trinomial triangle
        if (k < 0) k = -k;
        // if value aready calculated, return that.
        if (dp[n][k] != 0) return dp[n][k];

        // base case
        if (n == 0 && k == 0) return 1;
        if (k < -n || k > n) return 0;

        // recursive step and storing the value
        dp[n][k] = trinomial(dp, n - 1, k - 1) + trinomial(dp, n - 1, k) + trinomial(dp, n - 1,
                                                                                     k + 1);
        return dp[n][k];
    }
    // Takes two integer command-line arguments n and k and prints T(n, k).

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
    }
}
