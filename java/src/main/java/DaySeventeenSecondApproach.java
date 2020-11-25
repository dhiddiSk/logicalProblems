import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DaySeventeenSecondApproach {

    public static String systemFilePath;

        DaySeventeenSecondApproach(String filePath){
            systemFilePath = filePath;
        }


    // I have to write a method such that it accepts the regular expression pattern and returns all the subsequence matched strings in the form of an array

            public String[] findSubDirectories(String filePath, String regex){


                Pattern pt = Pattern.compile(regex);
                Matcher mt = pt.matcher(filePath);

                System.out.println("The total matched subsequences for given regular expression are" + mt.groupCount());

                // ArrayList is to store the indexes
                ArrayList<Integer> indexes = new ArrayList<Integer>();

                while (mt.find()) {
                    indexes.add(mt.start());
                    indexes.add(mt.end());
                }

                // Array to store the subdirsPaths
                String[] subdirsPaths = new String[indexes.size() / 2];
                // extract the paths and add to the array
                for (int i = 0; i < indexes.size() / 2; i++) {
                    subdirsPaths[i] = filePath.substring(indexes.get(0), indexes.get((2)));
                }

                return subdirsPaths;
            }


            public int longestAbsoultePath(){

                // First verify if the givenFilePath contains files, as per the given condition the directory must contain a period "." if there is no file then return 0
                if(!systemFilePath.contains(".")){
                    return 0;
                }

                String regexForSubdir = "(?<!sub)subdir\\d*";
                String[] subDirectories = findSubDirectories(systemFilePath, regexForSubdir);


                // Now check if the subDirectories contains any subsubdirectories, if they contains any then get there paths too using findSubDirectories.

                String regexForSubSubdir = "subsubdir\\d*";

                // MultiMap is used and initialized to store the subsubdirectories as values and subdirectory as key.

                Multimap<Integer, String> multimap = ArrayListMultimap.create();


                for(int i=0; i<subDirectories.length; i++){
                    boolean verifyPresenceOfTheSubSubDir =  subDirectories[i].contains("subsubdir");

                    if(verifyPresenceOfTheSubSubDir){
                        // Now call the findSubDirectories with regex and the path of the subdir's
                    String[] subsubDirectories = findSubDirectories(subDirectories[i], regexForSubSubdir);

                    // Now store all the subsubDirectories into multimap

                        for(int j=0; j<subsubDirectories.length; j++){
                            multimap.put(i,subsubDirectories[j]);
                        }
                    }
                }

                // now call the searchFile method, which traverses through the whole directories and subdirectories returns the longest absolute path

                String foundPathAfterTraversing = searchFile(subDirectories, multimap);

                return foundPathAfterTraversing.length();


         }

    private String searchFile(String[] subDirectories, Multimap<Integer, String> multimap) {

           // Now traverse through all the subdirectories, check if they contain any subdirectories then check if they contain any files in those subdirectories

                    for(int i=0; i<subDirectories.length; i++){

                        // First check if the subDirectories contain any files or not, if it contains then check if it has any subsubdirectories.

                        if(subDirectories[i].contains("file") || subDirectories[i].contains(".")){

                            // now check for subdirectories;

                            Collection<String> paths =  multimap.get(i);




                        }





                    }






            return null;

    }


}

