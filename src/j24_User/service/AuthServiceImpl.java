package j24_User.service;

import j24_User.controller.dto.SigninDto;
import j24_User.controller.dto.SignupDto;
import j24_User.repository.User;
import j24_User.repository.UserRepsitory;

public class AuthServiceImpl implements AuthService {

	private UserRepsitory userRepsitory;
	
	public AuthServiceImpl() {
		userRepsitory = new UserRepsitory();
	}
	
	@Override
	public boolean checkUsername(String username) throws Exception {
		return userRepsitory.findUserByUsername(username) != null;
	}
	
	@Override
	public int createUser(SignupDto signupDto) throws Exception {
		User userEntity = signupDto.toEntity();
		
		return userRepsitory.save(userEntity);
		
	@Override 
	public SigninDto login(String username, String password) throws Exception {
		User user = userRepsitory.findUserByUsername(username);
		if(user == null) {
			// 존재하지 않는 사용자 이름(아이디)
			return null;
		}else if(!user.getPassword().equals(password)) {
			// 비밀번호 일치하지 않음
			return null;
		}else {
			// 로그인 성공
			return user.toDto();
		}
	}
	}

}
