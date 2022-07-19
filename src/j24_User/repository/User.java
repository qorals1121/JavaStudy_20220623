package j24_User.repository;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	private int usercode;
	private String name;
	private String email;
	private String username;
	private String password;
}
