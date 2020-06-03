import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class DCPOneTest {

    DCPOne obj = new DCPOne();
    List<Integer> integerList = new ArrayList<Integer>();


    @Test
    void verifyingList() {
        integerList.add(1);integerList.add(-2);integerList.add(10);integerList.add(-10);integerList.add(13);
        assertTrue(obj.verifyingList(integerList, 14));
        assertFalse(obj.verifyingList(integerList, 1));
    }
}