import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        StdOut.println("width is:" + width);
        StdOut.println("height is:" + height);

        int i = 0;
        while (StdIn.hasNextLine() && i < 10) {


            String line = StdIn.readLine();
            StdOut.println(line);

            i++;
        }

    }
}
