/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        for (int i = 0; i < a.length; i++) {
            a[i] *= alpha;
        }
        return a;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        int len = a.length;
        double[] newA = new double[len];
        for (int i = 0; i < len; i++) {
            newA[i] = a[len - i - 1];
        }
        return newA;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] merge = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
        }
        for (int i = a.length; i < b.length + a.length; i++) {
            merge[i] = b[i - a.length];
        }
        return merge;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] min;
        double[] max;
        if (a.length > b.length) {
            min = b;
            max = a;
        }
        else {
            min = a;
            max = b;
        }
        for (int i = min.length; i < max.length; i++) {
            min[i] = 0;
        }

        double[] mix = new double[max.length];
        for (int i = 0; i < max.length; i++) {
            mix[i] = min[i] + max[i];
        }
        return mix;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int len = a.length * (int) alpha;
        double[] newA = new double[len];
        for (int i = 0; i < a.length; i++) {
            newA[i] = a[i / (int) alpha];
        }
        return newA;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        // nothing to test
    }
}
