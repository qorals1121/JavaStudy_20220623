package j13_상속.animal;

public class Tiger extends Animal {
	public Tiger() {
		System.out.println("호랑이 한 마리 생성");
	}
	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뛰어옵니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
