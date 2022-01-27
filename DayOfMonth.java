/*
1.2 Built-in Types of Data
1.2.23. Write a program that takes two int values m and d from the command line and prints true 
if day d of month m is between 3/20 and 6/20, f al se otherwise.
*/

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
