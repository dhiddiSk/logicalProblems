import org.junit.Assert;
import org.junit.Test;

public class DayFourTest {

    DayFour obj = new DayFour();

    @Test
    public void missingNumberTest(){

       int[] test = {0,-1,1,2,3,5,4,7};
       int[] test2 = {3,4,-1,1};
        Assert.assertEquals(6,obj.findMissElement(test));
        Assert.assertEquals(2,obj.findMissElement(test2));

    }
}

