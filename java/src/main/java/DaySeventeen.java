/*
Good morning! Here's your coding interview problem for today.

This problem was asked by Google.

Suppose we represent our file system by a string in the following manner:

The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:

dir
    subdir1
    subdir2
        file.ext
The directory dir contains an empty sub-directory subdir1 and a sub-directory subdir2 containing a file file.ext.

The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:

dir
    subdir1
        file1.ext
        subsubdir1
    subdir2
        subsubdir2
            file2.ext
The directory dir contains two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext and an empty second-level sub-directory subsubdir1. subdir2 contains a second-level sub-directory subsubdir2 containing a file file2.ext.

We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes).

Given a string representing the file system in the above format, return the length of the longest absolute path to a file in the abstracted file system. If there is no file in the system, return 0.

Note:

The name of a file contains at least a period and an extension.

The name of a directory or sub-directory will not contain a period.
*/

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DaySeventeen {

  // String treePath;

//    DaySeventeen(String treePath){
//
//        //As per the given condition, the file name must contain a period('.') for sure.
//        if(treePath.contains(".")){
//            this.treePath = treePath;
//        }
//        //Exit the execution of the program, when the given string doesn't contain any file i.e a period symbol
//        else {
//            System.exit(1);
//
//        }
//    }


    public void splitTheStringToDirectories(String filePath) {

        /*
            Solution: First get all the subdirectories in separate strings. This can be achieved by using a regular expression.
                  Second check if the subdirectories contains files.
                  Finally get the longest absolute path
         */


        /*
            As per the given condition,
            first check if the directory contains files or not, if not then return 0. One can perform this by verifying with string "file".
            Also mentioned that the file can contain an extension with period('.') contained in the file name with an extension.

         */

            if(filePath.contains(".")||filePath.contains("file")) {

                String regex = "(?<!sub)subdir\\d*";
                String text = filePath;

                Pattern pt = Pattern.compile(regex);
                Matcher mt = pt.matcher(text);

                System.out.println("The total matched subsequences for given regular expression are" + mt.groupCount());

                // System.out.println(mt.matches());

                //The indexes start from zero
                ArrayList<Integer> indexes = new ArrayList<Integer>();

                while (mt.find()) {
                    indexes.add(mt.start());
                    indexes.add(mt.end());
                }

                // Array to store the subdirsPath
                String[] subdirsPath = new String[indexes.size() / 2];

                int index = 0;
                // extract the paths and add to the array
                for (int i = 0; i < indexes.size() / 2; i++) {
                    String.format("The paths are" + filePath.substring(indexes.get(0), indexes.get((2))));
                    subdirsPath[i] = filePath.substring(indexes.get(0), indexes.get((2)));
                    // Now check if each subdir's contains any further subsubdir's, if then split the subsubdir's and store in maps with keys and values. Here the key must me the serial number of subdir and value must be the path of subsubdir's
                    // In this case I have to use a mapping where it can accept more than one duplicate keys, because there are cases where one subdir can contain multiple subsubdir's.

                  boolean verifyTheSubSubDir =  subdirsPath[i].contains("subsubdir");
                  if(verifyTheSubSubDir){

                     checkForSubSubDirs(subdirsPath[i], i);



                    }
                }
            }
    }

    private void checkForSubSubDirs(String s, int subStringSerialNumber) {




    }

    //Now check with every subdir, whether it contains any other subsubdirs, while parsing check which subdir or subsubdir contains the file. After that check for the longest path, which is just chec

    public static void main(String[] args) {
        DaySeventeen obj = new DaySeventeen();
        obj.splitTheStringToDirectories("dir\\n\\tsubdir1\\n\\t\\tfile1.ext\\n\\t\\tsubsubdir1\\n\\tsubdir2\\n\\t\\tsubsubdir2\\n\\t\\t\\tfile2.ext");

    }
}


