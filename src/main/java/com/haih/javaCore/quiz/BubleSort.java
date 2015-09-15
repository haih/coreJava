package com.haih.javaCore.quiz;

public class BubleSort {

	public static void main(String[] args) {
		int[] res = {3,1,4,6,2,4,8};
		bubleSort(res);
	}
	
	static void bubleSort(int[] lists){
		for (int i = 0; i < lists.length; i++) {
			int temp = 0;
			for (int j = 0; j < lists.length-i - 1; j++) {
				if( lists[j] > lists[j+1]){
					temp = lists[j+1];
					lists[j+1] = lists[j];
					lists[j] = temp;
				}
			}
		}
		for (int i : lists) {
			System.out.println(i);
		}
		
	}

}
