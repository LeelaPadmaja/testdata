package com.xyz.util;

public class StringUtils {
    public static String appendText(String source, String appendTxt) {
	return source.concat(appendTxt);
    }

    public static String length(String source) {
	return String.valueOf(source.length());
    }
}
