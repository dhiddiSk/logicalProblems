import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class TaskSevenTest {
    @Test
    public void pickElement(){

        TaskSeven object = new TaskSeven();

        int[] streamInput = {1,2,3,4};

        final int returnValue = object.randomPick(streamInput);

        Assert.assertTrue(IntStream.of(streamInput).anyMatch(n->n == returnValue));

    }

}
