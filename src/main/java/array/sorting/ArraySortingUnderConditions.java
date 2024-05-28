package array.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * The ArraySortingUnderConditions class contains the main method which sorts an array based on certain conditions.
 */
public class ArraySortingUnderConditions
{
    /**
     * The program's entry point. The main method creates an array, displays it, then reorders it and displays it again.
     * @param args not used
     */
    public static void main(String[] args) {
        // Creating an array with random values and displaying it
        Integer[] array = new Integer[12];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(20) - 10; // Generates random numbers from -10 to 10
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(array));

        // Reorder the array
        array = sortArray(array);

        // Display the sorted array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }

    /**
     * Method to sort an array based on certain conditions.
     * @param array Array to be sorted
     * @return Sorted array
     */
    public static Integer[] sortArray(Integer[] array) {
        return Arrays.stream(array)
                .sorted((o1, o2) -> {
                    if (o1 % 2 != 0 && o2 % 2 != 0) {
                        return o1.compareTo(o2);
                    }
                    if (o1 == 0 && o2 == 0) {
                        return 0;
                    }
                    if (o1 % 2 != 0) {
                        return -1;
                    }
                    if (o2 % 2 != 0) {
                        return 1;
                    }
                    if (o1 == 0) {
                        return -1;
                    }
                    if (o2 == 0) {
                        return 1;
                    }
                    return o2.compareTo(o1);
                })
                .toArray(Integer[]::new);
    }
}
