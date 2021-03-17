import org.junit.*;

import static org.junit.Assert.assertEquals;

public class LineStartupAlgortihmTest {

    private static final LineStartupAlgorithm STARTUP_ALGORITHM = new LineStartupAlgorithm();

    @Test
  public  void testWithSameNumberOfPLCSAndEmployees(){

        assertEquals(0, STARTUP_ALGORITHM.countPlcsInRunMode(0, 0));
        assertEquals(10, STARTUP_ALGORITHM.countPlcsInRunMode(100, 100));
        assertEquals(12, STARTUP_ALGORITHM.countPlcsInRunMode(150, 150));
    }

    @Test
    public  void testWithDifferentNumberOfPLCSAndEmployees(){

        assertEquals(0, STARTUP_ALGORITHM.countPlcsInRunMode(2, 0));
        assertEquals(3, STARTUP_ALGORITHM.countPlcsInRunMode(10, 1000));
        assertEquals(5, STARTUP_ALGORITHM.countPlcsInRunMode(16, 13));
    }

    @Test
    public  void testWithNegativeNumberOfPLCSOrEmployees(){

        assertEquals(0, STARTUP_ALGORITHM.countPlcsInRunMode(-2, 0));
        assertEquals(0, STARTUP_ALGORITHM.countPlcsInRunMode(10, -1000));
        assertEquals(0, STARTUP_ALGORITHM.countPlcsInRunMode(-16, -13));
    }




}
