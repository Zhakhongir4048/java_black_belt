package Раздел_7_Streams;

import java.util.Arrays;

public class MethodSorted {

    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 19};
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        System.out.println("sortedArray = " + Arrays.toString(sortedArray));
    }

}