package j13_상속;

public class B_2class extends Aclass {
	private int number; 
	
	public B_2class() {
		System.out.println("B_2 생성");
	//	System.out.println(super.number); //그냥 number만 쓰면 헷갈리기 때문에 부모로부터 참고했다는 의미로 super. 를 붙여준다.
		System.out.println(this.number); //이곳에서의 number
		
	}
}
