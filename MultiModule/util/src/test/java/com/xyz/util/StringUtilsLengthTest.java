package com.xyz.util;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class StringUtilsLengthTest {

    @Test
    public void testLengthOfString() throws InterruptedException {
	Thread.sleep(10);
	String s = "Hello";
	assertEquals("5", StringUtils.length(s));
    }

    @Test
    public void testLengthOfEmptyString() throws InterruptedException {
	Thread.sleep(30);
	String s = "";
	assertEquals("0", StringUtils.length(s));
    }

    @Test
    public void testLengthOfSpaceString() throws InterruptedException {
	Thread.sleep(10000);
	String s = " Hello World ";
	assertEquals("12", StringUtils.length(s));
    }

}
