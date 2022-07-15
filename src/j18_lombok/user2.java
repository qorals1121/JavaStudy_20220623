package j18_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
// import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// @NoArgsConstructor // final이 들어있으면 사용하지 못함. 
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class user2 {
	@NonNull 
	private final int usercode;
	@NonNull
	private final String username;
	private String password;
	private String name;
	private String email;



}
