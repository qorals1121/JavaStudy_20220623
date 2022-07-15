package j07_반복;

import java.util.Scanner;

public class LoofForGugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan = 2;
		
		for(int i = 0; i < 9 ; i++) {
			int i2 = i + 1;
			System.out.println(dan + " X " + i2 + " = " + (dan * i2));
			
		}
		System.out.println();
		
		for(int dan2 = 0; dan2 < 8; dan2++) {
			int dan3 = dan2 + 2;
			System.out.println(dan3 + "단");
		
			for (int num = 0; num < 9; num++) {
				int num1 = num + 1;
				System.out.println(dan3 + " X " + num1 + " = " + (dan3 * num1));
			
		}	
			System.out.println("=====================");
		    }
		
		int b = 0;
		System.out.print("단을 입력하시오 : ");
		b = scanner.nextInt();
		
		for(int a = 0; a < 9; a++) {
			int c = a + 1;
			System.out.println(b + " X " + c + " = " + (b * c));
		}
		
		// 규칙적인 반복에는 for문이 훨씬 간편하다!
		
				}

}
