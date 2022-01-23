public class Quadratic {
    public static void main(String[] args) {
        //ax^2 + bx + c;
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("negative discriminant");
            System.exit(0);
        }

        double root1 = (-b + Math.sqrt(discriminant))/2;
        double root2 = (-b - Math.sqrt(discriminant))/2;

        System.out.println(root1 + " " + root2);       
    }
}
