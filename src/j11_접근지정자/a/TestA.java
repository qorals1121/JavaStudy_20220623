package j11_접근지정자.a;

public class TestA { // public(공개)도 접근지정자이다. private(비공개)
	private String name; // 여기에서의 name은 매개변수
	
	public TestA() {
		
	}
	
	public TestA(String name) { // 여기에서의 name은 멤버변수
		// 기본생성자
		this.name = name;
		System.out.println(this);
		//this는 자기자신의 주소를 의미한다. 매개변수의 name이 아닌 class가 가지고 있는 name의 주소로 접근한다.
	}

	// private로 정의해놓은 변수는 자동완성을 썼을 때 빨간색으로 나온다.
	// protected와 default는 거의 쓸 일이 없다.
	
	public void test() {
		System.out.println(name);
		
	}
	
}
