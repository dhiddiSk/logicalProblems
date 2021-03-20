/*
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
You can assume that the messages are decode. For example, '001' is not allowed.
 */

public class TaskFive {

    public static final int NUM = 31;

    public String encoder(String message) throws IllegalArgumentException {
        StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

            /*
            A letter’s position in Alphabet can easily be found by performing logical AND operation with the number 31.

            Note that this is only applicable on letters and not special characters.

            Every letter has an ASCII value which can be represented in binary form. Performing the bitwise and of this value with the number 31 will give the letter’s position in the alphabets.

             */
                int tempCharValue = message.charAt(i) & NUM;
                stringBuilder.append(tempCharValue);
            }

        return stringBuilder.toString();
    }

    //Verify in how many ways the encoded message can be decoded in different possible ways.

    public int decoder(String encodedMessage) throws IllegalArgumentException{

        int NoOfWays = 0;

        if (encodedMessage == null) {
            return 0;
        }

        if (encodedMessage.length() == 1) {
	     return 1;
	}

        if (encodedMessage.charAt(0) == 0) {
            return 0;
	}

        if (encodedMessage.length() == 2) {

            int temp = Integer.parseInt(encodedMessage.substring(0, 1));
            /*
            Here if the temp value is less than 27, then there are two possible ways.
            for example let's consider 24: bd or x.

             */

            if (temp < 27) {
                return 2;
            }

            /*
            Here if the temp value is greater than 26 then there is only one possibility.
            for example let's consider 28: which can be mapped to bh only.
             */
            return 1;
        }

        /*
        In case if the length of the message is greater than two.
         */
        int temp2 = Integer.parseInt(encodedMessage.substring(0, 2));

        if (temp2 < 27) {
            NoOfWays = NoOfWays + 2 + decoder(encodedMessage.substring(1, encodedMessage.length() - 1));
        }

        if (temp2 > 26) {
            NoOfWays = NoOfWays + 1 + decoder(encodedMessage.substring(1, encodedMessage.length() - 1));
        }

        return NoOfWays;

    }
}

