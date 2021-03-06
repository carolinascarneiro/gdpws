/* 
1.2 Built-in Data Types
1.2.27 Gaussian random numbers. 
One way to generate a random
number taken from the Gaussian 
distribution is to use the Box-Muller
formula
w = sin(2iTv) (-2lnt/)1/2
where u and v are real numbers between 0
and 1 generated by the Math.random () 
method. Write a program StdCaussian that 
prints out a standard Gaussian random 
variable.
*/

public class StdGaussian {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();

        double w = Math.sin(2 * Math.PI * v);
        w = w * Math.pow(-2 * Math.log(u), 0.5); 
    
        System.out.println(w);
    }
}
