public class Division {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean conf = (a%b == 0) && (b%a == 0);
        System.out.println(conf);
    }
    
}
