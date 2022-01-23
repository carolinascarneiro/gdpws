public class DivisorPattern {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        for (int i = 1; i <= N; i++) {
            //print the ith line
            for (int j = 1; j <= N; j++) {
                //Print the jth entry in the ith line.
                if (j % 2 != 0) 
                    System.out.println("* ");
                else System.out.println("  ");
                
                }
                System.out.println(i);
            }
    }
    
}
