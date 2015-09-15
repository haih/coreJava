/* 
 * 
 * Copyright (C) 1999-2012 IFLYTEK Inc.All Rights Reserved. 
 * 
 * FileName：FileRW.java                     
 * 
 * Description： 
 * 
 * History：
 * Version   Author      Date            Operation 
 * 1.0       admin       2015年9月15日上午11:35:12         Create
 */
package com.haih.javaCore.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author admin
 *
 * @create 2015年9月15日 上午11:35:12
 *
 * @version 1.0
 * 
 * @description
 * 
 */
public class FileRW {

    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        WriteMethod();
        ReadMethod();
    }

    private static void WriteMethod() throws UnsupportedEncodingException, FileNotFoundException {
        String decode = "decode.txt";
        FileOutputStream fos = new FileOutputStream(new File(decode));
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        try {
            osw.write("这个是需要做测试用的文字这个是需要做测试用的文字,这个是需要做测试用的文字,这个是需要做测试用的文字,这个是需要做测试用的文字");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void ReadMethod() throws UnsupportedEncodingException, FileNotFoundException {
        String decode = "decode.txt";
        FileInputStream fis = new FileInputStream(new File(decode));
        InputStreamReader isr = new InputStreamReader(fis);
        char[] cbuffer = new char[1024];
        StringBuffer contentBuffer = new StringBuffer();
        try {
            while (isr.read(cbuffer) != -1) {
                contentBuffer.append(cbuffer);
            }   
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(contentBuffer);      
    }
    
    private static void encode(){
        String string = "this is encode test";
        try {
            byte[] utf = string.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
