public class Caesar {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);                  //Argument k aus der Kommandozeile (um wie viele Stellen der Buchstabe verschoben wird)
        for (int i = 1; i < args.length; i++) {             //fuer jeden Parameter nach k, und zwar die Strings
                String s = args[i];                         //diese sollen in der Variablen s gespeichert werden
                char[]chars = s.toCharArray();              //diese String soll in einen Array umgewandelt werden
                String y = "";                              //Deklaration unserer String, die am Ende der Output sein wird
                for (int h = 0; h < chars.length; h++) {    //für jedes Element dieses Arrays
                    if (k > 0) {                            //wenn k größer als 0 ist, und zwar eine Verschiebung nach rechts
                        if ( (int)chars[h] >= (int)'z'-(k-1) && (int)chars[h] <= (int)'z' ) { //wenn das Element zwischen (int)z und (int)z + Math.abs(k) 
                            int over = Math.abs((int)chars[h] - (char)'z'); //rechnen, wie viele Stellen nach hinten das Element ist
                            int newindex = (int)'a' + (k - (over+1));       //damit man die neue Indexierung um nicht zu viele Stellen verschiebt
                            y = y + (char)newindex;                         //Nach der Verschiebung wird das Element in y gespeichert
                        } else if ( (int)chars[h] >= (int)'Z'-(k-1) && (int)chars[h] <= (int)'Z' ) { //dasselbe, aber diesmal mit großem Buchstaben
                            int over = Math.abs((int)chars[h] - (char)'Z');
                            int newindex = (int)'A' + (k - (over+1));
                            y = y + (char)newindex;
                        } else if (Character.isLetter(chars[h])) {          //wenn das Element ein char ist und nicht in der "Risikozone" liegt,
                            y = y + (char)((int)chars[h]+k);                //soll es einfach um k verschoben werden, ohne dass eine weitere Rechnung notwendig ist.
                        } else {
                            y = y + chars[h];                               //ist das Element kein Buchstabe, soll es einfach zur String y hinzugefügt werden.
                        }
                    }
                        if (k < 0) { //Dasselbe auf der anderen Seite des Alphabets. Dieser ist genau gleich der obige Teil.
                            if ( (int)chars[h] >= (int)'a' && (int)chars[h] < (int)'a'+Math.abs(k) ) {
                                int over = Math.abs((int)chars[h] - (char)'a');    
                                int newindex = (int)'z' - (-k-(over+1));
                                y = y + (char)newindex;
                            } else if ( (int)chars[h] >= (int)'A' && (int)chars[h] < (int)'A'+Math.abs(k) ) {
                                int over = Math.abs((int)chars[h] - (char)'A');    
                                int newindex = (int)'Z' - (-k-(over+1));
                                y = y + (char)newindex;
                            } else if (Character.isLetter(chars[h])) {
                                y = y + (char)((int)chars[h]+k);
                            } else {
                                y = y + chars[h];
                            }
                        }
                    }
                System.out.println(y);
            }
    }
}
        