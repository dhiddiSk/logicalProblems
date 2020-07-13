/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
 */

import java.util.Arrays;
public class DCPFour {

    /*
   1) Since it has to be solved in Linear time, First I would sort the array.
   2) Now check for the continuity of the elements in the array,
        -if no element is found missing then, the maximum element(positive) + 1 would be the first missing positive element.
        -else consider the missing element

    */

    private int findMissInt(int[] array) {
        Arrays.sort(array);

        int returnVlaue;

        for (int i = 0; i < array.length; i++) {

            if (i<array.length-1) {

                if ((array[i] >= 0) && (array[i + 1] > 0)) {

                    if ((array[i + 1] - array[i]) > 1) {

                        return array[i] + 1;

                    }


                }

            }
        }
        return (array[(array.length)-1]+1);
    }

    public static void main(String[] args) {
        DCPFour obj = new DCPFour();
        int[] array = new int[]{3, 4, -1, 1};
        System.out.println(obj.findMissInt(array));
    }

}


