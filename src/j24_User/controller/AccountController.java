package j24_User.controller;

import j24_User.controller.dto.CMRespDto;

public class AccountController {
	
	public CMRespDto<?> myPage() {
		
		return new CMRespDto<>(1, "마이페이지 로드 성공", null);
	}
}
