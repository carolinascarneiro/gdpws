/*
1.3 Conditionals and Loops
1.3.2.
Write a more general and more robust version of Quadratic (Program 1.2.3) 
that prints the roots of the polynomial ax2 + bx + c, prints an appropriate 
message if the discriminant is negative, and behaves appropriately 
(avoiding division by zero) if a is zero.
*/

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
