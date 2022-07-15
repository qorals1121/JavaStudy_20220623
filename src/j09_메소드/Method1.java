package j09_메소드;

public class Method1 {
	 
	//메소드 정의
	
	// void 공허하다, 아무 의미가 없다, 값이 없다.
	
	//매개변수가 없으면서 반환도 없는 메소드
	// 메소드 = class 안에 만든 함수!! (java에서는 무조건 class를 만들어 사용하기 때문에 일반 함수는 사용하지 않는다.)
	// 함수 = class 안에 만들지 않은 일반함수를 통틀어 하는 말
	
	public static void function1() {
		System.out.println("F1 실행");
	}
	
	//매개변수가 있고 반환은 없는 메소드
	public static void function2(int age, String name) {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
	}
	
	//매개변수가 없고 반환은 있는 메소드
	public static int function3() { // void -> int로 바뀌고 (반환 자료형이라고 함), return이 생김 (return의 값이 반환자료형과 같아야함)
		return 1000;
	}
	
	//매개변수와 반환이 있는 메소드
	public static String function4(String name) {
		String madeName = name + "님";
		return madeName;
	}
	
	//리턴 자료형이 void일 때 메소드를 강제로 탈출하는 방법
	public static void function5(int n) {
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				return; // 반복이 돌다가 i가 0 ~ n 전까지 돌면 return 하라. (함수를 더이상 실행하지 않고(작업중단) 빠져나온 다음 function 다음 것이 실행된다.)
				// return 대신 break를 사용 할 수 있는데, 차이점은 return은 함수 자체를 끝내는 것이고 break는 반복만 멈추는 것이다.
				// 즉, 다음 것을 실행시킬 것인지 멈출 것인지 잘 구분해서 사용해야한다.
			}
			System.out.println(i);
		}
		// 여기에 return을 주게 된다면 다음 것은 실행되지 않기 때문에 오류메세지가 뜬다.
		System.out.println("function5가 정상적으로 끝이 남");
	}
	public static String getName() {
		return "김준일";
	}
	public static void setName(String name) {
		String n = name;
	}
	
	public static String findUserByUsername(String username) {
		return "USER";
	}
	
	public static void main(String[] args) { //main도 메소드의 하나. main 하나에서 모두 짜는 것이 아니라 기능별로 나누어서 사용가능하다.
		function1(); //메소드 호출
		function2(28, "민경");
		int result = function3();
		System.out.println(result);
		System.out.println(function3()); // 변수에 넣지 않아도 됨
		System.out.println(function4("김준일"));
		function5(5);
		System.out.println("function5 다음 실행");
	}
	
	/* 메소드 이름의 규칙 : 메소드는 기능이고 동작이다. 즉, 동사형태로 이름을 지어야한다. 
	 * 클린 코드 : 개발자의 필독서. 코드이름을 짓는데 도움이 많이 된다.
	 */
}
