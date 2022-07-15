package j05_입력;

import java.util.Scanner;

public class ScannerNext {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//null : 문자열의 값이 비었다.
		String str1 = null;
		String str2 = null;
		char c = 0; // 0 대신 ' '를 넣어도 됨
		int i = 0;
		double d = 0.0;
		boolean b = false;
		
		// s = space, e = enter
		System.out.print("문자열(s, e -> x) : ");
		str1 = scanner.next();
		scanner.nextLine(); // 허공에 nextLine();을 새로 써주면 버퍼에 남아있던 엔터를 비울 수 있다.
		
		System.out.print("문자열(s, e -> o) : ");
		str2 = scanner.nextLine(); // 두번째 줄에 Line이 있는 경우 첫번째 줄에서 입력했던 문자열 끝의 엔터를 인식한다.
		
		System.out.print("문자 : ");
		c = scanner.next().charAt(0); // next -> 문자열로 입력 받을 수 있음, charAt(0) -> 0번째 문자를 문자로 받아라. 뽑아오는걸 인덱스라고 함.
		
		System.out.print("정수 : ");
		i = scanner.nextInt();
		
		System.out.print("실수 : ");
		d = scanner.nextDouble();
		
		System.out.print("논리 : ");
		b = scanner.nextBoolean();
	
	    System.out.println();
	    
	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(c);
	    System.out.println(i);
	    System.out.println(d);
	    System.out.println(b);
	    
	    // 버퍼란? 일정량 안정적인 만큼 다운받게 해주고 재생이 바로 가능하게 해줌. 버퍼링이 여기서 유래된 말.
	    // 입력할 때 띄어쓰기를 할 경우 버퍼에 enter까지 포함되어있음.
	
	}

	
}
