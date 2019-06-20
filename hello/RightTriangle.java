public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        long da = (long) a * a;
        long db = (long) b * b;
        long dc = (long) c * c;

        boolean isPositive = !(a <= 0 || b <= 0 || c <= 0);

        boolean isRT1 = (da + db == dc);
        boolean isRT2 = (da + dc == db);
        boolean isRT3 = (dc + db == da);
        boolean isRightTri = isRT1 || isRT2 || isRT3;

        System.out.println(isPositive && isRightTri);
    }

}
