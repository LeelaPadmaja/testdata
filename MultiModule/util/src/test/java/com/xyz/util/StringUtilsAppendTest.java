package com.xyz.util;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class StringUtilsAppendTest {

    @Test
    public void testAppendString() {
	String s = "Hello";
	assertEquals("Hello Leela", StringUtils.appendText(s, " Leela"));
    }

}
