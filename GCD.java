public class GCD {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[0]);
        int gcd = 0;

        if (x > y) {
            if (x % y == 0) {
                gcd = y;
            }
        }

    }
}
