/*
1.2 Built-in Data Types
1.2.22
Write a program that takes three double values x0, v0, and t from the commandline 
and prints the value of x0 + v0t + gt2/2, where g is the constant 9.78033. 
(Note: This value the displacement in meters after t seconds when an object 
is thrown straight up from initial position x0 at velocity v0 meters per second.)
*/

public class Displacement {
    public static void main(String[] args) {
        //Take three double values from command line
        //plus assign constant value to g
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.78033;

        //print the value of x0 + v0 * t + g * (t*t) / 2
        System.out.println((x0 + (v0 * t) + g * (t*t))/2); 
    }
}
