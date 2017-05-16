package com.xyz.util;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class StringUtilsLengthTest {

    @Test
    public void testLengthOfString() {
	String s = "Hello";
	assertEquals("5", StringUtils.length(s));
    }
    @Test
    public void testLengthOfEmptyString() {
	String s = "";
	assertEquals("0", StringUtils.length(s));
    }
    
    @Test
    public void testLengthOfSpaceString(){
	String s = " Hello World ";
	assertEquals("13", StringUtils.length(s));
    }

}
