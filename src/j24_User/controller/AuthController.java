package j24_User.controller;

import java.util.Scanner;

import j19_제네릭.CMRespDto;
import j24_User.controller.dto.SignupDto;
import j24_User.service.AuthService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthController {
	
	@NonNull
	private final Scanner scanner;
	
	@NonNull
	private final AuthService authService;

	// 회원가입
	public CMRespDto<?> signup() {
		signupView();
		return null;
	}
	
	private SignupDto signupView() {
		String name = null;
		String email = null;
		String username = null;
		String password = null;
		System.out.println("[회원가입]");
		
		System.out.println("이름 : ");
		name = scanner.nextLine();
		
		System.out.println("이메일 : ");
		email = scanner.nextLine();
		
	
		while(true) {
			System.out.println("사용자이름 : ");
			username = scanner.nextLine();
			try {
				if(!authService.checkUsername(username)) {
					break;
				}else {
					System.out.println("이미 존재하는 사용자 이름입니다.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("비밀번호 : ");
		password = scanner.nextLine();
		
		System.out.println("회원가입 진행");
		
		return null;
		
	}
	
	// 로그인
	public CMRespDto<?> signin() {
		return null;
	}
	
	//아이디 중복 체크
	public CMRespDto<?> checkUsername() {
		return new CMRespDto<>(1, "사용가능한 아이디", "junil");
		
	}
	
}
