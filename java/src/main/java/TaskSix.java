/*
This problem was asked by Twitter.

Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
 */


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TaskSix {

    public Set<String> StringQuery(String prefix, Set Strings){

        Set<String> queriedSet = new HashSet<>();

        int prefixLenght = prefix.length();

        Iterator<String> it = Strings.iterator();

        String temp;

       while(it.hasNext()){

          temp = it.next();

          if(temp.substring(0,prefixLenght).equalsIgnoreCase(prefix)){
              queriedSet.add(temp);
          }
       }

       return queriedSet;

    }
}
