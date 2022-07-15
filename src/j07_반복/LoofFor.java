package j07_반복;

public class LoofFor {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) { //for문을 가장 많이 사용한다. while문과 구분해서 사용해야할 때를 구분할려면 많이 연습하는 수 밖에...
			System.out.println(i);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// for문을 사용할 때는 "1씩 증가"해야할 때 많이 사용한다.
		// for에는 ;이 두 개 들어간다. for(초기화(대입) ①; 조건②; 후처리④) {실행문③} (동그라미 숫자 순서대로 실행)

		System.out.println();
		
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		// while문은 "조건"이 주가 되어야할 때 많이 사용한다.
		
	}

}
