package j05_입력;

import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("한글을 입력하세요 : ");
		String str = scanner.next(); // int num = scanner.next();는 불가능하다. 입력받는 값은 문자열이기 때문.
		System.out.print("영어를 입력하세요 : ");
		String str2 = scanner.next();
		
		System.out.println("str : " + str);
	    System.out.println("str2 : " + str2);
		
	   // scanner.next(); // 키보드의 값을 받아오는 역할
		
		

		
		
	}

}
