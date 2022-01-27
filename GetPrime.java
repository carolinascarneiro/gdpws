/*
1.3 Conditionals and Loops-
Modify Factors to print just one copy each of the prime divisors.
*/

public class GetPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int b = n;
        String divisors = "";
        for (int i = 2; i <= n; i++) {
            while (b % i == 0) {
                //System.out.print(i + " ");
                b = b/i;
                if (b % i != 0) {System.out.println(i);}
            }
        }
    }
}