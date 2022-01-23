public class DayOfMonth {
    public static void main(String[] args) {
        //take args m and d from command line
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        //calculate if day d of month m is between 3/20 and 6/20
        boolean c = (d >= 20 && d <= 31) && m == 3;
        c = c || (d >= 1 && d <= 30) && m == 4;
        c = c || (d >= 1 && d <= 31) && m == 5;
        c = c || (d >= 1 && d <= 20) && m == 6;

        System.out.println(c);
    }
}
