package j15_인터페이스;

public class BeamProject implements HDMI {
	
	@Override
	public void connect() {
		System.out.println("빔프로젝터를 연결합니다.");
	
	}

	@Override
	public void disConnet() {
		System.out.println("빔프로젝터를 연결 해제합니다.");
		
	}
}
