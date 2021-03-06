public class CryptographyEncodingAndDecoding {


    StringBuilder builder;

    public String encode(String message, int rotations)throws IllegalArgumentException {

        if (message.length() == 0 || rotations < 1) {
            return message;
        }

        builder = new StringBuilder();

        // Iterate through every character of given string and perform the encoding operations
        for (int ch = 0; ch < message.length(); ch++) {
            char c = message.charAt(ch);
            int modulusResult;

            // As per given conditions, encode only the alphabetical characters which satisfy the ASCII Standards
            if ((((int) c >= 65) && ((int) c <= 90)) || (((int) c >= 97) && ((int) c <= 122))) {

                // Add rotations value to the existing ascii char value
                int charValueAfterRotation = (int) c + rotations;


            /*
             Check if the character is uppercase or lowercase. Since the encryption of characters have to be performed with in the boundaries of letters a - z and A - Z, we need
             boundary values which can be used for operations. For this I have used Ascii table values and performed modulus operations in case if the values are crossing the
             boundaries after performing rotations.

             Since the boundary values for uppercase and lowercase letters are different, I have made use of condition.
            */

                int asciiCharValueAfterModulusResult;
                if (Character.isUpperCase(c)) {

                    if (charValueAfterRotation > 90) {

                        modulusResult = charValueAfterRotation % 90;
                        asciiCharValueAfterModulusResult = 64 + modulusResult;
                        builder.append((char) asciiCharValueAfterModulusResult);

                    } else {

                        builder.append((char) charValueAfterRotation);
                    }

                }

                // in case of lowercase letters
                else {

                    if (charValueAfterRotation > 122) {

                        modulusResult = charValueAfterRotation % 122;
                        asciiCharValueAfterModulusResult = 96 + modulusResult;
                        builder.append((char) asciiCharValueAfterModulusResult);

                    } else {

                        builder.append((char) charValueAfterRotation);
                    }


                }


            }


            // In case, if the characters are non alphabetic then they are unaffected.
            else {
                builder.append(c);
            }


        }
        return builder.toString();

    }


    public String decode(String message, int rotations)throws IllegalArgumentException{

        if (message.length() == 0 || rotations < 1) {
            return message;
        }

        // StringBuilder is initialized to build the string formed after decoding.
         builder = new StringBuilder();


        // Iterate through every character of given string and perform the decoding operations
        for (int ch = 0; ch < message.length(); ch++) {

            char c = message.charAt(ch);
            int difference;

            // As per given conditions, decode only the alphabetical characters which satisfy the ASCII Standards
            if ((((int) c >= 65) && ((int) c <= 90)) || (((int) c >= 97) && ((int) c <= 122))) {

                // subtract rotations value to the existing ascii char value
                int asciiCharValueAfterRotation = (int) c - rotations;



            /*
             Check if the character is uppercase or lowercase. Since the decryption of characters have to be performed with in the boundaries of letters a - z and A - Z, we need
             boundary values which can be used for operations. For this I have used Ascii table values and calculated differences in case if the values are crossing the
             boundaries after performing rotations.
                         */

                int asciiCharValueAfterDifference;

                if (Character.isUpperCase(c)) {

                    if (asciiCharValueAfterRotation < 65) {

                        difference = 65 - asciiCharValueAfterRotation;
                        asciiCharValueAfterDifference = 91 - difference;
                        builder.append((char) asciiCharValueAfterDifference);

                    } else {

                        builder.append((char) asciiCharValueAfterRotation);
                    }

                } else {

                    if (asciiCharValueAfterRotation < 97) {

                        difference = 97 - asciiCharValueAfterRotation;
                        asciiCharValueAfterDifference = 123 - difference;
                        builder.append((char) asciiCharValueAfterDifference);

                    } else {

                        builder.append((char) asciiCharValueAfterRotation);
                    }


                }


            }

            // In case, if the characters are non alphabetic then they are unaffected.
            else {
                builder.append(c);
            }
        }

        return builder.toString();

    }

    public static void main(String[] args) {

        CryptographyEncodingAndDecoding obj = new CryptographyEncodingAndDecoding();

        System.out.println("The result after encoding the string innoWake rules with 9 rotations is : " + obj.encode("HELLO", 5));
        System.out.println("The result after decoding the string IUHUR with 6 rotations is : " + obj.decode("BTWQI", 5));

    }


}

