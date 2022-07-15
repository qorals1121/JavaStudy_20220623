package j12.배열;

public class Array1 {

	public static void main(String[] args) {
		String[] names = new String[10]; //String name의 공간 10개를 만들어라 (주소가 names에 들어있다)
		
		int index = 0;
		names[0] = "김준일";
		
		System.out.println(names[0]);
		System.out.println(names[0 + 1 -1]); 
		System.out.println(names[index]); // 연산도 가능하다 = 변수도 쓸 수 있다
		for(int i = 0; i < 10; i++) {
			System.out.println(names[i]);
		}
	}

}
