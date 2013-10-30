package com.babyduncan.ifGBK;

import java.io.*;

/**
 * test a string is gbk or not
 */
public class App {
    public static void main(String[] args) throws IOException {

        // String1.txt stores a gbk string and String2.txt not

        String s1 = new BufferedReader(new FileReader(new File("String1.txt"))).readLine();
        String s2 = new BufferedReader(new FileReader(new File("String2.txt"))).readLine();

        System.out.println(isGBK(s1));
        System.out.println(isGBK(s2));

        //result is
        //true
        //false

    }

    public static boolean isGBK(String s) {
        try {
            if (s.equals(new String(s.getBytes("gbk"), "gbk"))) {
                return true;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return false;
    }
}
