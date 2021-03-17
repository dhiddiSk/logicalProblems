import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TaskOneTest {

    TaskOne obj = new TaskOne();
    List<Integer> integerList = new ArrayList<Integer>();


    @Test
    public void verifyingListTest() {

        int[] array = {10, -10, 13, -2, 1};
        for (int value : array) {
            integerList.add(value);
        }

        assertTrue(obj.verifyingList(integerList, -1));
        assertTrue(obj.verifyingList(integerList, 14));
        assertFalse(obj.verifyingList(integerList, 1));
    }
}

