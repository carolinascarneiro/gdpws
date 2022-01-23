public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.println("log N" + "\t" + "N" + "\t" + "N log N" + "\t" + "N^2" + "\t" + "N^3" + "\t" + "2^N" + "\t");
        for (int N = 16; N <= 2048;) {
            System.out.print(Math.log(N) + "\t");
            System.out.print(N + "\t");
            System.out.print(N * Math.log(N) + "\t");
            System.out.print(N * N + "\t");
            System.out.print(Math.pow(N, 3) + "\t");
            System.out.print(Math.pow(2, N) + "\t");
            //double N
            N *= 2;
        }
        
    }
}
