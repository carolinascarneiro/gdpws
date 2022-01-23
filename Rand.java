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
