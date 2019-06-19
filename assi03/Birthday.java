public class Birthday {
    public static int trial(int n) {
        int choosedDay = (int) (Math.random() * n);
        for (int i = 0; i < n; i++) {
            int nextDay = (int) (Math.random() * n);
            if (nextDay == choosedDay) return i;
        }
        return 0;
    }

    public static void count(int n, int trails) {
        int[] count = new int[n];
        double[] fraction = new double[n];
        for (int i = 0; i < trails; i++) {
            count[trial(n)]++;
        }
        for (int i = 0; i < fraction.length; i++) {
            double total = 0.0;
            for (int j = 0; j < i; j++) {
                total += count[i];
            }
            fraction[i] = total / trails;
        }
        showData(count, fraction);
    }

    public static void showData(int[] count, double[] fraction) {
        for (int i = 1; i <= count.length; i++) {
            System.out.printf("%5d%10d%10f\n", i - 1, count[i - 1], fraction[i - 1]);
        }
    }

    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        int trials = Integer.parseInt(args[1]);
        int n = 365;
        int trials = 1000;

        count(n, trials);

    }
}
