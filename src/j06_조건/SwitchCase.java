package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {
		int select = 2;
		String select2 = "2";
		char select3 = '2';
		
		// int switch
		switch(select) {
			case 1 :
				System.out.println("숫자 1을 선택 하였습니다.");
				break;
			case 2 :
				System.out.println("숫자 2를 선택 하였습니다.");
				break;
			case 3 :
				System.out.println("숫자 3을 선택 하였습니다.");
				break;
			default :
				System.out.println("해당 케이스가 없으면 실행");
			}
		
		// String switch
		switch(select2) {
		case "1" :
			System.out.println("문자열 1을 선택 하였습니다.");
			break;
		case "2" :
			System.out.println("문자열 2를 선택 하였습니다.");
			break;
		case "3" :
			System.out.println("문자열 3을 선택 하였습니다.");
		}
		
		// char switch
		switch(select3) {
		case '1' :
			System.out.println("문자 1을 선택 하였습니다.");
			break;
		case '2' :
			System.out.println("문자 2를 선택 하였습니다.");
			break;
		case '3' :
			System.out.println("문자 3을 선택 하였습니다.");
		}

		
		// switch는 select의 지정해준대로의 같은 값을 찾아간다. 그리고 해당 케이스부터 "시작"된다.
		// switch는 중괄호로 모두 하나하나 나눠줄 필요는 없다. 쭉 이어지기 때문이다.
	}

}
