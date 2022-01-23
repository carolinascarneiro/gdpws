/* 
Write a program to print instructions for drawing the
dragon curves of order 0 through 5. The instructions
are strings of F, L, R characters, where F means
"draw line while moving 1 unit forward", L means "turn
left", and R means turn right.

A dragon curve of order N is formed when you fold a strip
of paper in half N times, then unfold to the right angles.

The key to solving this problem is to note that a curve
of order N is a curve of order N - 1 followed by a 
curve of order N-1 traversed in reverse order, and then to
figure out a similar description for the reverse curve.

dcThree = DcTwo + "L" + DcZero + "R" + DcZero;

The
*/

public class DragonCurves {
    public static void main(String[] args) {
        //get order of the dragon curve
        int N = Integer.parseInt(args[0]);


        //

        String dcZero = "F";
        String dcOne = dcZero + "L" + dcZero;
        String dcTwo = dcOne + "L" + 

        
        //Print instructions dragon curves order 0 to 5
        System.out.println("Instructions of dc order 0 to 5");
    }
}
