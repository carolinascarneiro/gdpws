public class Looping4 {
    public static void main(String args[]) {
        long Ob = Long.parseLong(args[0]);
        long R = 0;

            long sum = 0;
            long S = 0;
            long N = 1;
            for (long y = 1; y < Ob; y++) {
                do {ß
                long b = N;

                //turn N around and assign it to R
                String s = "";
                while (b > 0) {
                    s += b % 10;
                    b = b / 10;
                    R = Long.parseLong(s);
                    }
                    //sum of N and R;
                    sum = N + R;
                    
                    //ueberlauftest (?)
                    if (sum > Long.MAX_VALUE) {
                        System.out.println("Ueberlauf");
                        System.exit(0);
                    }

                    //reverse sum and assign it to s
                    long sum1 = sum; //declare extra variable not to change sum
                    String r = "";
                    while (sum1 > 0) {
                        r += sum1 % 10;
                        sum1 = sum1 / 10;
                    }
                    S = Long.parseLong(r);
                    
                    //check if sum is palindrome, if yes great if no then i = i + R;
                    if (sum == S) {
                        System.out.println("sum of "+ N + " is " + sum + " and is palindrome!");
                        N++;
                    } else {
                        System.out.println("sum of "+ N + " " + sum + " is not palindrome! Let's redo it");
                        N = N + R;
                    }

                } while (sum != S);
            }
            
                   
    }
}
