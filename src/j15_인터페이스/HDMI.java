package j15_인터페이스;

/*
 * 인터페이스 (implements)
 * 1. 변수는 존재할 수 없다. 즉, 무조건 상수로 선언과 초기화가 되어 있어야한다.
 * 2. 모든 메소드는 기본적으로 추상(abstract) 메소드이다.
 * 3. 일반 메소드를 사용하고 싶다면 default를 명시해주어야한다.
 */

public interface HDMI {
	 //private String test; // < 인터페이스 안에 들어오는 모든 변수는 기본적으로 상수이다. private는 사용할 수 없다. (클래스 내부에서만 사용할수있는 것)0
	//public String test; // public은 사용 가능하며 상수는 무조건 값이 안에 있어야한다.
	public String test = "test"; // < 사용가능
	
	public void connect();
	// 추상클래스에는 일반 메소드가 포함되어도 되지만, 인터페이스는 무조건 추상메소드이기 때문에 abstract는 생략한다.
	public void disConnet();
//	public default void test() { //버전 8부터는 default도 지원한다. (일반메소드) }
	
	// 추상클래스를 가지는 경우 : 쌍방향작용 (동물, 사람, 호랑이의 관계 = 동물은 사람도, 호랑이도 될 수 있다)
	// 인터페이스를 가지는 경우 : 그 기능만 작용하는 경우 (HDMI, 모니터, 빔프로젝터의 관계 = HDMI는 모니터와 빔프로젝터가 될 수 없다)
	// 인터페이스는 두개이상을 가져와도 가능하지만 추상클래스는 하나이상을 가져오지 못한다.
}
