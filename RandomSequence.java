/*
In this program we will specify the standard
output stream is not to be printed in the
terminal window, but instead is to be written
to a text file named data.txt. Each call to
System.out.println() appends text at the end
of that file. 
*/
public class RandomSequence {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++) {
            System.out.println(Math.random());
        }
    }    
}
