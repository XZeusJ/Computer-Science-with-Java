/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Inversions {
    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        int len = a.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > a[j]) count++;
            }
        }
        return count;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] a = new int[n];
        int eachN = n;
        int i = 0;
        while (k > n) {
            eachN -= 1;
            a[i] = eachN;
            k -= eachN;
            i++;
        }

        return a;
    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        // int n = Integer.parseInt(args[0]);
        // int k = Integer.parseInt(args[1]);

        // generate(n, k);

        // test count
        int[] a = {9,8,0,1,2,3,7,4,5,6};
        StdOut.println(count(a));
    }
}
