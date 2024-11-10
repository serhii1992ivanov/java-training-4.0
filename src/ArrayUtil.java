import java.util.HashSet;
import java.util.Set;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        Set<String> commonElements = new HashSet<>();
        Set<String> elementsSet = new HashSet<>();

        // Add all elements of the first array to a set
        for (String element : array1) {
            elementsSet.add(element);
        }

        // Check for common elements in the second array
        for (String element : array2) {
            if (elementsSet.contains(element)) {
                commonElements.add(element);
            }
        }

        // Convert the set of common elements to an array
        return commonElements.toArray(new String[0]);
    }
}