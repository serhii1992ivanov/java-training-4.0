/**
 * Compute the sum and average for running integers using loops.
 */
public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        int total = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            total += i;
        }
        return total;
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        int total = sum(lowerBound, upperBound);
        int count = (upperBound - lowerBound + 1); // Total numbers from lowerBound to upperBound
        return count > 0 ? (double) total / count : 0; // Avoid division by zero
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        int total = 0;
        int count = 0;
        int index = 0;

        do {
            if (index < numbers.length) {
                total += numbers[index];
                count++;
            }
            index++;
        } while (index < numbers.length);

        return count > 0 ? (double) total / count : 0; // Avoid division by zero
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Sum from 1 to 10: " + sum(1, 10)); // 55
        System.out.println("Average from 1 to 10: " + average(1, 10)); // 5.5

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + sum(numbers)); // 15
        System.out.println("Average of array: " + average(numbers)); // 3.0
    }
}
