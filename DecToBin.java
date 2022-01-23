public class DecToBin {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int v = 1; //current power of 2
        while (v <= N/2) 
            v = 2 * v;
            //Now v is the largest number of power of 2 <= N.
            int n = N;
            while (v > 0)
            {
                //Cast out powers of 2 in decreasing order.
                if (n < v) {System.out.print(0);       }
                else       {System.out.print(1); n-= v;}
                v = v / 2;
            }
            System.out.println();
    }
}
