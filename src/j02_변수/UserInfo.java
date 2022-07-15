package j02_변수;

public class UserInfo {

	public static void main(String[] args) {
	/*
	 * 자동완성 : Ctrl + Space
	 * System.out.println() -> 자동완성 : sysout + 자동완성 단축
	 * main + Ctrl + Space = public static void main(String[] args)
	 * Ctrl + Alt + 화살표 : 커서있는 라인 복사
	 */
		
	/**
	 * 
	 * @author ITPS
	 * 
	 */
		
		
		int userCode = 20220001; //학번
		char name1 = '김'; //글자 하나만 넣을 수 있음
		char name2 = '준';
		char name3 = '일';
		String name = "김준일";
		double score = 85.5;
		boolean gender = true;
		
		System.out.println("학번: " + userCode);
		System.out.println("이름: " + name1 + name2 + name3);
		System.out.println("이름: " + name);
		System.out.println("성적: " + score);
		System.out.println("성별: " + gender);
		
		System.out.println(score + 5.5);
		System.out.println("95.5" + 1.0); //출력은 무조건 문자열로 변환되어진다
		
		

	}

}
