public class GoogleChallenge1 {


    public static void main(String[] args) {
        System.out.println(solution(3));
    }


    public static String solution(int i){

     // now I need to write a prime number where it's length needs to be greater than or equal 10005 indexes.
     // now every minion will be having one index which are assigned five numbers next to the current requested index.


        // For example: the first index needs next four digits which is n+4
        // For example: the 100th index needs next four digits which is n+4
        // For example: the 10000th index needs next four digits which is n+4

        StringBuilder concatenatedPrimeNumber = new StringBuilder("23");
        int numbers=4;
        //now verify for each number, whether it's prime number or not.
        while (concatenatedPrimeNumber.length() <= i+4) {

                 int count = 0;

                // check if the number are odd numbers
                if(numbers%2 == 1){

                    // The goal is to append a prime number in the string format and make sure it satisfies that the concatenated string has indexes which are more than or equal to i+4
                    for (int k = 2; k < numbers; k++) {

                       // here we got to know if the number is prime or not, if not prime numbers%k == 0 else not zero
                        if((numbers % k == 0)){
                            count = 0;
                            break;
                        }
                        else {
                            count = 1;
                        }
                    }
                }

              if (count==1) {
               concatenatedPrimeNumber.append(numbers);

              }

            numbers+=1;
        }


        return concatenatedPrimeNumber.substring(i,i+5);
    }

}
