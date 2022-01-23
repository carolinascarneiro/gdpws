public class Dreieck {
    public static void main(String[] args) {
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5, Math.sqrt(3)/2.0);
        StdDraw.line(0.5, Math.sqrt(3)/2.0, 0.0, 0.0);
        StdDraw.point(0.5, (Math.sqrt(3)/2.0)/3.0);
    }
}
