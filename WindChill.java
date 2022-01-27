/*
1.2. Built-in types of data
1.2.25. Wind chill. Given the temperature t (in Fahrenheit) and 
the wind speed v (in miles per hour), the National Weather
Service defines the effective temperature (the wind chill)
to be:
w = 35.74 + 0.6215 t + (0.4275 t - 35.75) v0-16
Write a program that takes two double command-line 
arguments t and v and prints out the wind 
chill. UseMath.pow(a, b) to compute ab. 
Note:The formula is not valid if t is larger 
than 50 in absolute value or if v is larger than 
120 or less than 3 (you may assume that the values
you get are in that range).
*/

public class WindChill {
    public static void main(String[] args) {

        //take two doubles t and v
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        //calculate effective temperature
        double w = 35.74 + 0.6215*t; 
        w = w + (0.4275*t-35.75) * Math.pow(v, 0.16);

        System.out.println(w);
    }
}
