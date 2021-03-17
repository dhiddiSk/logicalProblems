/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Facebook.

Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.

 */


/*
solution: Let's consider an array, where element is linked with it's index. Find the size of the array and choose a random value from
          0 to the size of the array. Then that particular index element is the random element.


 */

import java.util.Random;

public class DayFifteen {

    public int randomPick(int[] stream){

         int size = stream.length;

        Random random = new Random();

        return stream[random.nextInt(size)];
    }

}
