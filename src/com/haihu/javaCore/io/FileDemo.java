/**
 * 
 */
package com.haihu.javaCore.io;

import java.io.File;
import java.io.IOException;

/**
 * @author E545
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		File file = new File("D:\\logs\\test\\ttest");

		System.out.println(file.exists());
		if (!file.exists()) {
			file.mkdir(); //file.mkdirs()
		}
		else {
			//file.delete();
		}
		file.isDirectory();
		file.isFile();
		File file1 = new File("D:\\logs\\test.txt");
		if(!file1.exists()){
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			file1.delete();
		}
		System.out.println(file1);
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file1.getParent());
	}
}
