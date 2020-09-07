package kr.smhrd;

public class MyUtill {
	
	// 한글 수정 깨짐 
	public int hap() {
		int sum = 0;
		
		for(int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
