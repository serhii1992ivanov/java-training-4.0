public class ExampleException {

    public static int rectangleArea(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Both sides must be greater than zero.");
        }
        return a * b;
    }
}