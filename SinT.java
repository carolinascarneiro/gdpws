/*
1.2. Built-in Types of Data
1.2.21. Write a program that takes a double value t from the command line and prints
the value of sin(2t) + sin(3t).
*/

public class SinT {
    public static void main(String[] args) {
        //take double T from command line
        double t = Double.parseDouble(args[0]);

        //print value of sin(2t) + sin(3t)
        System.out.println((Math.sin(2*t)+Math.sin(3*t)));
    }
}
