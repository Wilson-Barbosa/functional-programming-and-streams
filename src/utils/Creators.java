package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Creators {

    /**
     * <p>
     * Creates and returns a populated array of integers containing
     * <code>size</code> elements inside it.
     * </p>
     * <p>
     * The array contains elements from 0 to <code>upperBound</code> inclusive and
     * allows for duplicate numbers.
     * </p>
     * 
     * @param size is the array's size
     * @param upperBound the upperBound limit for array's number size
     * @return the populated array
     */
    public static Integer[] generateRandomArray(int size, int upperBound) {
        Integer[] array = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(upperBound);
        }

        return array;
    }

    public static List<Integer> generateRandomList(int size, int upperBound) {
        return Arrays.asList(generateRandomArray(size, upperBound));
    }

}
