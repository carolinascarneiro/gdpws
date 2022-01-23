/*

Write a program Deal that takes an command-line
argument Nand prints N poker hands (five cards each)
from a shuffled deck, separated by blank lines.

*/

public class Cards {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", 
                          "7", "8", "9", "10", "Jack",
                          "Queen", "King"};
        String[] deck = new String[52];

        //build deck
        int d = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[d] = ranks[j] + " of " + suits[i];
                d++;
            }
        }

        //shuffle deck
        for (int i = 0; i < 200; i++) {
            int RandIndex = (int)(Math.random()*52);
            int RandIndexOne = (int)(Math.random()*52);
            String t = deck[RandIndex];
            deck[RandIndex] = deck[RandIndexOne];
            deck[RandIndexOne] = t;
        }
        
        int handpoker = 1;
        //print poker hangs from shuffled deck
        for (int i = 1; i <= N*5; i++) {
            //if (i == 1 || i%5==0) {System.out.println("Hand " + handpoker + " of poker"); handpoker++;}
            System.out.println(deck[i]);
            if (i != 0 && i%5==0) System.out.println("");
        }
        
    }
}
