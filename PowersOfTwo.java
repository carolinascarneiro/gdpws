/* 
1.3 Conditionals and Loops
1.3.14. Write ap rogram that takes a command-line argument N and prints all the positive powers of two less
than or equal to N. Make sure that your program works properly for all values of N.
(Integer.parselnt() will generate an error if N is too large, and your program should print 
nothing if N is negative.)
*/

public class PowersOfTwo {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        if (N < 0) {
            System.out.println("negative");
            System.exit(0);
        }
        for (int i = 1; i < N;) {
            i *= 2;
            System.out.println(i);
        }
    }
}
