/**
 * 
 */
package com.haihu.javaCore.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author E545
 *
 */
public class Input {

	public static void main(String[] args)  throws IOException{
		inputStreamReader();
	}
	/**
	 * @param args
	 */
	public static void inputStreamReader() throws IOException{

		InputStreamReader isread = null;
		try {
			isread = new InputStreamReader(new FileInputStream(new File("./input.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		BufferedReader bReader = new BufferedReader(isread);
		String data = "";
		while((data = bReader.readLine())!= null){
			System.out.println(data);
		}
	}
	
}

