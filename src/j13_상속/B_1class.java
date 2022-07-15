package j13_상속;

public class B_1class extends Aclass { //extends 뒤에는 상속을 받고자하는 대상(부모클래스)를 입력한다.
	
	public B_1class() {
		super(); //생략되어있음. super = 자바에서는 부모를 가리킴. 자식은 부모없이 존재할 수 없기 때문에 클래스 가장 위에 존재해야함.
		// super(); = new Aclass(); 같은 의미.
		System.out.println("B_1 생성");
		System.out.println(str);
	}
	
	

}
