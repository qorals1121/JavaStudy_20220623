package j16_스태틱;

public class StaticTest {
	public static int count;
	public int count2; //스태틱 변수는 무조건 스태틱끼리만 사용가능하다.
	
	public static void staticMethod() {
		System.out.println("스태틱 메소드 : [ count : " + count + " ]");
		System.out.println("스태틱 메소드 : [ count2 : " + count + " ]");
	} // 스태틱은 공유하는 느낌으로 사용한다. 

}
