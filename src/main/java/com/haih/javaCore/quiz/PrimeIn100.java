package com.haih.javaCore.quiz;


public class PrimeIn100 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if(isPrime(i)){
				System.out.println(i);
			}
		}

	}
	static boolean isPrime(int i){
		for(int j = 2;j <= i/2;j++){
			if(i%j == 0){
				return false;
			} 
		}
		return true;
	}

}
