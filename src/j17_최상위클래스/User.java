package j17_최상위클래스;

import java.util.Objects;

public class User {
	private int usercode;
	private String username;
	

	
	
	// google에서 lombok 다운로드, 이클립스 폴더에 다운, 모두 체크 해제하고 본인 

public User() {
	}


	public User(int usercode, String username) {
		super();
		this.usercode = usercode;
		this.username = username;
	}
	
	public int getUsercode() {
		return usercode;
	}


	public void setUsercode(int usercode) {
		this.usercode = usercode;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
/*
	@Override
	public int hashCode() { // 값을 가지고 만들어진 코드값을 비교
		return Objects.hash(usercode, username);
	}
	
	@Override
	public boolean equals(Object obj) {
		// 주소비교
		if(this == obj) {
			return true;
		}
		// 매개변수가 null인지 확인
		if(obj == null) {
			return false;
		}
		//서로의 인스턴스가 같은지 확인
		if(this.getClass() != obj.getClass()) { // 같은 의미. if(!(obj instanceof User)) {return false;}
			return false;
		}
		User user = (User) obj;
		
		return usercode == user.usercode && Objects.equals(username, user.username); // 서로의 문자열을 비교할 때 사용
		
	}
	*/

	@Override //공통된 메소드를 오버라이드해 나만의 메소드로 만들어 사용한다.
	public String toString() {
		return "User [usercode=" + usercode + ", username=" + username + "]";
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(usercode, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return usercode == other.usercode && Objects.equals(username, other.username);
	}



	
	

}
