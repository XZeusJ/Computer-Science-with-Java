public class Birthday {
//    private static int trial(int n) {
//        int[] day = new int[n];
//        for (int i = 0; i < n; i++) {
//            int nextDay = (int) (Math.random() * n);
//            if (day[nextDay] == 1) return i;
//            else day[nextDay] = 1;
//        }
//        return 0;
//    }
//
//    private static void count(int n, int trails) {
//        int[] count = new int[n];
//        double[] fraction = new double[n];
//
//        for (int i = 0; i < trails; i++) {
//            count[trial(n)]++;
//        }
//        for (int i = 0; i < fraction.length; i++) {
//            int total = 0;
//            for (int j = 0; j <= i; j++) {
//                total += count[j];
//            }
//            fraction[i] = (double) total / trails;
//        }
//        showData(count, fraction);
//    }
//
//    private static void showData(int[] count, double[] fraction) {
//        for (int i = 0; i < count.length; i++) {
//            System.out.printf("%5d%10d%10f\n", i + 1, count[i], fraction[i]);
//            if (fraction[i] >= 0.5) break;
//        }
//    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        // count the number
//        count(n, trials);
        int[] count = new int[n];
        double[] fraction = new double[n];

        for (int i = 0; i < trials; i++) {
            int[] day = new int[n];
            int index = 0;
            for (int j = 0; j < n; j++) {
                int nextDay = (int) (Math.random() * n);
                if (day[nextDay] == 1) {
                    index = j;
                    break;
                } else day[nextDay] = 1;
            }
            count[index]++;
        }
        for (int i = 0; i < fraction.length; i++) {
            int total = 0;
            for (int j = 0; j <= i; j++) {
                total += count[j];
            }
            fraction[i] = (double) total / trials;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.printf("%d%10d%10f\n", i + 1, count[i], fraction[i]);
            if (fraction[i] >= 0.5) break;
        }

    }
}
