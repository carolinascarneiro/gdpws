/*
1.2 Built-in Data Types
1.2.31 Mercator projection. 
The Mercator projection is a conformal
(angle preserving) projection that maps 
latitude 9 and longitude Xto 
rectangular coordinates (x, y). 
It is widely used—for example, 
in nautical charts and in the maps 
that you print from the web. 
The projection is defined by the 
equations x = X — X0 and y = 1/2 In 
((1 + sincp) / (1 —sincp)), where X0 
is the longitude of the point in 
the center of the map. 
Write a program that takes 
\0 and the latitude and longitude 
of a point from the command line 
and prints its projection.
*/

public class MercatorProj {
    public static void main(String[] args) {
        
        double lon0 = Double.parseDouble(args[0]);
        double lat = Double.parseDouble(args[1]);
        double lon = Double.parseDouble(args[2]);

        double x = lon - lon0;
        double y = 0.5 * Math.log((1+Math.sin(lat)/(1 - Math.sin(lat))));

        System.out.println("x is " + x);
        System.out.println("y is " + y);
        
    }
}
