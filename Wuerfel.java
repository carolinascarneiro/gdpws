public class Wuerfel {
    public static void main(String[] args) {

        //1. take args from command line
        double N = 6.0;//Double.parseDouble(args[0]); //N = 6.0;
        int S = 200;//Integer.parseInt(args[1]);
        int K = 4; //Integer.parseInt(args[2]);
        
        //throw the dice many times
        double[] data = new double[S];
        for (int a = 0; a < S; a++) {
        double r = Math.random(); 
            for (int i = 0; i < N; i++) {
                //throwing a dice
                if (r >= (1/N)*i && r < 1/N*(i+1)) {
                    data[a] =  (i+1); //collecting the results of the times I threw the dice
                }
            }
        }

        //for testing purposes - to be erased! Print values in array of results of dice throw
        for (int i = 0; i < data.length; i++) {
            System.out.println("index is " + i + " dice: " + data[i]);
        }

        //Create algorithm that will check S-1 times I played and have groups of K of these times I played. 
        int[][] arrays = new int[S-1][K-1];
        for (int j = 0; j < S-1; j++) {
            for (int i = 0; i < K-1; i++) {
                    if (data[j+1] == N && data[j+1] == data[j]) {
                        arrays[j][i] = 1; //yes
                    } else {arrays[j][i] = 0;} //no
            }
        }

        //for testing purposes // to be erased // to access values of the arrays!
        //if k is four, I will check 
        for (int u = 0; u < arrays.length; u++) {    
            System.out.println(u + " " + arrays[u][0] + " " + arrays[u][1] + " " + arrays[u][2]);
        }

        int counter = 0;
        int determiner = 0;
        for (int u = 0; u < arrays.length; u++) {
            for (int i = 0; i < arrays[u].length; i++) {    
                if (arrays[u][i] == 1 && arrays[u][i] == arrays[u+1][i]) {
                    counter ++;
                }

            // for (int i = 0; i < arrays[u].length; i++) {
            //     for (int j = 0; i < arrays.length; i++)
            // }
            
            }
        }
    System.out.println("counter is " + counter/(K-1));
    if (counter >= (K-1) && counter % (K-1) == 0) {
        System.out.println(counter/(K-1)+ " times");}
    
    // System.out.println("determiner is " + determiner);
    

    // if (arrays[u][i] == 1 && arrays[u][i] == arrays[u+1][i])
    
    }
}
