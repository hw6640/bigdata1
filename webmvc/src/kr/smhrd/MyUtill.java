package kr.smhrd;

public class MyUtill {
	
	// 1부터 10까지의 총합을 구하는 동작
	public int hap() {
		int sum = 0;
		
		for(int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
