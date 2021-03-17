import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class DayFifteenTest {
    @Test
    public void pickElement(){

        DCPFifteen object = new DCPFifteen();

        int[] streamInput = {1,2,3,4};

        final int returnValue = object.randomPick(streamInput);

        Assert.assertTrue(IntStream.of(streamInput).anyMatch(n->n == returnValue));

    }

}
