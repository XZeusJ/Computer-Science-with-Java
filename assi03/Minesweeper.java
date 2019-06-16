public class Minesweeper {
    private static int[][] initRandom(int[][] a, int n) {
        int M = a.length;
        int N = a[0].length;

        int row;
        int col;
        for (int i = 0; i < n; i++) {
            row = (int) (Math.random() * M);
            col = (int) (Math.random() * N);
            if (a[row][col] == -1) i--;
            else a[row][col] = -1;
        }
        return a;
    }

    private static void showA(int[][] a) {
        int M = a.length;
        int N = a[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j] == -1) System.out.print("* ");
                else System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] changeA(int[][] a) {
        return a;
    }

    public static void main(String[] args) {
        int M = 9;
        int N = 9;
        int randomNum = 10;
        int[][] a = new int[M][N];

        a = initRandom(a, randomNum);
        showA(a);
        System.out.println();
        a = changeA(a);
        showA(a);
    }

}
