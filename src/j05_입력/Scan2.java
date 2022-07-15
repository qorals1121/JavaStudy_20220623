package j05_입력;

import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Scanner의 경우 String과 같은 자료형이다. new는 생성, in은 입력, out은 출력.
		// scan까지만 치고 자동완성하면 위에 import까지 자동완성 된다.
		
		System.out.print("이름을 입력하세요 : ");
		
		String name = scanner.next(); //next 의 경우 입력하는 값.
		
		System.out.println("이름 : " + name);
		
		
	}

}
