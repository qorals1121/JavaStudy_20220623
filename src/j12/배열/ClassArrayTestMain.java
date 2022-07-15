package j12.배열;

public class ClassArrayTestMain {

	public static void main(String[] args) {
		ClassArrayTest classArrayTest = new ClassArrayTest();
		String[] names = new String[10];
		
		String[] names2 = classArrayTest.createArray(names); //names2에다가 주소를(통을) 통째로 줌, 즉 names와 names2는 같은 주소를 가지고 있다. = 같은 결과가 나온다
		
		for(int i = 0; i < names2.length; i++) {
			System.out.println(names2[i]);
		}
		System.out.println();
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
