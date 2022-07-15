package j06_조건;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		 
		System.out.print("성적을 입력하세요 : ");
		score = scanner.nextInt();
		
		// 나눗셈을 할 때 0으로 나누거나 0을 나누면 오류가 발생하기 때문에 0의 케이스를 만들어주기 위해 삼항연산자를 사용한다.
		switch(score == 0 ? 0 : score < 101 ? score / 10 : 11) {
			case 10 :
			case 9 :
				System.out.println("A학점");
				break;
			case 8 :
				System.out.println("B학점");
				break;
			case 7 :
				System.out.println("C학점");
				break;
			case 6 :
				System.out.println("D학점");
				break;
			case 5 :				
			case 4 :
			case 3 :
			case 2 :
			case 1 :
			case 0 :
				System.out.println("F학점");
				break;
			default :
				System.out.println("계산할 수 없는 점수");
		}
		
		
		
	}

}
