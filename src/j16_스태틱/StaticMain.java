package j16_스태틱;

public class StaticMain {

	public static void main(String[] args) {
		StaticTest.count = 30;
		StaticTest.staticMethod();
		
		
		StaticTest staticTest = new StaticTest();
//		staticTest.count = 10;
		staticTest.staticMethod(); // 값 10

		StaticTest staticTest2 = new StaticTest();
//		staticTest2.count = 20;
		staticTest2.staticMethod(); //값 20
		staticTest.staticMethod(); // 값 20
		// static은 답을 공유하기 때문에 staticTest2에 넣은 값이 그대로 밑에 출력된 1에도 공유가 된다.
	}

}
