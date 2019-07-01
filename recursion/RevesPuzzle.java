/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RevesPuzzle {
    // move n smallest discs from one pole to another, using the temp pole
    private static void hanoi(int n, char from, char to, char temp) {
        if (n == 0) return;
        hanoi(n-1, from, temp, to);
        StdOut.println("Move disc " + n + " from " + from + " to " + to);
        hanoi(n-1, temp, to, from);
    }

    private static void towerOfHanoi(int n, char from, char to, char temp1, char temp2) {
        int k = (int) (n + 1 - Math.sqrt(2 * n + 1));
        hanoi(k, from, temp1, temp2);
        hanoi(n-k, from, to, temp2);
        hanoi(k, temp1, to, temp2);
    }

    // recursive function to solve
    // Tower of Hanoi puzzle
    // private static void towerOfHanoi(int n, char fromRod,
    //                          char toRod, char auxRod1,
    //                          char auxRod2) {
    //     if (n == 0)
    //         return;
    //     if (n == 1) {
    //         System.out.println("Move disk " + n +
    //                                    " from " + fromRod +
    //                                    " to " + toRod);
    //         return;
    //     }
    //
    //     towerOfHanoi(n - 2, fromRod, auxRod1, auxRod2,
    //                  toRod);
    //     System.out.println("Move disk " + (n - 1) +
    //                                " from " + fromRod +
    //                                " to " + auxRod2);
    //     System.out.println("Move disk " + n +
    //                                " from " + fromRod +
    //                                " to " + toRod);
    //     System.out.println("Move disk " + (n - 1) +
    //                                " from " + auxRod2 +
    //                                " to " + toRod);
    //     towerOfHanoi(n - 2, auxRod1, toRod, fromRod,
    //                  auxRod2);
    // }

    // Driver method
    public static void main(String[] args) {
        // int n = 4; // Number of disks
        int n = Integer.parseInt(args[0]);

        // A, B, C and D are names of rods
        towerOfHanoi(n, 'A', 'D', 'B', 'C');

        // hanoi(n, 'A', 'C', 'B');
    }
}
