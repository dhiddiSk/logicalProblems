import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/
public class DCPTwo {

     // With Division
      public int[] ModifyArrayWithDivision(int[] array){
             // find the result of multiplication of all the elements.
          int temp = 1;
          for (int value: array) {
             temp = temp*value;
          }
           //Now divide 'temp' with each element of the array
          int[] NewArray = new int[array.length]; int tempTwo =0;
          for(int i=0;i<array.length;i++){
              tempTwo = Math.abs(temp/array[i]);
              NewArray[i] = tempTwo;
          }
          return NewArray;
          }

        // With multiplication
       public int[] ModifyArrayWithOutDivision(int[] array){
           int[] NewArray = new int[array.length];
            int tempTwo =0;

           for(int i=0; i<array.length;i++){
               int temp = 1;
               for(int j=0;j<array.length;j++){

                   // Here I need to exclude the multiplication of the element with index of i'th iteration.
                   if(j!=i){
                       temp = temp*array[j];
                   }
                   // Now add that element to the new array.
                   NewArray[i] = temp;
               }
           }

       return NewArray;

       }



      public static void main(String[] args) {
        int[] array = {10,8,9,3,1};
          int[] array2 = {1, 2, 3, 4, 5};
        DCPTwo DCPTwoobject = new DCPTwo();
        System.out.println("new array is: "+ Arrays.toString(DCPTwoobject.ModifyArrayWithDivision(array2)));
    }
}
