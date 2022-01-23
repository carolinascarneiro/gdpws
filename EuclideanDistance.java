public class EuclideanDistance {
    public static void main(String[] args) {
        Integer N = Integer.parseInt(args[0]);
        double[] x = new double [N];



        double[] a = {1.0, 2.0, 4.0};
        double[] b = {0.0, 1.0, 2.0};


        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow((a[i]-b[i]), 2.0);
        }

        System.out.println(sum);

    }
}
