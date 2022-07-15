package j18_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 전체생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class User {
	private int usercode;
	private String username;
	private String password;
	private String name;
	private String email;
	
	//기본생성자
	//전체생성자
	//getter&setter
	//hashCode
	//equals
	//toString

}
