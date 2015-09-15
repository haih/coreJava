package com.haih.javaCore.io;

import java.io.File;
import java.io.IOException;

public class FileUtilsTest1 {
	public static void main(String[] args) throws IOException{
		FileUtils.listDirectory(new File("D:\\Learn"));
	}
}
