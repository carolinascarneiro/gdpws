/*
This program reads in a sequence of real
numbers from standard input and prints
their average on standard output (provided
that the sum does not overflow). From its
point of view, there is no limit on the size
of the input stream. The commands on the
right below use redirection and piping
(discussed in the next subsection) to provide
100,000 numbers to average.
*/

public class Average {
    public static void main(String[] args) {
        int cnt = 0;
        double sum = 0;
        while(!StdIn.isEmpty()) {
            Double x = StdIn.readDouble();
            sum += x;
            cnt++;
        }
        System.out.printf("Avg is %.0f", sum/cnt);
    }
}
