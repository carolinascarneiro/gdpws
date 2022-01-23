public class RandomInt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double t = Math.pow(10.0, 6.0);
        double r = Math.random();
        System.out.println(Math.round(N*r));
        System.out.println(t);
    }
}
