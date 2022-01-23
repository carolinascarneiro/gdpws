public class GamblersRuin {
    public static void main(String[] args) {
        int nbets = 50;
        int experimentcounter = 0;
        int nblocksexperiments = 100;
        double stake = 20;
        double goal = 50;
        double wincounter = 0;
        double gamecounter = 0;

        //execute block of 50 bets 100 times
        while (experimentcounter < nblocksexperiments) {
        //experiment block of 50 bets
            for (int i = 0; i < nbets; i++) 
                {
                    //start counting game
                    gamecounter++;
                    //simulate one bet
                    double result = Math.random();
                    //50% of winning each bet
                    if (result >= 0.5) stake ++; //if plus than 50% increase stake
                    else              stake --; //if less decrease it;

                    if (stake == goal) {wincounter ++; continue;} //if stake reached goal wincounter++
                }                                                 //and continue to next block of 50
            experimentcounter++;
        }
        System.out.println((wincounter / gamecounter)*100 + " chance of winning");
    }
}