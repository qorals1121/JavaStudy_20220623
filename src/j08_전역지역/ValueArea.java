package j08_전역지역;

public class ValueArea {

	public static void main(String[] args) {
		// 전역변수 안에서는 같은 변수를 사용할 수 없다. 단, 지역변수에서는 각각의 중괄호로 나누어진 지역에서 사용할 수 있다. 상위의 변수는 따로 임의로 지정할 수 없다.
		// 대한민국 (서울 (중구,서구,...), 부산(중구, 서구,...), 광주(중구, 서구,...) ...)
		int num1 = 10;
		
		if(num1 > 10) {
			int num2 = 10;
			if(num2 > 20) {
				int num3 = 30;
			}
			// System.out.println(num3); 중괄호 바깥에서는 num3가 정의되어있지 않기 때문에 사용할 수 없다.
			
		}else if(num1 > 9) {
			int num2 = 9;
			
		}else if(num1 > 8) {
			int num2 = 8;
			
		}else {
			int num2 = 0;
		}

	}

}
