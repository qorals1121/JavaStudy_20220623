package j19_제네릭.wildcard;

import j14_추상.Human;
import j14_추상.Animal;
import j18_lombok.Student;

public class WildCardTestMain {

	public WildCardTest<?> test(int index){
		if(index == 0) {
			return new WildCardTest<Integer>(100);
		}else if(index == 1) {
			return new WildCardTest<Boolean>(true);
		}else if (index == 2 ) {
			return new WildCardTest<String>("문자열");
		}else if (index == 3) {
			return new WildCardTest<>(Student.builder().student_code(10).build());
		}else {
		return new WildCardTest<>(null); //비워두게 되면 object 파일로 잡히게 된다.
		}
	}
	

	public WildCardTest<? extends Animal> test2() {
		return new WildCardTest<>(new Human()); 
	}
	
	
	public static void main(String[] args) {
		WildCardTestMain testmain = new WildCardTestMain();
		
		System.out.println(testmain.test(0));
		Student s = (Student) testmain.test(3).getData();
		System.out.println(s.getStudent_code());
		
		((Human) testmain.test2().getData()).readBooks(); // move가 Animal로 잡혀있는 이유는 애니멀을 상속 받아서 휴먼으로 다운캐스팅 해주어야한다
		
		
		// http://www.tcpschool.com/java/java_collectionFramework_concept 도움이 되는 사이트

	}

}
