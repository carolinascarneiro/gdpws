public class MedianOfFive {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        boolean check = a < b && b < c;
        check = check && c < d;
        check = check && d < e;
        if (check) {System.out.print(a + " " + b + " " + c + " " + d + " " + e);}

        while (!check) {
            if (a > b) {
                int t = a;
                a = b;
                b = t;
            }
            
            else if (b > c) {
                int t = c;
                c = b;
                b = t;
            }

            else if (c > d) {
                int t = d;
                d = c;
                c = t;
            }

            else if (d > e) {
                int t = d;
                d = e;
                e = t;
            }
        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}
