/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Ramanujan {

    public static boolean isRamanujan(long n) {
        int count = 0;
        long max = (long) Math.ceil(Math.cbrt(n));
        // StdOut.println("max "+max);

        for (int a = 1; a <= max; a++) {
            long a3 = a * a * a;
            long lo = a + 1;
            long hi = max;

            while (lo <= hi) {
                long mid = lo + (hi - lo) / 2;
                long mid3 = mid * mid * mid;
                // StdOut.println("a3+mid3 n -> " + (a3 + mid3) + " " + n);
                // StdOut.println("lo mid hi -> " + lo + " " + mid + " " + hi);
                if (a3 + mid3 < n) lo = mid + 1;
                else if (a3 + mid3 > n) hi = mid - 1;
                else {
                    // StdOut.println("is equal");
                    count++;
                    break;
                }
            }
            // StdOut.println();
        }
        // StdOut.println(count);
        return count >= 2;
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        // long n = 1729;
        // long n = 6963472309248L;
        StdOut.println(isRamanujan(n));
        // n = 3458;
        // StdOut.println(isRamanujan(n));
        // n = 4104;
        // StdOut.println(isRamanujan(n));
        // n = 216125;
        // StdOut.println(isRamanujan(n));
        // n = 9223278330318728221L;
        // StdOut.println(isRamanujan(n));
    }
}
