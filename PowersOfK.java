public class PowersOfK {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int pow = k;
        long c = 1;

        while (c<Long.MAX_VALUE/k) {
            c = c * pow;
            System.out.println(c);
        }
    }
}