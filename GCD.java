/*
1.3 Conditionals and Loops
1.3.28 Write a program GCD that finds the greatest common divisor (gcd) of two integers using Euclid's
algorithm, which is an iterative computation based on the following observation:
if x is greater than y,then if y divides x,the gcd of x and y is y;
otherwise, the gcd of x and y is the same as the gcd of x % y and y.
*/

public class GCD {
    public static void main(String[] args) {
        
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[0]);
        int gcd = 0;

        if (x > y && x % y == 0) {
            gcd = y;
            System.out.println(gcd);
        } else {
            int modulo = x % y;
            if (modulo > y && modulo % y == 0) {
                gcd = y;
            }
        }
    }
}
