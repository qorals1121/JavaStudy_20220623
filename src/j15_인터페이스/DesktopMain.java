package j15_인터페이스;

public class DesktopMain {

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		BeamProject beamProject = new BeamProject();
		
		Desktop desktop = new Desktop(beamProject);
		desktop.showInfo();
		
		// 인터페이스란, 공통된 기능을 어디에다가 연결해주느냐에 따라 연결되는 위치가 바뀐다.
		// 부품만 갈아끼워주면 되는 것이기 때문에 다른 것을 고칠 필요가 없어진다.
		
		// DI : 의존성 주입 (외부에서 만들어서 주입을 한다)


	}

}
