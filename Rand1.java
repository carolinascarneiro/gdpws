public class Rand1 {
    public static void main(String[] args) {
        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);

        int r = (int)(Math.random() * (high-low)) + low;
        System.out.println(r);
    }
}
