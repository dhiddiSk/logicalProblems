import org.junit.*;

import java.util.HashSet;
import java.util.Set;


public class ElevenTest {
    @Test
    public void testEleven(){

        DayEleven eleven = new DayEleven();

        Set<String> toQuery = new HashSet<>();

        toQuery.add("sai");
        toQuery.add("saikrishna");
        toQuery.add("saikrishnaVarma");
        toQuery.add("dhiddisai");

        Set<String> afterQuery = new HashSet<>();

       afterQuery = eleven.StringQuery("sai", toQuery);

       Assert.assertTrue(afterQuery.contains("sai"));
       Assert.assertTrue(afterQuery.contains("saikrishna"));
       Assert.assertTrue(afterQuery.contains("saikrishnaVarma"));
       Assert.assertFalse(afterQuery.contains("dhiddisai"));



    }


}
