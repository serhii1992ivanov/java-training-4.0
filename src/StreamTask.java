import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
            .filter(num -> num % 2 == 0)
            .map(num -> num * num)
            .sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
            .filter(num -> num % 2 != 0)
            .sorted()
            .toArray();
    }
}