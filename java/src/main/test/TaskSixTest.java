import org.junit.*;

import java.util.HashSet;
import java.util.Set;


public class TaskSixTest {
    @Test
    public void testEleven(){

        TaskSix obj = new TaskSix();

        Set<String> toQuery = new HashSet<>();

        toQuery.add("sai");
        toQuery.add("saikrishna");
        toQuery.add("saikrishnaVarma");
        toQuery.add("dhiddisai");

        Set<String> afterQuery = new HashSet<>();

       afterQuery = obj.StringQuery("sai", toQuery);

       Assert.assertTrue(afterQuery.contains("sai"));
       Assert.assertTrue(afterQuery.contains("saikrishna"));
       Assert.assertTrue(afterQuery.contains("saikrishnaVarma"));
       Assert.assertFalse(afterQuery.contains("dhiddisai"));



    }


}
