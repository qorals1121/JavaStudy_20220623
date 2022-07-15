package j10_클래스;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone = new Phone("애플", "아이폰", 13, "화이트"); 
		// private 의 경우 외부에서 값을 불러올 수 없음, 생성자 생성 필요 (Phone 파일 참고)
		phone.showInfo();
		
		System.out.println();
		phone.setCompany("삼성");
		phone.showInfo();
		
		System.out.println();
		System.out.println("회사명 : " + phone.getCompany());
		
	}// 앞으로는 변수를 바로 넣지 않고 메소드를 통해서 넣어줄 예정

}
