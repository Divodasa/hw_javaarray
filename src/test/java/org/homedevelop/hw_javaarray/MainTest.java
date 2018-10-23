package org.homedevelop.hw_javaarray;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testArrData() {
        boolean result = Main.checkArrData(new int[] {10,4,6,7,8,8,1});
        Assert.assertEquals(true, result);
    }

    @Test
    public void testArrData1() {
        boolean result = Main.checkArrData(new int[] {1,4,6,7,8,8,10});
        Assert.assertEquals(true, result);
    }

    @Test
    public void testArrData2() {
        boolean result = Main.checkArrData(new int[] {10,4,6,7,8,8,10});
        Assert.assertEquals(true, result);
    }

    @Test
    public void testArrData3() {
        boolean result = Main.checkArrData(new int[] {1,4,6,7,8,8,1});
        Assert.assertEquals(false, result);
    }

    @Test
    public void testArrData4() {
        boolean result = Main.checkArrData(new int[] {0,0,0,0,0,0,0});
        Assert.assertEquals(false, result);
    }
}
