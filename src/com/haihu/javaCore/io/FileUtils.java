/**
 * 列出File的一些常用操作，包装成工具类
 */
package com.haihu.javaCore.io;
import java.io.File;
import java.io.IOException;

/**
 * @author E545
 *
 */
public class FileUtils {
	/**
	 * 列出指定目录下（包括其子目录）的所有文件
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir) throws IOException {
		if(!dir.exists()){
			throw new IllegalArgumentException("目录：" + dir + "不存在.");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是目录.");
		}
//		
//		String[] name = dir.list();
//		for (String string : name) {
//			System.out.println(dir+"\\" + string);
//		}
		//如果要遍历子目录下的内容就需要构造成File对象做递归操作
		File[] files = dir.listFiles();
		if(files != null && files.length >0){
			for (File file : files) {
				if(file.isDirectory()){
					//递归调用
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
		}
 	}
}
