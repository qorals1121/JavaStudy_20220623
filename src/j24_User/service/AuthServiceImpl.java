package j24_User.service;

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
}
