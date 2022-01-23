public class Looping {

    //WICHTIG!!!
    //Aufpassen: Ist die Startzahl selbst ein Palindrom (z.B. 4994) soll der Algorithmus 
    //noch nicht abbrechen, sondern wenigstens einmal N+R bestimmen ...
    public static void main(String[] args) {

        //1. Argumente werden in das Program gegeben.
        long N = Long.parseLong(args[0]);

        //2. If program is run without args then ask for a parameter
        if (args.length == 0) {
            System.out.println("Bitte geben Sie die Obergrenze als Parameter an.");
            System.exit(1);
        }
        
        //start of loop
        long counter = 0;
        String s = "";
        //for (int i = 0;  i < 300; i++) {
            //counter ++;
            //Read N backwards to form R
            for (long i = 1; i < N; i++) {
                String r = "";
                while (i > 0) {
                r += i % 10;
                i = i / 10;
                }
                long R = Long.parseLong(r);
            }
            System.out.println(R);
                // long T = R + i;
                // while (T > 0) {
                // s += T % 10;
                // T = T / 10;}
                // long S = Long.parseLong(s);
                // if (S == T) {
                //     System.out.println(i + " is palindrome!");
                //}


        //     //Avoiding an overflow
        //     if ((N+R) > Long.MAX_VALUE-1) {
        //         System.out.println("Ueberlauf");
        //     }

        //     //N und R werden nun addiert

        //     long M = N + R;
        //     while (M > 0) {
        //     s += M % 10;
        //     M = M / 10;}
        //     long S = Long.parseLong(s);

        //     if (M == S) {
        //         System.out.println("Palindrom, fertig nach " + counter + " Iterationen");
        //         System.out.println("N is " + N);
        //     }
        //     else {N = N + R;}
        // }
    }
}