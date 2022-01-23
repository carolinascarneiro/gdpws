public class Gambler3 {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int counter = 0;
        int win = 0;
        for (int i = 0; stake < goal; i++) {
            for (double x = Math.random(); x >= 0.5; stake++) {
                if (x < 0.5) stake--;
            }
            if (stake == goal) System.out.println("win");
        }

    }
    
}
