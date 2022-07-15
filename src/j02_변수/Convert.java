package j02_변수;

public class Convert {

	public static void main(String[] args) {
		int num1 = 10;
		double dNum1 = num1;
		int num2 = (int) dNum1; //큰값에서 작은값으로 바꾸고싶을 때 괄호안에 변환하고자하는 자료형을 넣어줌
		char c = (char) num2;
		
		System.out.println("정수 : " + num1);
		System.out.println("실수 : " + (int) dNum1);
		
		
		
	}

}
