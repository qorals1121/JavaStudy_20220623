package j09_메소드;

public class Method3 {
	//메소드 오버로딩 : 같은 이름에서의 메소드 중에 매개변수에 따라 호출되는 메소드가 달라진다.
	
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	public static void test1(int a) {
		System.out.println("test1 하나 더 만들어서 호출");
	}
//	public static void test1() {
//		System.out.println("test1 하나 또 만들어서 호출");
//		return 1;
//	}
//	 리턴자료형과 리턴 값은 메소드 오버로딩과 관련이 없다.
	
	public static void test1(int a, int b) {
		System.out.println("매개변수 int 자료형 두개");
	}
	
	public static void test1(int a, String b) {
		System.out.println("매개변수 int와 String을 받음");
	}
	

	public static void main(String[] args) {
		test1(); //메소드명이 동일해도 매개변수의 있고없고의 차이는 존재한다.
		test1(10);
		test1(10, 20);
		test1(10, "10");
		
		new Exception();

	}

}
