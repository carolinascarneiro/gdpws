public class formattedPrinting {
    public static void main(String[] args) {
        double x = Math.PI;
        System.out.printf("%2.4f%n", x);

        String y = "Carolina";
        System.out.printf("%.4s%n", y);
    }
}

/*NOTES
1. %n or \n adds a new line after printing 
the output.

2. Every tipe of data can be converted to
String, but if you write 
StdOut.printf("%12d", Math.PI) or
StdOut.printf("%4.2f", 512), you will get
a IllegalFormatConversionException run-time
error.

3. Formatted printing is convenient because
this sort of code is much more compact than
the string-concatenation code that we have
been using.
*/
