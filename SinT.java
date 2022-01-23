public class SinT {
    public static void main(String[] args) {
        //take double T from command line
        double t = Double.parseDouble(args[0]);

        //print value of sin(2t) + sin(3t)
        System.out.println((Math.sin(2*t)+Math.sin(3*t)));
    }
}
