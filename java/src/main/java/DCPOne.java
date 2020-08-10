/*
Google interview question:

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DCPOne {


   public boolean verifyingList(List<Integer> elementList, int k){
       // first sort the elements of the list in ascending or descending order
       Collections.sort(elementList);
       //any given number 'x' can be sum of other two numbers which are less than the x. this applies in case if the list doesn't contain
       //zero element

       int min = Collections.min(elementList);int temp = 0; boolean result = false;

       // this condition checks if the list contains the k value and zero, this means k + 0 = k
       if(elementList.contains(0) && elementList.contains(k)){
               return true;
       }

       // here if minimum value of the list is greater than or equal k then results in k + any number > K
       else if(min>=k){
               return false;
       }
       /*
       For example lets take an array [1,2,3,4,5,6,7,8,9].

       case 1: If we verify with the adjacent elements of the array/list then, there is chance of missing some cases
       case 2: If we start comparing each element with all the elements then it can have a very large time complexity.
       case 3: So, the simple solution is-> K = temp + someElementInTheList. We have K and someElementInTheList, then easy to find the temp.

         Let's work with case 3.
         */

       else {
            for(int i =0; i<elementList.size();i++){
                temp = k - elementList.get(i);
                   if(elementList.contains(temp)){
                       result = true;
                   }
            }
            return result;



       }




    }
    public static void main(String[] args) {

        List<Integer> elementList = new ArrayList<Integer>();
        int[] array = {10,8,9,3,1}; int k = 28;
        for (int value : array) {
            elementList.add(value);
        }
     DCPOne object = new DCPOne();
        System.out.println("Does any two numbers from the given list add up to k: "+object.verifyingList(elementList,k));
    }
}