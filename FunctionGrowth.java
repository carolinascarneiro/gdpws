/*
1.3 Conditionals and Loops
Write a program FunctionGrowth that prints a table of the values 
logJV, JV, JVlogJV, JV2, JV3, and 2N for JV= 16,32,64,..., 2048. Usetabs (\t characters)
to line up columns.
*/

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
