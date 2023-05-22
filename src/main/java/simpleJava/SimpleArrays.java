package simpleJava;

import simpleJava.simpleFor.SimpleFor;

import java.util.Arrays;
public class SimpleArrays {
    public static <T> T[] reverseArray(T[] array) {
        T[] reversedArray = Arrays.copyOf(array, array.length);
        SimpleFor.forI(0,array.length/2, i -> {
            T temp = reversedArray[i];
            reversedArray[i] = reversedArray[array.length - i - 1];
            reversedArray[array.length - i - 1] = temp;
        });
        return reversedArray;
    }
}