/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class MaximumSquareSubmatrix {

    // Returns the size of the largest contiguous square submatrix
    // of a[][] containing only 1s.
    public static int size(int[][] m) {
        int R = m.length;
        int C = m[0].length;
        int[][] s = new int[R][C];

        // set first column of s[][]
        for (int i = 0; i < R; i++) {
            s[i][0] = m[i][0];
        }

        // set first row of s[][]
        for (int j = 0; j < C; j++) {
            s[0][j] = m[0][j];
        }

        // construct other entries of s[][]
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (m[i][j] == 1)
                    s[i][j] = Math.min(s[i][j - 1], Math.min(s[i - 1][j], s[i - 1][j - 1])) + 1;
                else s[i][j] = 0;
            }
        }

        // find the maxmium
        int max_of_s = s[0][0];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (max_of_s < s[i][j]) max_of_s = s[i][j];
            }
        }

        return max_of_s;
    }

    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest contiguous square submatrix
    // containing only 1s.
    public static void main(String[] args) {
        int n = StdIn.readInt();

        // init matrix
        int[][] m = new int[n][n];
        while (!StdIn.isEmpty()) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    m[i][j] = StdIn.readInt();
                }
            }
        }

        // test
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         StdOut.print(m[i][j] + " ");
        //     }
        //     StdOut.println();
        // }

        StdOut.println(size(m));


    }
}
