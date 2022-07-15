package j02_변수;

public class FinalValue {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100; //상수의 경우 int 앞에 final이 붙는다
		final int MIN_NUMBER = 0; // 상수는 전체를 대문자와 스네이크표기법을 써서 사용하기로 한다.
		final String FILE_PATH = "C:\\users\\ITPS\\Desktop\\새 폴더";
		
		// maxNumber = 200;
//		Ctrl + /로 바로 커서있는 줄 or 선택한 곳 주석달기와 주석풀기 가능
		
		System.out.println("최대값 : " + (MAX_NUMBER +10 ));
		System.out.println("최소값 : " + MIN_NUMBER);
		
		

	}

}
