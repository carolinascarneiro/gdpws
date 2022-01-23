public class Looping2 {
    public static void main(String[] args) {
        //get args from command line
        Long N = Long.parseLong(args[0]);
        long i = 1;
        int n = 1;
        long counter = 1;
        do {
            //declare n not to change i in the operations
            //turn i around and pass it to R
            long n = 1;
            String s = "";
            while (n > 0) {
                s += n % 10;
                n = n / 10;
            }
            long R = Long.parseLong(s);

            System.out.println(n + " is the N and " + R + " is the R");
            
            //sum i and R
            long m = i + R;
            long b = m;

            //turn around the sum and store it to a variable e long
            String q = "";
            while (b > 0) {
                q += b % 10;
                b = b / 10;
            }
            long e = Long.parseLong(q);
            System.out.println(m + " is the sum and " + e + " is the sum backwards");
            //check if variable e and sum are equal
            if (e == m) {n++;}
            else {n = n + R;}

            i++;
        } while (n < N);
    }
}
