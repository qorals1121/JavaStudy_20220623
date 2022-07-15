package j10_클래스;

public class FishBun {
	
	// 변수
	String material;       //재료
	String dough;          //반죽
	
	
	FishBun() { //생성자
				// void가 없고, 앞은 대문자이다. (void가 없다는 것 = 반환 자료형을 정의하지 않는다.) 생성자가 클래스명과 똑같다.
				// fishBun자체가 주소값을 포함하고 있기 때문에 return값이 그 주소이다.
		System.out.println("생성자 호출");
	}
	
	// 메소드
	void showInfo() {
		System.out.println("재료 :" + material);
		System.out.println("반죽 : " + dough);
		
	}

}
