package j07_반복;

public class LoofFor2 {

	public static void main(String[] args) {
		
		int i = 0; 
		
		for(; i < 10;) { //전역 변수로 i의 선언을 줄 수 있다. 전역 변수로 주어도 ;는 꼭 찍어야한다. 
			i++; //맨 마지막에 실행해야함을 고려해야한다.
			System.out.println(i);
		}
		
		while(i < 10) {
			i++;
			System.out.println(i);
			
		}
	}

}
