import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTenTest {

   TaskTen obj = new TaskTen();

    @Test
    public void minCostTest(){

        Assert.assertEquals(9, obj.calMinCost(new int[][] { { 3, 4, 9, 10 }, { 2, 5, 8, 11 }, { 1, 6, 7, 12 } }));
        Assert.assertEquals(0, obj.calMinCost(new int[][] { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }}));
        Assert.assertEquals(8, obj.calMinCost(new int[][] { { 3, 4, 9, 10 }, { 2, 5, 8, 11 }}));





    }





}
