package com.haihu.javaCore.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RaFDemo {
	public static void main(String[] args) throws IOException{
		File demo = new File("demo");
		if (!demo.exists()) {
			demo.mkdir();
		}
		File file = new File(demo,"raf.dat");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		System.out.println(raf.getFilePointer());
		
		raf.write('A'); //只写了一个字节
		System.out.println(raf.getFilePointer());
		raf.write('B');
		
		int i = 0x7fffffff;
		//用write方式，每次只写一个字节， 如果要把i写进入就得写4次
		raf.write(i >>> 24); //高8位
		raf.write(i >>> 16); //高8位
		raf.write(i >>> 8); //高8位
		raf.write(i); //高8位
		System.out.println(raf.getFilePointer());
		
		String string = "中";
		byte[] bytes = string.getBytes("gbk");
		raf.write(bytes);
		System.out.println(raf.length());
		
		//读文件，必须把指针移动到头部
		raf.seek(0);
		byte[] buf = new byte[(int)raf.length()];
		raf.read(buf);
		System.out.println(Arrays.toString(buf));
		for (byte b : buf) {
			System.out.println(Integer.toHexString(b & 0xff) + " ");
		}
		raf.close();
	}
}
