public class ThreeSort {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int first = Math.min(a, b);
        first = Math.min(first, c);

        int third = Math.max(a, b);
        third = Math.max(third, c);

        int second = a + b + c - first - third;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}
