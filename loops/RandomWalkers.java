public class RandomWalkers {
    private static int randomWalker(int mht) {
        int steps = 0;
        int x = 0;
        int y = 0;

        while (Math.abs(x) + Math.abs(y) != mht) {
//            System.out.printf("(%d, %d)\n", x, y);
            int rand = (int) (Math.random() * 4);
            if (rand == 0) x += 1;
            if (rand == 1) x -= 1;
            if (rand == 2) y += 1;
            if (rand == 3) y -= 1;
            steps++;
        }
//        System.out.printf("(%d, %d)\n", x, y);
//        System.out.println("steps = " + steps);
        return steps;
    }

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;
        for (int i = 0; i < trials; i++) {
            totalSteps += randomWalker(r);
        }
        System.out.println("average number of steps = " + (double) totalSteps / trials);


    }
}
