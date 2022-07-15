package j15_인터페이스;

public class Monitor implements HDMI { //인터페이스는 implements를 붙여 연결해준다.
	private String test;
	
	@Override
	public void connect() {
		System.out.println("모니터를 연결합니다.");
		
	}

	@Override
	public void disConnet() {
		System.out.println("모니터 연결을 해제합니다.");
		
	} 
	

}
