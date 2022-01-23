public class TenHellos {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        for (int i = 1; i < N; i++) {
            if (i%10 == 1) {System.out.println(i + "st Hello");}
            else if (i%10 == 2) {System.out.println(i + "nd Hello");}
            else if (i%10 == 3) {System.out.println(i + "rd Hello");}
            else {System.out.println(i + "th Hello");}
        }
    }
}
