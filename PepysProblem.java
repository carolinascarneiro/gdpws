public class PepysProblem {
    public static void main(String[] args) {
    
    //experimenting with 1000 blocks of 6
    int wins = 0;
    int i = 6;
    int j = 10000000;
    int play = 0;
    int countwins = 0;
    while (j > 0) {
        while (i > 0) {
            play = (int) (Math.random() * 6);
            if (play == 1) {countwins++;}
            i--;
        }
        if (countwins >= 1) wins++;
        countwins = 0;
        i = 6;
        j--;
    }
        System.out.println("Blocks of 6: You got one at least once in " + wins + " experiments.");

    //experimenting with 1000 blocks of 12
    wins = 0;
    i = 12;
    j = 10000000;
    play = 0;
    countwins = 0;
    while (j > 0) {
        while (i > 0) {
            play = (int) (Math.random() * 6);
            if (play == 1) {countwins++;}
            i--;
        }
        if (countwins >= 2) wins++;
        countwins = 0;
        i = 12;
        j--;
    }
        System.out.println("Blocks of 12: You got one at least once in " + wins + " experiments.");

    }
}
