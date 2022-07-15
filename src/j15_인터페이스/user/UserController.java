package j15_인터페이스.user; 

import j15_인터페이스.user.service.UserService;
import j15_인터페이스.user.service.UserServiceImpl;
import j15_인터페이스.user.service.UserServiceImpl2;

public class UserController {

	private final UserService userService;
	
	public UserController() {
		this.userService = new UserServiceImpl2(); // 초기 버전을 사용하다가 바꾼 버전을 import하고 갈아끼워준다.
	}
	public static void main(String[] args) {
		UserController controller = new UserController();
		controller.userService.createUser();
		System.out.println();
		System.out.println(controller.userService.getUser());
		System.out.println();
		controller.userService.updateUser();
		System.out.println();
		controller.userService.deleteUser();

	}

}
