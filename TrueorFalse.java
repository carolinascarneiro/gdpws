public class TrueorFalse {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        boolean question = true;
        boolean expression = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
        System.out.println(question == expression);
    }
}
