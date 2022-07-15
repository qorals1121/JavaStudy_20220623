package j02_변수;

public class MyInfo {

	public static void main(String[] args) {
		/*
		 * 이름 : 김준일
		 * 성별 : 남
		 * 나이 : 29
		 * 주소 : 부산 동래구 사직동
		 * 이메일 : skjil1218@kakao.com
		 * 연락처 : 010-9988-1916
		 */
		char gender = '남';
		int age = 29;
		String adress = "부산 동래구 사직동";
		String email = "skjil1218@kakako.com";
		String phone = "010-9988-1916";
		
		char name1 = '김';
		char name2 = '준';
		char name3 = '일';
		
		name3 = '이'; //alt를 누르고 위아래로 움직일 수 있다
		
		
		
		
		System.out.print("이름 : ");
		System.out.println("" + name1 + name2 + name3); 
		// +의 경우 숫자를 더할 때 쓰기 때문에 다 더한 결과 유니코드로 변환된 숫자에서 더해서 결과가 나온다 (문자열이 앞에 있을 경우 문자열로 나온다)
		// 문자열로 나오게 하고 싶으면 앞에 "" + 를 붙혀준다 
		System.out.print("성별 : ");
		System.out.println(gender);
		System.out.print("나이 : ");
		System.out.println(age);
		System.out.print("주소 : ");
		System.out.println(adress);
		System.out.print("이메일 : ");
		System.out.println(email);
		System.out.print("연락처 : ");
		System.out.print(phone);
		
		
		
		

	}

}
