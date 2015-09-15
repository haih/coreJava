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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
        ReadMethod();
    }

    private static void ReadMethod() throws UnsupportedEncodingException, FileNotFoundException {
        String decode = "decode.txt";
        FileOutputStream fos = new FileOutputStream(new File(decode));
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        try {
            osw.write("这个是需要做测试用的文字");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                osw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
