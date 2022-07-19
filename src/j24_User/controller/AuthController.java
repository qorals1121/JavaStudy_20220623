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
			CMRespDto<String> response = (CMRespDto<String>) checkUsername(username);	
			if(response.getCode() > 0) {
				System.out.println(response.getMsg());	
				break;
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
	private CMRespDto<?> checkUsername(String username) {
		try {
			if(authService.checkUsername(username)) {
				return new CMRespDto<>(-1, "이미 존재하는 사용자이름", username);
			}else {
				return new CMRespDto<>(1, "사용가능한 사용자이름", username);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new CMRespDto<>(-1, "서비스 오류", username);
		
	}
	
}
