public class AvgStdDev {
    public static void main(String[] args) {
        //let's define how many values we'll take
        int N = Integer.parseInt(args[0]);
        double sum = 0.0;
        double[] values = new double[N];
        
        //creating the array we will use 
        for (int i = 0; i < N; i++) {
            double value = StdIn.readDouble();
            values[i] = value; 
        }
        
        //get the average out of it
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        double average = sum/N;


        //get the standard deviation
        double[] stddev = new double[values.length];
        double sum1 = 0.0;
        
        //1. Work out the mean, then for each number subtract the mean and square the result
        for (int i = 0; i < stddev.length; i++) {
            stddev[i] = Math.pow((values[i] - average), 2);
        }
        
        //2. Work out the mean of those square differences
        for (int i = 0; i < stddev.length; i++) {
            sum1 = sum1 + stddev[i];
        }
        double average1 = sum1/(N-1);

        //3. Take the squared root of that and ready :)
        double stddev1 = Math.sqrt(average1);
        System.out.println(stddev1);

        //4. Filter that prints all values that are
        //further than 1.5 SD from AVG

        for (int i = 0; i < values.length; i++) {
            if (values[i] > average + (stddev1 * 1.5) ||
                values[i] < average - (stddev1 * 1.5)) StdOut.println(values[i]);
        }

    }
}
