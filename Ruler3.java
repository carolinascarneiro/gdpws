public class Ruler3 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String ruler = " ";
        for (int j = 1; j < N; j++) {
            ruler = ruler + j + ruler;
        }
        System.out.println(ruler);
    }
}
