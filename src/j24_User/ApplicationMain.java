package j24_User;

import java.util.Scanner;

import j24_User.controller.AuthController;
import j24_User.service.AuthServiceImpl;

public class ApplicationMain {
	private AuthController authController;
	Scanner scanner;

	private ApplicationMain() {
		scanner = new Scanner(System.in);
		authController = new AuthController(scanner, new AuthServiceImpl());
	}
	
	
	public static void main(String[] args) {
		ApplicationMain applicationMain = new ApplicationMain();
		applicationMain.start();
	}

		private void start() {
			while(true) {
				mainMenu();
				String select = selectMenu();
				if(select.equals("1")) {
					authController.signin();
					
				}else if(select.equals("2")) {
					authController.signup();
					
				}else if(select.equals("q")) {
					System.out.println("프로그램 종료중...");
					for(int i = 0; i < 100; i++) {
						System.out.println(i + 1 + " / 100");
					try {
					Thread.sleep(0);
					} catch (InterruptedException e) {
						e.printStackTrace();
							}
						}
						break;
					}else {
					System.out.println("다시 선택하세요.");
				}
				System.out.println("\n\n\n\n\n\n");
					
			}
			System.out.println("프로그램 종료.");
		}
		
		private void mainMenu() {
			System.out.println("============================");
			System.out.println("사용자 관리 프로그램");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("q. 프로그램 종료");
			System.out.println("============================");
			
		}
		
		private String selectMenu() {
			System.out.print("선택 : ");
			return scanner.nextLine();
		}
}
