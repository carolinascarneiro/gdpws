public class Looping3 {
    public static void main(String args[]) {
        //is the sum of n with n reverse a palindrome? if yes, n++ if no, (till hundred times) n = n + n reverse.

        long O = Long.parseLong(args[0]);
        long M = 1;
        for (long i = 1; i <= O; i++) {

            //turn n backwards and assign it to R
            String s = "";
            Long N = M;
            while (M > 0) {
                s += M % 10;
                M = M / 10;
            }
            long R = Long.parseLong(s);

            //Überlauftest
            if (N+R > Long.MAX_VALUE) {
                System.out.println("Überlauf");
            } else {
                System.out.println(N+R);//korrekt, ohne Ueberlauf
            }

        }
    }
}
