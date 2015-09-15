package quiz;


public class PlalindromeIn100 {

	public static void main(String[] args) {
		for (int j = 1; j < 10000; j++) {
			isPlalindrome(j);
		}
	}
	
	static void isPlalindrome(int i){
		int des=0;
		int temp = i;
		while (i > 0){
			 des = i%10 + des*10;
			 i = i/10;
		}
		if(temp == des){
			System.out.println(des);	
		}
		
	}
}
