package j18_lombok;

public class StudentMain {

	public static void main(String[] args) {
		StudentDto studentDto = new StudentDto(100, "김준일", "부산광역시");
		
		Student student = Student.builder() 
				// 특정값만 넣고싶은 경우 builder를 사용하지 않는 경우 모든 경우의 수를 다 넣어주어야하지만 builder를 쓰면 하나만 넣어주면 된다.
				.student_code(200)
				.build();
		
		System.out.println(studentDto);
		System.out.println(student);
	}

}
