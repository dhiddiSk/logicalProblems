//This problem was asked by Facebook.
//
//        Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
//
//        For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
//
//        You can assume that the messages are decodable. For example, '001' is not allowed.
//


import java.util.HashMap;
import java.util.Scanner;

public class DCPSeven {


    /*
    @Method encoder: it encodes the message or string into integer format.

            for example: aaa to 111, abc to 123.
     */

    private String encoder(String message, HashMap<Character, Integer> hm) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {

            int tempCharValue = hm.get(message.charAt(i));
            stringBuilder.append(tempCharValue);
        }

        return stringBuilder.toString();
    }


    private int decoder(String encodedMessage) {

        int NoOfWays = 0;
        //Now, verify the decoded message in different possible ways.

        if(encodedMessage.length() == 1){

            NoOfWays+=1;

        }
//        if(encodedMessage.charAt(0) == 0||encodedMessage.isEmpty()){
//
//            NoOfWays+=0;
//
//        }

        if(encodedMessage.length() == 2){

            int temp = Integer.parseInt(encodedMessage.substring(0,1));
            /*
            Here if the temp value is less than 27, then there are two possible ways.
            for example let's consider 24: bd or x.

             */

            if(temp < 27){
                NoOfWays+=2;
            }

            /*
            Here if the temp value is greater than 26 then there is only one possibility.
            for example let's consider 28: which can be mapped to b and h only.
             */


            if(temp > 26){
                NoOfWays+=1;
            }
        }

        if(encodedMessage.length() > 2){

//            int temp1 = Integer.parseInt(String.valueOf(encodedMessage.charAt(0)));
//            NoOfWays +=1;

            int temp2 = Integer.parseInt(encodedMessage.substring(0,2));



            if(temp2 < 27){
                 NoOfWays = NoOfWays + 2 + decoder(encodedMessage.substring(1,encodedMessage.length()-1));
             }

            if(temp2 > 26){
                NoOfWays = NoOfWays + 1 + decoder(encodedMessage.substring(1,encodedMessage.length()-1));
             }
        }

        return NoOfWays;

    }

    public static void main(String[] args) {

        DCPSeven object = new DCPSeven();
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        int k = 1;
        for (char ch ='a'; ch <='z'; ch++) {
            hashMap.put(ch, k);
            k += 1;
        }

        Scanner sc = new Scanner(System.in);
        String inputMessage = sc.nextLine();
        String encodedMessage = object.encoder(inputMessage, hashMap);
        System.out.println("The encoded message is "+encodedMessage);
        System.out.println("No. of ways the message can be decoded is "+object.decoder(encodedMessage));

    }
}
