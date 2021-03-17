/*
This problem was asked by Facebook.

A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.

 */


import org.apache.logging.log4j.core.util.ArrayUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.lang.*;
import java.util.stream.IntStream;

public class DayNinteen {


     // Here the matrix argument is passed to the cal method which calculates the cos
    public int calMinCost(int[][] matrix){
                int totalNumberOfHouses = matrix.length;
                if(totalNumberOfHouses == 0){
                    return 0;
                }

                int totalNumberOfColors = matrix[0].length;
                return verifyMinimumCosts(matrix, totalNumberOfHouses, totalNumberOfColors);

    }

     // @method verifyMinimumCosts traverses through all the houses in the matrix w.r.t costs aligned with all the available colors. Also make sure that the color of the current house is no same as the previous house.
    public int verifyMinimumCosts(int[][] matrix, int totalNumberOfHouses, int totalNumberOfColors){

        //Create a new hash map in order to store the cost of the house with cheapest cost
        HashMap<Integer,Integer> minimumHouseCosts = new HashMap<>();

        for(int houseNumber=0; houseNumber<totalNumberOfHouses; houseNumber++){

            // Now check for the minimum cost of color for this houseNumber.
            int[] colorsCostArrayForHouse = matrix[houseNumber];
            int lowerCostOfColorForHouse = Arrays.stream(colorsCostArrayForHouse).min().getAsInt();

            //int lowestCostColorColumnSerialNumber =  Arrays.asList(colorsCostArrayForHouse).indexOf(lowerCostOfColorForHouse);

            int lowestCostColorColumnSerialNumber = IntStream.range(0,colorsCostArrayForHouse.length).filter(i -> lowerCostOfColorForHouse == colorsCostArrayForHouse[i]).findFirst().orElse(-1);



            // check if the hashMap minimumHouseCosts has any entries, if then check for the previous houseNumber color and recheck for another lower cost in case the colorsCostArrayForHouse are same.
            if(!minimumHouseCosts.isEmpty()){

                    int previousHouseLowestCostColorColumnSerialNumber = minimumHouseCosts.get(houseNumber-1);

               if( previousHouseLowestCostColorColumnSerialNumber == lowestCostColorColumnSerialNumber){

                   // find the second highest color cost because to statisfy the given condition that the color of the current house is not same as the previous house.

                   int[] copyOfColorsCost = colorsCostArrayForHouse;
                   Arrays.sort(copyOfColorsCost);
                   int secondLowestCost = copyOfColorsCost[1];
                   int secondLowestCostSerialNumber =  IntStream.range(0,colorsCostArrayForHouse.length).filter(i -> secondLowestCost == colorsCostArrayForHouse[i]).findFirst().orElse(-1);
                   minimumHouseCosts.put(houseNumber,secondLowestCostSerialNumber);
               }

               else {

                   minimumHouseCosts.put(houseNumber,lowestCostColorColumnSerialNumber);
               }



            }

            //The else condition gets executed when the hash map is empty or during the computation for first house
            else{
                minimumHouseCosts.put(houseNumber,lowestCostColorColumnSerialNumber);
            }


        }

        // Now compute the total minimum cost for building the houses with colors.

        int totalCost = 0;
        for(int houseCost = 0; houseCost< minimumHouseCosts.size(); houseCost++){

           int minColorColumIndexForEachHouse = minimumHouseCosts.get(houseCost);
            //System.out.println(minColorColumIndexForEachHouse);

           totalCost = totalCost + matrix[houseCost][minColorColumIndexForEachHouse];

        }

        return totalCost;


    }

}
