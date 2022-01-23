public class PowersOfTwo {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int v = 1;
        int i = 0;
        while (v <= N/2) {
            v = v * 2;
            i++;
            System.out.println(i + " " + v);
        }
    }
}
