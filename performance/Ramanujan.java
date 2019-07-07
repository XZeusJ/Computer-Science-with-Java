/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Ramanujan {
    // Is n a Ramanujan number?
    // public static boolean isRamanujan(long n) {
    //     int count = 0;
    //     double max =  Math.ceil(Math.cbrt(n));
    //     // StdOut.println("max "+max);
    //
    //     for (int a = 1; a <= max; a++) {
    //         int a3 = a*a*a;
    //         for (int b = a+1; b <= max; b++) {
    //             int b3 = b*b*b;
    //             if ( a3 + b3 == n) count++;
    //         }
    //     }
    //     return count == 2;
    // }

    public static boolean isRamanujan(long n) {
        int count = 0;
        double max = Math.ceil(Math.cbrt(n));
        // StdOut.println("max "+max);

        for (int a = 1; a <= max; a++) {
            int a3 = a * a * a;
            int lo = a + 1;
            int hi = (int) max;

            int i = 0;
            while (lo <= hi && i < 6) {
                int mid = lo + (hi - lo) / 2;
                int mid3 = mid * mid * mid;
                StdOut.println("lo mid hi -> " + lo + " " + mid + " " + hi);
                StdOut.println("a3+mid3 n -> " + (a3 + mid3) + " " + n);
                if (a3 + mid3 < n) lo = mid + 1;
                else if (a3 + mid3 > n) hi = mid + 1;
                else {
                    StdOut.println("is equal");
                    count++;
                    break;
                }
                i++;
            }
            StdOut.println();
        }
        return count == 2;
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        // long n = Long.parseLong(args[0]);
        long n = 1729;
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
