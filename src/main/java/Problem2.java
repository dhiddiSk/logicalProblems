import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
/**
 level: Hard

 This problem was asked by Uber.

 Given an array of integers, return a new array such that each element at index i of the new array
   is the product of all the numbers in the original array except the one at i.

 For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 If our input was [3, 2, 1], the expected output would be [2, 3, 6].

 Follow-up: what if you can't use division?**/


class Solver2 {
    int[] input_copy;
    int[] abc = new int[5];

    public Solver2(int[] input) {
        input_copy = input;
        System.out.println(Arrays.toString(input_copy));
    }

    public void verify() {
        int k = 1;
        for (int i = 0; i <= 4; i++) {
            k *= input_copy[i];
        }
        System.out.println("the product of all the numbers is:" + k);
        for(int j=0;j<=4;j++){
            input_copy[j] = (k/input_copy[j]);
        }
        System.out.println(Arrays.toString(input_copy));
    }

}
public class Problem2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // write code for accepting unknown number of integers seperated by delimiter(space) and store in to vector
        // break the loop when the entry is empty
         int[] input = new int[5];
        System.out.println("Please enter the 5 values:");
        for(int i=0;i<5;i++){
            input[i] = sc.nextInt();
        }
      Solver2 obj1 = new Solver2(input);
         obj1.verify();
    }
}
