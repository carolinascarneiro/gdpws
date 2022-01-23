public class FiveIntsLine {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if (i % 5 == 5 || i % 5 == 0) 
                    System.out.println();
            System.out.print(i + " ");
        }
    }
}
