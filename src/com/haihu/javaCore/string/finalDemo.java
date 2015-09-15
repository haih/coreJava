package com.haihu.javaCore.string;

public class finalDemo {

	public static void main(String[] args) {
		final StringBuffer string = new StringBuffer("fdf");
		StringBuffer string1 = new StringBuffer("fdf");

		//allowed!
		string.append(" fds");
		
		//not allowed!
		//string = string1;
		System.out.println(string);

	}

}
