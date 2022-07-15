package j10_클래스;

public class Phone {
	// class = 틀. 변수와 메소드로 이루어져있다. 클래스 자체가 자료형이다.
	private String company;
	private String model;
	private int version;
	private String color;
// 앞으로는 변수앞에는 private를 주면 된다. 메소드는 거의 public을 사용한다. 이 두개가 가장 많이 사용됨
	
	public Phone() { // 생성자로 private 변수도 다른 메소드에서 불러올 수 있게 함
		System.out.println("기본생성자로 메모리 할당");
	}

	public Phone(String company, String model, int version, String color) { // Alt + Shift + S를 누르고 ~~ using field 메뉴 선택, 모두 선택해서 확인하기.
		this.company = company;
		this.model = model;
		this.version = version;
		this.color = color;
	}
	public String getCompany() { //겟터는 값을 들고오는 것이라 매개변수가 필요없지만, 리턴이 필요하다.
		return removeCompanyWord();
	}
	
	private String removeCompanyWord() {
		return company == null ? null : company.substring(0, company.indexOf("회사")); // substring은 모든 언어에 존재함. 0부터 회사 전 까지 잘라준다.)
	}
	
	public void setCompany(String company) { //셋터 짓는 방법 : set+변수명 (카멜표기법) 리턴할 값이 없다.
		this.company = madeCompanyName(company);
	}
	
	private String madeCompanyName(String company) { // 외부에서 쓸 일이 없기 때문에 내부에서만 사용하기 위해서 private로 막아준다. (캡슐화, 정보은닉)
		return company + "회사";
	}
	
	
		
	public void showInfo() {
		System.out.println("제조사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("버전 : " + version);
		System.out.println("색상 : " + color);
		System.out.println();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



}
