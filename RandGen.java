/*
1.3 Conditionals and Loops
Write a program that takes an integer Nas a command-line argument,
uses Math. random() to print Nuniform random values between 0 and 1, 
and then prints their average value (see Exercise 1.2.30).
*/

public class RandGen {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        //print a uniform random number
        int i = 0;
        double x = 0;
        double sum = 0;
        while (i <= N/i) {
            x = Math.random();
            //print N uniform random values
            System.out.println(x);

            sum += x;
            i++;
        }
        //print their average value
        System.out.println("average is " + sum/i);
    }
}
