/*1.2.30 Uniform random numbers. 
Write a program that prints five uniform
random values between 0 and 1, their 
average value, and their minimum and maxi
mum value. Use Math. random(), Math. 
min(), and Math. max(). */

public class UniRanNum {
    public static void main(String[] args) {
        
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println((a+b+c+d+e)/5);
        
        double min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        min = Math.min(min, e);
        System.out.println(min);

        double max = Math.max(a, b);
        max = Math.max(max, c);
        max = Math.max(max, d);
        max = Math.max(max, e);
        System.out.println(max);



    }
}
