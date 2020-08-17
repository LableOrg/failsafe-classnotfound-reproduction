package org.example.sample.failsafe300m5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionIT {
    @Test
    public void test() {
        SampleException e = new SampleException();
        assertEquals(e.test(), "TEST");
    }
}
