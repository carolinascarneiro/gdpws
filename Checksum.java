public class Checksum {
    public static void main(String[] args) {
        String s = args[0];
        int j = 10;
        int sum = 0;
        String toint = "";

        for (int i = 0; i < 9; i++) {
            //int asciiValue = s.charAt(i);
            //char newchar = (char)s.charAt(i);
            toint += (char)s.charAt(i);
            int newchar1 = Integer.parseInt(toint);
            int eachmult = newchar1 * j;
            sum += eachmult;
            j--;
            toint = "";
        }
        int x = 11 - (sum%11);
        System.out.println(x);
    }
}
