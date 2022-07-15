package j07_반복;

public class Contiue {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 8) {
				System.out.println("continue 실행");
				continue; // 다음 반복으로 넘어가라
			}
			System.out.println(i);
		}

	}

}
