package com.powerfunction;

import org.junit.Assert;
import org.junit.Test;

public class PowerFunctionTest {

    @Test
    public void givenMethodFor_FindingPowerOfNumber_ShouldReturnResult() {
        PowerFunction powerFunction=new PowerFunction();
        int result=powerFunction.powerOfGivenNumber(2,3);
        Assert.assertEquals(8,result);
    }

    @Test
    public void givenMethod_IfNumberIsNegative_ShouldReturnResult() {
        PowerFunction powerFunction=new PowerFunction();
        int result=powerFunction.powerOfGivenNumber(-2,3);
        Assert.assertNotEquals(8,result);
    }

    @Test
    public void givenMethod_IfNumberIsZero_ShouldReturnResult() {
        PowerFunction powerFunction=new PowerFunction();
        int result=powerFunction.powerOfGivenNumber(2,0);
        Assert.assertEquals(1,result);
    }
}
