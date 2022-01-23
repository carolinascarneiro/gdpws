public class BoolArrays {
    public static void main(String[] args) {

    boolean[][] a = {
        {true, false, true},
        {false, true, false},
        {true, true, true}
    };

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] == true) System.out.print("*");
            else                 System.out.print(" ");
        }
    }


    }
}
