import java.util.Arrays;
import java.util.stream.IntStream;

public class LineStartupAlgorithm {

    /*
Given Conditions:

    1) First employee turn's all the plcs to run mode.
    2) Second employee turns every second plc's to the program mode.
    3) Third employee turn every third plc's to run mode if it's already in program mode or vice versa and similarly with the rest of employees

   Which means the employees are visiting the plc's serially based on their serial numbers.

    Logic: a) After first employee placing all the plc's in run mode, then no other employee is going to first plc. Lets consider the factors of plc's position/index. Here the first plc's factors are only 1, which means only first employee can visit the first plc.
           b) After second employee placing every second plc's in program mode, then no other employee is going to second plc. The factors of 2'nd plc's are 1 and 2, which means only first and second employees can only visit the
           second plc.
           c) Third employee can go to every third position and place it in program mode if it is in run mode, or vise versa. The factors of 3'rd plc's are 1 and 3, which means only first and third employees can only visit the third plc.
           d) Fourth employee can go to every fourth plc's and place it in program mode if it is in run mode, or vise versa. The factors of 4'th plc's are 1, 2, 4, which means first, second, fourth employees can visit the fourth plc.
           .
           .
           .
           .
           .
           .
           .
           l) Let's say twelve'th employee. Here the factors of 12'th plc's are 1, 2, 3, 4, 6, 12 which means first, second, third, fourth, sixth and 12th employees can visit the twelve'th plc.


           From the above logic it is clear that, the factors of plc's position represents the number of employees have visited that particular plc's.

          - If the number of factor's are even then it get's placed in program mode i.e with value '0' else in run mode with '1'

  */

    public int countPlcsInRunMode(int givenPlcs, int givenEmployees) {

        if (givenEmployees < 0 || givenPlcs < 0) {
            return 0;
        }

         // @plcStatus[] represents status of the plc's, 'o' if the plc is in program Mode, '1' if the plc is in run Mode.
        // By default every element at every index of array are assigned with zero's
        int[] plcStatus = new int[givenPlcs];

        // Now calculate number of factors, i.e how many employees can visit every single plc's


        for (int plc = 1; plc <= givenPlcs; plc++) {

            int numberOfFactors = 0;

            // here we calculate number of times every plc's are visited by the employees

            for (int employee = 1; employee <= plc; employee++) {

                if (plc % employee == 0 && employee <= givenEmployees) {
                    numberOfFactors++;
                }

            }


            // Now check if the numberOfFactors is even or odd, if even then that particular plc will be in program mode(value '0'), else in run mode(value '1').

            if (numberOfFactors % 2 != 0) {

                // index as plc-1 since array starts from zero
                plcStatus[plc - 1] = 1;

            }
        }


        // System.out.println(Arrays.toString(plcStatus));
        return (int) IntStream.of(plcStatus).filter(value -> value == 1).count();

    }

}
