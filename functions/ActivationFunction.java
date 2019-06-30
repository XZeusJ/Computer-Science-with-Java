/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ActivationFunction {
    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x < 0) return 0;
        else if (x == 0) return 1.0 / 2;
        else return 1;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        return 1 / (1 + Math.pow(Math.E, -x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (x == Double.POSITIVE_INFINITY) return 1.0;
        if (x == Double.NEGATIVE_INFINITY) return -1.0;
        if (x == Double.MAX_VALUE) return 1.0;
        if (x == -Double.MAX_VALUE) return -1.0;
        double posEX = Math.pow(Math.E, x);
        double negEX = Math.pow(Math.E, -x);
        return (posEX - negEX) / (posEX + negEX);
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (x == Double.POSITIVE_INFINITY) return 1.0;
        if (x == Double.NEGATIVE_INFINITY) return -1.0;
        if (x > 0) return x / (1 + x);
        else return x / (1 - x);
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (x == Double.NEGATIVE_INFINITY) return -1.0;
        if (x == Double.NaN) return Double.NaN;
        if (x <= -2) return -1;
        else if (x < 0) return x + Math.pow(x, 2) / 4;
        else if (x < 2) return x - Math.pow(x, 2) / 4;
        else return 1;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        StdOut.println("heaviside(" + n + ") = " + heaviside(n));
        StdOut.println("  sigmoid(" + n + ") = " + sigmoid(n));
        StdOut.println("     tanh(" + n + ") = " + tanh(n));
        StdOut.println(" softsign(" + n + ") = " + softsign(n));
        StdOut.println("     sqnl(" + n + ") = " + sqnl(n));
    }
}
