/**
This filter copies to the output stream
the numbers from the input stream that fall
inside the range given by the command-line
parameters. There is no limit on the length
of the streams.
*/

public class RangeFilter {
    public static void main(String[] args) {

        //collect range
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        //collect numbers
        while (!StdIn.isEmpty()) {
            int num = StdIn.readInt();
            //filter and print only numbers in range
            if (num >= min && num <= max)
                StdOut.printf("%d in range%n", num);
        }
    }
}
