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
