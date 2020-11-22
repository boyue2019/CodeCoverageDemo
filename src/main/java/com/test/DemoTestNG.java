package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG extends BaseCase{
    @Test
    public void case_001(){
        Assert.assertEquals("天才","天才");
    }

    @Test
    public void case_002(){
        Assert.assertEquals("天才2","天才2");
    }
}
