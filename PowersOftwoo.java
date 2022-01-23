public class PowersOftwoo {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        if (N < 0) {
            System.out.println("negative");
            System.exit(0);
        }
        for (int i = 1; i < N;) {
            i *= 2;
            System.out.println(i);
        }
    }
}
