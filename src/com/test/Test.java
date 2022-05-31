package com.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("^v1\\.\\d\\.\\D$");
//        Matcher m = p.matcher("v1.4.a");
//        System.out.println(m.matches());

/*        Pattern p = Pattern.compile("(.*)\\.(.*)");
        Matcher m = p.matcher("regex.java");
        if (m.find()) {
            System.out.println(m.groupCount());
        }*/

        Pattern p = Pattern.compile("[D-F][a-z]{6}");
        Matcher m = p.matcher("Exercis");
        System.out.println(m.matches());

        //hei
    }
}
