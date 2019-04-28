package Interview_samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Scanner;
import java.util.Vector;
import java.util.*;
/**
 level: Hard

 This problem was asked by Uber.

 Given an array of integers, return a new array such that each element at index i of the new array
   is the product of all the numbers in the original array except the one at i.

 For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 If our input was [3, 2, 1], the expected output would be [2, 3, 6].

 Follow-up: what if you can't use division?**/

public class Problem2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in).useDelimiter(" ");
    //for the dynamic storage
        Enumeration Elmts = null;
       while(sc.hasNext()) {
           Vector<Integer> vc = new Vector<Integer>();
           vc.addElement(sc.nextInt());
           Elmts = vc.elements();
        break;
       }
       while(Elmts.hasMoreElements()){
        System.out.println(Elmts.nextElement());
    }

    }
}