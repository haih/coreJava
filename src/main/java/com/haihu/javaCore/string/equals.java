package com.haihu.javaCore.string;

public class equals {

	public static void main(String[] args) {
		String test = null;

		//bad expression
		//null point exception
		//System.out.println(test.equals(""));
		
		//good expression
		//avoid null point exception
		System.out.println("".equals(test));
			
	}
}
