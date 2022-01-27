/*
1.2. Built-in Types of Data
1.2.20 Write a program that prints the sum of two random 
integers between 1 and 6 (such as you might get when rolling dice).
*/

public class Dice {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
        int a = (int) (Math.random() * 2)+1;
        //int b = (int) (Math.random() * 6);
        //int c = a + b;
        if (a == 3) counter++;
        }
        System.out.println(counter);
    }
}
