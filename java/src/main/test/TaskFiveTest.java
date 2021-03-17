import org.junit.Assert;
import org.junit.Test;

public class TaskFiveTest {

    TaskFive obj = new TaskFive();


    @Test
    public void encoderTest() {
        Assert.assertEquals("111", obj.encoder("aaa"));
        Assert.assertEquals("123", obj.encoder("abc"));


    }

    @Test
    public void decoderTest() {

        Assert.assertEquals(3, obj.decoder("111"));
        Assert.assertEquals(1, obj.decoder("1"));
        Assert.assertEquals(2, obj.decoder("97"));
        Assert.assertEquals(3, obj.decoder("123"));
    }


}
