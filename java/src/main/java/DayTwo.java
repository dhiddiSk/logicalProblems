/*

Given an array of integers, return a new array such that each element at index 'i' of the new array is the product of all the numbers in the original array except the one at 'i'.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/
public class DayTwo {

    // With Division
    public int[] ModifyArrayWithDivision(int[] array) throws IllegalArgumentException {
        // find the result of multiplication of all the elements.
        int[] NewArray = new int[array.length];
        if (array.length <= 0) {
            throw new IllegalArgumentException("Invalid array passed");
        }

        int temp = 1;
        for (int value : array) {
            temp = temp * value;
        }
        //Now divide 'temp' with each element of the array

        int tempTwo;
        for (int i = 0; i < array.length; i++) {
            tempTwo = Math.abs(temp / array[i]);
            NewArray[i] = tempTwo;
        }
        return NewArray;
    }

    // With multiplication
    public int[] ModifyArrayWithMultiplication(int[] array) {
        int[] NewArray = new int[array.length];

        if (array.length <= 0) {
            throw new IllegalArgumentException("Invalid array passed");
        }


        for (int i = 0; i < array.length; i++) {
            int temp = 1;
            for (int j = 0; j < array.length; j++) {

                // Here I need to exclude the multiplication of the element with index of i'th iteration.
                if (j != i) {
                    temp = temp * array[j];
                }
                // Now add that element to the new array.
                NewArray[i] = temp;
            }
        }

        return NewArray;

    }
}

