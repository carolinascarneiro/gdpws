public class PolarCoor {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Math.sqrt(x*x + y*y);
        System.out.println(r);
        System.out.println(Math.atan2(y, x));
    }
}
