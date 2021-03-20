import org.junit.Assert;
import org.junit.Test;

public class TaskTwoTest {
    int[] array = {10, 8, 9, 3, 1};
    int[] array2 = {1, 2, 3, 4, 5};
    TaskTwo taskTwoobject = new TaskTwo();
    int[] emptyArray = {};


    @Test(expected = IllegalArgumentException.class)
    public void ModifyArrayWithDivisionTest() {

        int[] arrayAfterModification = {216, 270, 240, 720, 2160};
        Assert.assertArrayEquals(arrayAfterModification, taskTwoobject.ModifyArrayWithDivision(array));
        taskTwoobject.ModifyArrayWithDivision(emptyArray);

    }

    @Test(expected = IllegalArgumentException.class)
    public void ModifyArrayWithOutDivisionTest() {

        int[] array2AfterModification = {120, 60, 40, 30, 24};
        Assert.assertArrayEquals(array2AfterModification, taskTwoobject.ModifyArrayWithMultiplication(array2));
        taskTwoobject.ModifyArrayWithMultiplication(emptyArray);

    }


}
