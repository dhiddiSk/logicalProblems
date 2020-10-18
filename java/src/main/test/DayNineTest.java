import org.junit.*;

import java.util.ArrayList;


public class DayNineTest {

    @Test
    public void LargestSumOfNonAdjacentTest(){

DCPNine obj = new DCPNine();
        ArrayList<Integer> testList = new ArrayList<Integer>();

        for(int i=0;i<5;i++){

            testList.add(i);
        }


        Assert.assertEquals(9, obj.LargestSumOfNonAdjacent(testList));

    }


}
