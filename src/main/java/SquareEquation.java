public class SquareEquation {
    public static void main(String[] args) {
        System.out.println(resolve(3, -4, 2));
        System.out.println(resolve(1, -4, -5));
    }

    private static Solution resolve(int a, int b, int c){
        int D = b*b - (4*a*c);
        if (D < 0) {
            return null;
        } else {
            return new Solution(a, b, D);
        }
    }
}
