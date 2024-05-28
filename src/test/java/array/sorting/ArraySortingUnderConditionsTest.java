package array.sorting;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class ArraySortingUnderConditionsTest
        extends TestCase
{
    @Test
    public void testSortArray()
    {
        Integer[] array = {3, 2, 1, 0, 8, 7, 0, 11, -1, 0, 5, -3};
        Integer[] expectedArray = {-3, -1, 1, 3, 5, 7, 11, 0, 0, 0, 8, 2};
        assertArrayEquals(expectedArray, ArraySortingUnderConditions.sortArray(array));
    }

    @Test
    public void testSortArrayWithAllZeros() {
        Integer[] array = {0, 0, 0, 0, 0, 0};
        Integer[] expectedArray = {0, 0, 0, 0, 0, 0};
        assertArrayEquals(expectedArray, ArraySortingUnderConditions.sortArray(array));
    }

    @Test
    public void testSortArrayWithAllPositiveOdds() {
        Integer[] array = {1, 3, 5, 7, 9, 11};
        Integer[] expectedArray = {1, 3, 5, 7, 9, 11};
        assertArrayEquals(expectedArray, ArraySortingUnderConditions.sortArray(array));
    }

    @Test
    public void testSortArrayWithAllNegativeOdds() {
        Integer[] array = {-1, -3, -5, -7, -9, -11};
        Integer[] expectedArray = {-11, -9, -7, -5, -3, -1};
        assertArrayEquals(expectedArray, ArraySortingUnderConditions.sortArray(array));
    }

    @Test
    public void testSortArrayWithAllPositiveEvens() {
        Integer[] array = {2, 4, 6, 8, 10, 12};
        Integer[] expectedArray = {12, 10, 8, 6, 4, 2};
        assertArrayEquals(expectedArray, ArraySortingUnderConditions.sortArray(array));
    }

    @Test
    public void testSortArrayWithAllNegativeEvens() {
        Integer[] array = {-2, -4, -6, -8, -10, -12};
        Integer[] expectedArray = {-2, -4, -6, -8, -10, -12};
        assertArrayEquals(expectedArray, ArraySortingUnderConditions.sortArray(array));
    }

    @Test
    public void testSortArrayWithMixedNumbers() {
        Integer[] array = {0, -1, 2, -3, 4, -5};
        Integer[] expectedArray = {-5, -3, -1, 0, 4, 2};
        assertArrayEquals(expectedArray, ArraySortingUnderConditions.sortArray(array));
    }

    @Test
    public void testSortArrayWithEmptyArray() {
        Integer[] array = null;
        try {
            ArraySortingUnderConditions.sortArray(array);
        } catch (IllegalArgumentException e) {
            assertEquals("Input array cannot be null", e.getMessage());
        }
    }
}