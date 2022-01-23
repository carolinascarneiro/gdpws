public class Chaos {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        int t = Integer.parseInt(args[1]);
        double x = 0.1;

        for (int i = 0; i < t; i++) {
            x = r * x * (1-x);
            System.out.print("r\tt\tx\n");
            System.out.print(r + "\t" + i + "\t" + x);
        }
    }
}
