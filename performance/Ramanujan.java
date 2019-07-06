/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Ramanujan {
    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        int count = 0;
        double max =  Math.ceil(Math.pow(n, 1.0/3));
        StdOut.println("max is:" + max);


        return count == 2;
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        //  n = Integer.parseInt(args[0]);
        long n = 1729;
        StdOut.println(isRamanujan(n));
        n = 3458;
        StdOut.println(isRamanujan(n));
        n = 4104;
        StdOut.println(isRamanujan(n));
        n = 216125;
        StdOut.println(isRamanujan(n));
        // n = 9223278330318728221L;
        // StdOut.println(isRamanujan(n));
    }
}
