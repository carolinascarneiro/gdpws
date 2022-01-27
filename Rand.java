/*
1.2. Built-in Types of Data
1.2.19 Write a program that takes two int values a and b from thecommand line 
and prints a random integer between a and b.
*/

public class Rand {
    public static void main (String[] args) {
        //takes three positive integers
        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);

        //prints a random integer between a and b
        int r = (int) (Math.random() * (high - low)) + low;
        System.out.println(r);
    }
}
