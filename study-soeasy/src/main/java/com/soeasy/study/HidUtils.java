package com.soeasy.study;

import org.hashids.Hashids;

/**
 * Author:hermit
 * CreateDate:18/1/18
 */
public class HidUtils {

    private static final String DEFAULT_SALT = "SOUYIDAI-BIG-DATA";

    private static final Hashids hashids = new Hashids(DEFAULT_SALT);

    /**
     * 加密算法,用默认salt
     * @param value
     * @return
     */
    public static String hidEncode(String value) {
        return hashids.encode(value.hashCode());
    }

    /**
     * 用自定义salt进行加密
     * @param value
     * @param salt
     * @return
     */
    public static String hidEncode(final String value,String salt) {
        Hashids hashids = new Hashids(salt);
        return hashids.encode(value.hashCode());
    }


    public static void main(String []args) {

        String testStr = "230119198609203217";
        System.out.println(testStr.hashCode());
        System.out.println(testStr.hashCode());
        System.out.println((char)testStr.hashCode());
        System.out.println(hidEncode(testStr).toUpperCase());
        System.out.println(hidEncode(testStr,"123456"));


        for(char ch :"a".toCharArray()) {
            System.out.println((int)ch);
        }

    }
}
