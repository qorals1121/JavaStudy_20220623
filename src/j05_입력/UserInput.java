package j05_입력;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * name
		 * age
		 * birthday(1994 09 07)
		 * phone
		 * email
		 * address
		 * gender
		 */
		
		String name = null;
		int age = 0;
		String birthday = null;
		String phone = null;
		String email = null;
		String address = null;
		char gender = 0;
		
		
		System.out.print("이름을 입력하시오 : ");
		name = scanner.next();
		
		System.out.print("나이를 입력하시오 : ");
		age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("생년월일을 입력하시오 : ");
		birthday = scanner.nextLine();
		
		System.out.print("연락처를 입력하시오 : ");
		phone = scanner.next();
		scanner.nextLine(); // nextLine 전 nextLine이 아닌 next 등등 밑에 nextLine으로 버퍼를 지워준다
		
		System.out.print("이메일을 입력하시오 : ");
		email = scanner.next();
		scanner.nextLine();
		
		System.out.print("주소를 입력하시오 : ");
		address = scanner.nextLine();
		
		System.out.print("성별을 입력하시오 : ");
		gender = scanner.next().charAt(0);
		
		System.out.println();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("생년월일 : " + birthday);
		System.out.println("연락처 : " + phone);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("성별 : " + gender);
	}

}
