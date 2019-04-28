package Interview_samples; /**
 This problem was asked by Facebook.

 Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

 For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

 You can assume that the messages are decodable. For example, '001' is not allowed.
 */
import java.util.*;
public class Problem7 {


    public static void main(String args[]){
    char[] alphabet = " abcdefghijklmnopqrstuvwxyz".toCharArray();

    HashMap ht = new HashMap();
   for(int k=1;k<=26;k++){
           ht.put(k,alphabet[k]);
       }
   Scanner  sc = new Scanner(System.in);
     int number = sc.nextInt();
      if(number!=0 && number<=26){
          System.out.println(ht.get(number));
      }
       else if(number>100){
          char number_cast = (char)number;


      }



   }




}
