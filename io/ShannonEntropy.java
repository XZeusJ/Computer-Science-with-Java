import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        double[] a = new double[m+1];

        int len = 0;
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            a[x]++;
            len++;
        }

        double shannon = 0.0;
        for (int j = 1; j <= m; j++) {
            double pi = 1.0 * a[j]/len;
            StdOut.println("a[j] "+a[j]+" pi "+pi);
            if (pi != 0) shannon -= pi * (Math.log(pi)/Math.log(2));
        }


        StdOut.printf("%5.4f\n", shannon);
    }
}