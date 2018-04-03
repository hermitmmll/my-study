package com.soeasy.study;

import java.security.MessageDigest;

/**
 * Author:hermit
 * CreateDate:18/1/18
 */
public class MD5Utils {


    private static final String SALT = "SOUYIDAI-BIG-DATA";


    /***
     * MD5加码 生成32位md5码
     */
    public static String makeMD5Code(String inStr){
        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){

            return "";
        }
        byte [] salts  = SALT.getBytes();
        md5.update(salts);
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            byteArray[i] = (byte) charArray[i];
        }
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("x");

            }
            hexValue.append(Integer.toHexString(val));
        }
	System.out.println("================");
        return hexValue.toString().toUpperCase();

    }

    /**
     * 加密解密算法 执行一次加密，两次解密
     */
    public static String convertMD5(String inStr){
        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++){
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s;
    }


    public static void main (String []args) {
        String testStr = "计明亮你好hahaaha33333";
        String md5Str = makeMD5Code(testStr);
        System.out.println("md5后:" +md5Str);
        System.out.println("解密后:"+ convertMD5(md5Str));

    }

}
