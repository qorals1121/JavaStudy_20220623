package j22_예외;

import java.util.ArrayList;
import java.util.List;

import j20_컬렉션.HashSet.User;

public class Exception2 {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		for(int i = 0; i < 5; i ++) {
			userList.add(User.builder().usercode(i + 1).build());
		}
		// userList.add(null);
		
		try {
		for(int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).getUsercode());
		}

		for(int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i + 1));
		}
	} /*
		 * catch(NullPointerException e) {
		 * System.out.println("null값이라서 getUsercode()할 수 없음");
		 * 
		 * }catch(IndexOutOfBoundsException e) { System.out.println("범위초과");
		 * 
		 * }
		 */catch(Exception e) { // 어떤 예외가 발생할지 모르기 때문에 마지막엔 항상 Exception 을 달아준다
			System.out.println("예외 발생");
			e.printStackTrace(); // 어떤 오류가 발생햇는지 알려주는 것
		}finally { // 현재 이동작은 중요한 부분이다 하고 명시해주는 finally
			System.out.println("예외가 발생 하든 하지 않든 실행되는 부분");
		}
		
			System.out.println("프로그램이 정상적으로 종료됨");
		
	}

}
