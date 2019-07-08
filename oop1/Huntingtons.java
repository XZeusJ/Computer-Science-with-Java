/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Huntingtons {
    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {

    }

    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
    public static String removeWhitespace(String s) {

    }

    // Returns one of these diagnoses corresponding to the maximum number of repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {

    }

    // Sample client (see below).
    public static void main(String[] args) {
        In f = new In(args[0]);
        String s = f.readAll();
        s = removeWhitespace(s);
        int max = maxRepeats(s);
        StdOut.println(diagnose(max));
    }
}
