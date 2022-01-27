/*
1.2 Built-in types of Data
1.2.28. Order check. 
Write a program that takes three double 
values x, y, and z as command-line 
arguments and prints t r u e if the values
are strictly ascending or descending 
(x<y <zorx>y>z),and false otherwise.
*/

public class OrderCheck {
    public static void main(String[] args) {
        
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        boolean con = x > y && y > z;
        con = con || x < y && y < z;

        System.out.println(con);
    }
}
