/*
1.2 Built-in Types of Data
1.2.26. Polar coordinates. Write a program that converts from Cartesian to polar coordinates. 
Your program should take two real numbers x and y on the command line and print the polar coordinates
r and 0. Use the Javamethod Math.atan2(y, x) which computes the arctangent value of y/x that is in the
range from - i r to it.
*/

public class PolarCoor {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Math.sqrt(x*x + y*y);
        System.out.println(r);
        System.out.println(Math.atan2(y, x));
    }
}
