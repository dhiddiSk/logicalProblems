import org.junit.*;


public class CryptographyTaskTest {

    private static final CryptographyTask CRYPTOGRAPHY_TASK = new CryptographyTask();

    @Test
    public void testWithGivenExample(){
        Assert.assertEquals("MJQQT", CRYPTOGRAPHY_TASK.encode("HELLO",5));
        Assert.assertEquals("WORLD", CRYPTOGRAPHY_TASK.decode("BTWQI",5));
    }

    @Test
   public void testWithUncertainVlaues(){
       Assert.assertNull(CRYPTOGRAPHY_TASK.encode("", 5));
       Assert.assertNull(CRYPTOGRAPHY_TASK.decode("", 10));
       Assert.assertEquals("WORLD", CRYPTOGRAPHY_TASK.encode("WORLD",0));
       Assert.assertEquals("MJQQT", CRYPTOGRAPHY_TASK.encode("MJQQT",-2));
       Assert.assertEquals("WORLD", CRYPTOGRAPHY_TASK.decode("WORLD",0));
       Assert.assertEquals("MJQQT", CRYPTOGRAPHY_TASK.decode("MJQQT",-5));
       Assert.assertNull(CRYPTOGRAPHY_TASK.encode("", 0));

   }

}
