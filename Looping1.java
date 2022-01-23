public class Looping1 {
    public static void main(String[] args) {
        
        //1. Argument wird in das Program gegeben.

        //2. If program is run without args then ask for a parameter
        if (args.length == 0) {
            System.out.println("Bitte geben Sie die Obergrenze als Parameter an.");
            System.exit(1);
        }

        //3. Start of loop
        //Take number from command line
        long N = Long.parseLong(args[0]);
        long i;
        long m;
        for (long w = 1; w < N; w++) {
            i = w;
            // turn it around
                String s = "";
                while (w > 0) {
                    s += w % 10;
                    w = w / 10;
                }
            long m = /*i + */Long.parseLong(s);

            //check i and i backwards
        }
        System.out.println(i);
        System.out.println(m);

            // long q = m + N;
            // long l = m + N;
            // System.out.println(q);

            // String z = "";
            // while (q > 0) {
            //     z += q % 10;
            //     q = q / 10;
            // }
            // long h = Long.parseLong(z);
            
            // if (l == h) {System.out.println("Is Palindrome");}
            // else {N = N + m;}
        //}
        //sum i and i backwards to check if it forms a palindrome
        // String z = "";
        // while (m > 0) {
        //     z += m % 10;
        //     m = m / 10;
        // }
        // long n = Long.parseLong(z);
        // if (m == n) {
        //     System.out.println("Is palindrome!");
        // } else {
        // i = i + m;
        // System.out.println(i);}
        //Long S = Long.parseLong(s);
        // }
        //System.out.println(S);
    }
}
