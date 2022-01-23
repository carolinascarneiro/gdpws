/* 
1.2.33 Greatcircle. 
Write a program Great Circle that takes four command-line
arguments—xl, yl, x2, and y2—(the latitude and longitude,
in degrees, of two points on the earth) and prints out 
the great-circle distance between them. The great-circle
distance (in nautical miles) is given by the equation:
d = 60 arccos(sin(x1) sin(x2) + c o s ^ ) cos(x2) cos(yx —y2))
Note that this equation uses degrees, 
whereas Java's trigonometric functions use radians.
Use Math.toRadiansO and Math.toDegreesO to convert 
between the two. Use your program to compute the 
great-circle distance between Paris 
(48.87° N and -2.33° W) and San Francisco 
(37.8° N and 122.4° W).
*/
public class GreatCircle {
    public static void main(String[] args) {

        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double d = Math.sin(x1) * Math.sin(x2);
        d = d + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2);
        d = 60 * Math.acos(d);

        System.out.println(Math.toDegrees(d));
    }
}
