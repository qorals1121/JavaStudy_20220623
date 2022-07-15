package j16_스태틱.싱글톤;

public class Singleton {
	//java 디자인 패턴 검색 (23가지있음, 기사 준비할 경우 무조건 다 외워야함!) - 그 중에서 싱글톤
	// 전역 변수를 사용하지 않고 객체 하남나 생성, 생성된 객체를 어디서든지 참조할 수 있도록 하는 패턴
	// 하나의 인스턴스만을 생성하는 책임이 있으며 getInstance 메서드를 동해 모든 클라이언트에게 동일한 인스턴스를 제공
	
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void printInfo() {
		System.out.println("싱글톤 테스트");
	}
}
