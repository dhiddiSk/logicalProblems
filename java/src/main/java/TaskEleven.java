/*
Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?



       case1: Sum of non-adjacent elements that refers to odd or even positions.
      then follow case2: Check for the sum of all non adjacent possible positions
                           a) For example with one element in gap
                           b) with two elements in gap
                           b) With three elements in gap
                           c) and soon till n-2

         or

       Check for the sum of maximum elements of the array. Here, gradually walk through all the elements and make sure
       they are not adjacent to already chosen elements.
  */

import java.util.ArrayList;
import java.util.Collections;

public class DayNine {

    private int totalLargestEvenSum = 0;
    private  int totalLargestOddSum = 0;

    public int LargestSumOfNonAdjacent(ArrayList<Integer> userinputs) {

        int lengthOfArray = userinputs.size();
        int difference = 1;
        ArrayList<Integer> largestSumArray = new ArrayList<Integer>();

        for (int possbilities = 0; possbilities < lengthOfArray - 2; possbilities++) {

            for (int i = 0; i < userinputs.size(); i++) {

                if (i % 2 == 0) {

                    if((i+possbilities)<lengthOfArray){
                        totalLargestEvenSum += userinputs.get(i+possbilities);
                    }

                } else {
                    if((i+possbilities)<lengthOfArray) {
                        totalLargestOddSum += userinputs.get(i + possbilities);
                    }  }

            }

            largestSumArray.add(Math.max(totalLargestEvenSum, totalLargestOddSum));
        }

        return Collections.max(largestSumArray);

    }
}
