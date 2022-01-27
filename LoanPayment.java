/* 
1.2 Built-in types of data
1.2.24. Write a program that calculates the monthly payments
you would have to make over a given number of years
to pay off a loan at a given interest rate compounded
continuously,taking the number of years t,the principal
P, and the annual interest rate r as command-line 
arguments. The desired value is given by the formula Pen.
Use Math. exp().
*/

public class LoanPayment {
    public static void main(String[] args) {
        
        //number of years
        double t = Double.parseDouble(args[0]);
        //the principal P
        double P = Double.parseDouble(args[1]);
        //the annual interest rate
        double r = Double.parseDouble(args[2]);

        double mpay = (P * Math.exp(r*t))/(t*12);
        double totalpay = mpay * (t*12);

        System.out.println("The monthly pay is " + mpay);
        System.out.println("\t" + "total amount paid" + "\t" + "\t" + "remaining principal");
        for (int i = 1; i <= t * 12; i++) {
            double paid = i*mpay;
            double remaining = totalpay - paid;
            System.out.print(i + "\t" + paid + "\t" + "\t"  + remaining + "\n");
        }
    }
}
