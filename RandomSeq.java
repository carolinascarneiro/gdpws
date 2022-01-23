public class RandomSeq {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        double[] seq = new double[N];
        for (int i = 0; i < N; i++) {
            seq[i] = Math.random();
        }
    }
}
