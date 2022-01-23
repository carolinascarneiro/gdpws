public class Checkerboard {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        int j = 0;
        if (N%2!=0) {
                while (j < N*N) {
                    if (j % 2 == 0) 
                        System.out.print("*");
                    else System.out.print(" ");
                    j++;
                    if (j%N==0) {System.out.println("");}
                }
        } else {
            j = 0;
            while (j < (N*N-N)) {
                if (j % 2 == 0) 
                    System.out.print("*");
                else System.out.print(" ");
                j++;
                if (j%(N-1)==0) System.out.println("");
            }
        }   
    }
}

