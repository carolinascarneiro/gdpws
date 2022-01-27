/*
1.3 Conditionals and Loops
Write a program that, using one for loop and one if statement,prints the
integers from 1,000 to 2,000 with five integers per line. Hint: Use the % operation.
*/

public class FiveIntsLine {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if (i % 5 == 5 || i % 5 == 0) 
                    System.out.println();
            System.out.print(i + " ");
        }
    }
}
