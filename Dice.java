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
