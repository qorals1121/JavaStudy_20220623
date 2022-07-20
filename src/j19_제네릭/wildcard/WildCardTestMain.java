package j19_제네릭.wildcard;

import j14_추상.Animal;
import j14_추상.Human;
import j18_lombok.Student;

public class WildCardTestMain {

	public WildCardTest<?> test(int index){
		if(index == 0) {
			return new WildCardTest<>(100);
		}else if(index == 1) {
			return new WildCardTest<>(true);
		}else if(index == 2) {
			return new WildCardTest<>("문자열");
		}else if(index == 3) {
			return new WildCardTest<>(Student.builder().student_code(10).build());
		}else {
			return new WildCardTest<>(null);			
		}
	}
	
	public WildCardTest<? extends Animal> test2() {
		return new WildCardTest<>(new Human());
	}
	
	public static void main(String[] args) {
		WildCardTestMain testMain = new WildCardTestMain();
		
		System.out.println(testMain.test(0));
		Student s = (Student) testMain.test(3).getData();
		System.out.println(s.getStudent_code());
		
		((Human) testMain.test2().getData()).readBooks();
	}

}


