public class Triangle {
    public static void main(String[] args) {
        //takes three positive integers as
        //command line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        
        //if any of them is greater than
        //or equal to the sum of the others
        boolean con = (a >= (b + c)) || (b >= (a + c));
        con = con || (c >= (a + b));

        //print true
        System.out.println(con);
    }
    
}
