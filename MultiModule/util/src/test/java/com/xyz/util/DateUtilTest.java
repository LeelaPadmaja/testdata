package com.xyz.util;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

    @Test
    public void testGetToday() throws InterruptedException {
	Thread.sleep(100);
	String actual = DateUtil.getToday();
	String expected = new SimpleDateFormat("dd-MMM-yyyy").format(new Date());
	assertEquals(expected, actual);
    }
    @Test
    public void testGetToday_FAILED() throws InterruptedException {
	Thread.sleep(100);
	String actual = DateUtil.getToday();
	assertEquals("", actual);
    }
}
