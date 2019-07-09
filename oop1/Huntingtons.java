/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Huntingtons {
    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    // public static int maxRepeats(String dna) {
    //     int len = dna.length();
    //     int max = 0;
    //
    //     while (dna.indexOf("CAG") != -1) {
    //         int count = 0;
    //         int index = dna.indexOf("CAG");
    //         dna = dna.substring(index);
    //         while (dna.indexOf("CAG") == 0) {
    //             // StdOut.println(dna);
    //             index = dna.indexOf("CAG");
    //             dna = dna.substring(index + 3);
    //             count++;
    //         }
    //         // StdOut.println("count is " + count);
    //         if (count > max) max = count;
    //
    //     }
    //     return max;
    // }

    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        String repeats = "CAG";
        int count = 0;
        while (dna.indexOf(repeats) != -1) {
            repeats = repeats+ "CAG";
            count++;
        }

        return count;
    }

    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
    public static String removeWhitespace(String s) {
        return s.replaceAll("\\s+", "");
    }

    // Returns one of these diagnoses corresponding to the maximum number of repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {
        if (0 <= maxRepeats && maxRepeats < 10) return "not human";
        else if (maxRepeats < 36) return "normal";
        else if (maxRepeats < 40) return "high risk";
        else if (maxRepeats < 181) return "Huntington's";
        else return "not human";
    }

    // Sample client (see below).
    public static void main(String[] args) {
        In f = new In(args[0]);
        String s = f.readAll();
        // StdOut.println(s);

        s = removeWhitespace(s);
        // StdOut.println(s);
        // StdOut.println(s.indexOf("CAG"));
        // StdOut.println(s.substring(28));

        int max = maxRepeats(s);
        StdOut.println("max repeats = " + max);

        StdOut.println(diagnose(max));
    }
}
