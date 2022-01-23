public class RandGen {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        //print a uniform random number
        int i = 0;
        double x = 0;
        double sum = 0;
        while (i <= N/i) {
            x = Math.random();
            //print N uniform random values
            System.out.println(x);

            sum += x;
            i++;
        }
        //print their average value
        System.out.println("average is " + sum/i);
    }
}
