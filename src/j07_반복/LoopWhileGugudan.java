package j07_반복;

public class LoopWhileGugudan {

	public static void main(String[] args) {
		int dan = 0;
		
		while(dan < 8) {
			int dan2 = dan + 2;
			
			System.out.println(dan2 + "단");
			int num = 0;
					
			while(num < 9) {
				int num2 = num + 1;
				System.out.println(dan2 + " X " + num2 + " = " + (dan2 * num2));
				num++;
			}
			System.out.println();
			dan++;
			// 조건은 무조건 반복 횟수를 주는 것이 편하다. 그리고 시작점은 무조건 0으로 시작되어야한다.		
			// 반복이 두개 중첩될 경우  num을 초기화 시켜주어야한다.
		}

	}
}
