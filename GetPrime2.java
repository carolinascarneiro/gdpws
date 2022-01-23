public public class GetPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int b = n;
        String divisors = "";
        boolean isprime;
        for (int i = 2; i <= n; i++) {
            isprime = b % i == 0;
            b = b/i;
            }
            if (isprime) System.out.println(i);
        }
    }
}class GetPrime2 {
    
}
