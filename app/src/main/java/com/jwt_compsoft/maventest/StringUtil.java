package com.jwt_compsoft.maventest;

/**
 * Created by jamestope on 08/09/2014.
 */
public class StringUtil {


    public static String reverse(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }

        StringBuilder builder = new StringBuilder();

        for (int i=input.length() -1;i>=0;i--) {
            builder.append(input.substring(i,i+1));
        }

        return builder.toString();
    }
}
