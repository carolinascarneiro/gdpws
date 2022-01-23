public class CountingPrimes {
    public static void main(String[] args) {
        //upper limit
        int N = Integer.parseInt(args[0]);
        
        //to count primes when they appear
        int counterprimes = 0;

        for (int j = 2; j < N; j++) {
            int counterdivisors = 0;
            for (int i = 2; i <= j/2; i++) {
                if (j%i==0) {counterdivisors++;}
            }
            if (counterdivisors == 0) {counterprimes++;}
        }

        System.out.println(counterprimes);
    }
}
