public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;

        double part1 = Math.sin((x2 - x1) / 2);
        double part11 = Math.pow(part1, 2);

        double part2 = Math.sin((y2 - y1) / 2);
        double part21 = Math.pow(part2, 2);
        double part22 = Math.cos(x1) * Math.cos(x2) * part21;

        double part3 = part11 + part22;
        double part31 = Math.sqrt(part3);

        double distance = 2 * r * Math.asin(part31);

        System.out.println(distance + " kilometers");
    }
}
