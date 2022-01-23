public class ReadInts {
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0] = 0;
        a[1] = 0;
        while (!StdIn.isEmpty()) {
            int value;
            do {
                value = StdIn.readInt();
                if (value < 0) System.out.println("Please insert a positive number.");
            } while (value < 0);
            if (a[0] == 0) a[0] = value;
            if (value > a[0]) a[1] = value; 

            System.out.println("Min: " + Math.min(a[0], a[1]));
            System.out.println("Max: " + Math.max(a[0], a[1]));
        }
    }
}
