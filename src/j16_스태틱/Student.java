package j16_스태틱;

public class Student {
	private static int autoIncrement_studentCode = 20220000;
	private int studentCode;
	private String name;
	
	public Student(String name) {
		super();
		autoIncrement_studentCode++;
		this.studentCode = autoIncrement_studentCode;
		this.name = name;
	}
	
	public int getStudentCode() {
		return studentCode;
	}
	
	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
		
	}
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) { // 모든 객체를 하나로 묶을 수 있다.
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}

	//getname 호출 단축키 shift alt s
	
}
