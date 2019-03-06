package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UglyNumbersTest {
    UglyNumbers obj;

    @Before
    public void setUp() throws Exception {
        obj = new UglyNumbers();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void TestUgly() {
       assertEquals("is not a ugly number.",obj.checknumbers(6));

    }
}
