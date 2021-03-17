import java.util.Objects;

/*
Given an array of integers, find the first missing positive integer in linear time and constant space.

In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
*/
public class TaskThree {

    public int findMissElement(int[] array) throws IllegalArgumentException  {
        /*
        As per the given question, the goal is to find the least positive number missing in the given array.
        1) Integer '0' is neither positive nor negative number. So the first positive number would be 1, now traverse through whole array and check for the value matching the for loop indexes.
        2) If we find all the values are present in the given array then the least missing positive number would be lengthOfArray + 1
        */

        // for suppose the array is [0, -1, 2, 3, 5, 7, -2, 9]

        // Throws an NPE with a custom error message if obj is null
        Objects.requireNonNull(array, "The parameter array must not be null");

        for (int index = 0; index < array.length; ) {

            if (array[index] <= 0 || array[index] > array.length || array[index] - 1 == index) {
                index++;
            } else {
                swap(array, index, array[index]);
            }
        }

        int i=0;
        for (i = 0; i < array.length; i++) {

            if (i != array[i] - 1) {
                break;
            }
        }
        return i + 1;
    }

    public void swap(int[] array, int index, int indexValue) {

        int temp = array[indexValue-1];
        array[indexValue-1] = array[index];
        array[index] = temp;

    }

}



