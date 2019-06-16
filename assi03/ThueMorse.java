public class ThueMorse {
    private static boolean[] genTM(int N) {
        boolean[] tm = new boolean[N * N];
        tm[0] = true;

        int count = 4;
        while (count <= tm.length) {
            for (int i = count / 2; i < count; i++) {
                tm[i] = !tm[i - count / 2];
            }
            count *= 2;
        }
        return tm;
    }

    private static void showArray(boolean[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i * n + j] == true) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int length = n * n - 1;

        boolean[] tmArray = genTM(n);
        showArray(tmArray, n);
    }

}
