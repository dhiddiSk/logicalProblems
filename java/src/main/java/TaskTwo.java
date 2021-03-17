/*
Given an array of integers, return a new array such that each element at index 'i' of the new array is the product of all the numbers in the original array except the one at 'i'.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/
public class TaskTwo {
    
    //with division
    public int[] ModifyArrayWithDivision(int[] array) throws IllegalArgumentException {

        if (array.length <= 0) {
            throw new IllegalArgumentException("Invalid array passed");
        }

        // find the result of multiplication of all the elements.
        int[] NewArrayAfterDivisions = new int[array.length];
        int valueAfterMultiplications = 1;
        for (int value : array) {
            valueAfterMultiplications = valueAfterMultiplications * value;
        }


        //Now divide 'valueAfterMultiplications' with each element of the array
        int valueAfterDivision;
        for (int i = 0; i < array.length; i++) {
            valueAfterDivision = Math.abs(valueAfterMultiplications / array[i]);
            NewArrayAfterDivisions[i] = valueAfterDivision;
        }
        return NewArrayAfterDivisions;
    }

    // With multiplication
    public int[] ModifyArrayWithMultiplication(int[] array) throws IllegalArgumentException{
        int[] NewArrayAfterMultiplications = new int[array.length];

        if (array.length <= 0) {
            throw new IllegalArgumentException("Invalid array passed");
        }

        for (int i = 0; i < array.length; i++) {
            int valueAfterMultiplication = 1;
            for (int j = 0; j < array.length; j++) {

                // Here I need to exclude the multiplication of the element with index of i'th iteration.
                if (j != i) {
                    valueAfterMultiplication = valueAfterMultiplication * array[j];
                }
                // Now add that element to the new array.
                NewArrayAfterMultiplications[i] = valueAfterMultiplication;
            }
        }

        return NewArrayAfterMultiplications;

    }
}

