package com.xyz.util;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class StringUtilsLengthTest {

    public void testLengthOfString() {
	String s = "Hello";
	assertEquals("5", StringUtils.length(s));
    }
    public void testLengthOfEmptyString() {
	String s = "";
	assertEquals("0", StringUtils.length(s));
    }

}
