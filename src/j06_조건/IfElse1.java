package j06_조건;

public class IfElse1 {

	public static void main(String[] args) {
		int num = 89;
		
		if(num > 5) { 
			System.out.println("5보다 큽니다."); 
			System.out.println("현재 num변수의 값은" + num + "입니다.");
		}
		// if는 혼자 사용가능하다. (조건에 만족하지 못하면 실행하지 않는다.)
		// if 안에 하나 이상의 명령어를 같이 묶고싶으면 {} 중괄호로 묶어주어야한다. 한줄이라도 중괄호로 묶어주는게 보기좋은 코드이다.
		// if(num <=5) System.out.println("5보다 크지 않습니다.);
		else {
			System.out.println("5보다 크지 않습니다."); // else는 if가 없으면 사용하지 못한다.
		}

	}

}
