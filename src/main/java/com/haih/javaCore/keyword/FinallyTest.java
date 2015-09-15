/**
 * 
 */
package com.haih.javaCore.keyword;

/**
 * @author E545
 *
 */
public class FinallyTest {

	public static void main(String[] args) {

		System.out.println(test1());
	}

	public static int test1() {
		int b = 20;

		try {
			System.out.println("try block");

			return b += 80;
		} catch (Exception e) {

			System.out.println("catch block");
		} finally {

			System.out.println("finally block");

			if (b > 25) {
				System.out.println("b>25, b = " + b);
			}
		}

		return b;
	}
}
