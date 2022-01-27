/*
1.3 Conditionals and Loops
1.3.21 Write a version of Gambler that uses two nested whi1e loops or two
nested for loops instead of a while loop inside a for loop.
*/

public class Gambler2 {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int counter = 0;
        int win = 0;
        while (stake > 0 && stake < goal) {
            counter++;
            double play = Math.random();
            System.out.println(play);
            System.out.println(counter);
            while (play >= 0.5) {stake++; break;}
            stake--;
        }
        System.out.println(stake + " " + counter);
    }
    
}
