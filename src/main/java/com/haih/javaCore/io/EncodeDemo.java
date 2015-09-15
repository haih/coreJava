package com.haih.javaCore.io;


public class EncodeDemo {
	public static void main(String[] args) throws Exception {
		String s = "胡海hh";
		//utf-8编码，中文占用三个字节，英文占用1个字节
		byte[] byte1 = s.getBytes();
		for (byte b : byte1){
			System.out.print(Integer.toHexString(b & 0xff) +" ");
		}	
		System.out.println();
		byte[] byte2 = s.getBytes("gbk");
		//gbk编码，中文占用两个字节，英文占用1个字节
		for (byte b : byte2){
			System.out.print(Integer.toHexString(b & 0xff) +" ");
		}
		System.out.println();
		//java 是双字节编码 utf-16be
		byte[] byte3 = s.getBytes("utf-16be");
		//utf-16be编码，中文占用两个字节，英文占用两个字节
		for (byte b : byte3){
			System.out.print(Integer.toHexString(b & 0xff) +" ");
		}
		System.out.println();
		
		String str1 = new String(byte3,"utf-16be");
		System.out.println(str1);
		/**
		 * 文本文件 就是字节序列，可以是任意编码的字节序列
		 * 如果在中文机器上 直接创建文本文件，那么该文本文件只认ASNI编码.
		 */
		
	}
}
