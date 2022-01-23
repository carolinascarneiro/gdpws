public class RevStrArray {
    public static void main(String[] args) {
        
        String[] a = {"Carol", "Erika", "Isabel", "Sid", "Mat", "Lisa"};
        int j = a.length-1;

        for (int i = 0; i < a.length/2; i++) {
            String t = a[i];
            a[i] = a[j];
            a[j] = t;
            j--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
