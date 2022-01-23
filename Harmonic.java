public class Harmonic {
    public static void main(String[] args) {
        
        double N = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= N; i++) 
        {
            sum = sum + 1/(double) i;
        }
        System.out.println(sum);
    }
}
