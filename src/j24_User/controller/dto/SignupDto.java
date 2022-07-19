package j24_User.controller.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SignupDto {
	private String name;
	private String email;
	private String username;
	private String password;
	
	
}
