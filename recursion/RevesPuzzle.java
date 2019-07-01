/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RevesPuzzle {
    // recursive function to solve
    // Tower of Hanoi puzzle
    static void towerOfHanoi(int n, char fromRod,
                             char toRod, char auxRod1,
                             char auxRod2) {
        if (n == 0)
            return;
        if (n == 1) {
            System.out.println("Move disk " + n +
                                       " from " + fromRod +
                                       " to " + toRod);
            return;
        }

        towerOfHanoi(n - 2, fromRod, auxRod1, auxRod2,
                     toRod);
        System.out.println("Move disk " + (n - 1) +
                                   " from " + fromRod +
                                   " to " + auxRod2);
        System.out.println("Move disk " + n +
                                   " from " + fromRod +
                                   " to " + toRod);
        System.out.println("Move disk " + (n - 1) +
                                   " from " + auxRod2 +
                                   " to " + toRod);
        towerOfHanoi(n - 2, auxRod1, toRod, fromRod,
                     auxRod2);
    }

    // Driver method
    public static void main(String args[]) {
        // int n = 4; // Number of disks
        int n = Integer.parseInt(args[0]);

        // A, B, C and D are names of rods
        towerOfHanoi(n, 'A', 'D', 'B', 'C');
    }
}
