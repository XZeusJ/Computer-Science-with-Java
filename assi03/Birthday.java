public class Birthday {
    private static int oneTrail(int n, int i) {
        int[] birthday = new int[n];

        int j = 0;
        int index = (int) Math.random() * n;
        while (birthday[index] == 0 && j < i) {
            birthday[index] = 1;
            index = (int) Math.random() * n;
            j++;
        }
        if (j == i) return 0;
        else return 1;
    }

    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        int trials = Integer.parseInt(args[1]);
        int n = 365;
        int trials = 1000000;

        int count = 0;
        for (int k = 0; k < trials; k++) {
            count += oneTrail(n, 2);
        }

        System.out.println(count);


    }
}
