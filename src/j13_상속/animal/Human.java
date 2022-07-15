package j13_상속.animal;

/*
 * @ -> 어노테이션
 * @override
 * 부모로부터 상속받아 재정의 한 메소드이다. 라는 것을 표기 
 */

public class Human extends Animal {
	
	public Human() {
		System.out.println("사람 한 명 생성");
	}
	// overloading = 매개변수에 따라 달라짐
	// override = 재정의 하는 것
	@Override
	 public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
		//super.move(); //부모의 move를 실행
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
