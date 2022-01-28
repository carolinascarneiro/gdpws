

public class DecToBin2 {
    public static void main(String[] args) {
        long N = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int v = 1;

        boolean checkk = k >= 2 && k <= 16;

        if (checkk != true) {
            System.out.println("K must be between 2 and 16. Please run the program again.");
            System.exit(0);
        }

        
        //getting the closest number to N
        while (v <= N/k) v = v * k;
        System.out.println(v);

        long n = N;
        String converted = "";
        while (v > 0 && converted.length() < 11) {
            //cast out all the powers of k
            if (n < v) {converted = converted + "0";}
            else       {converted = converted + "1"; n -= v;}
            v = v/k;
        }
        System.out.println(converted);
    }
}
