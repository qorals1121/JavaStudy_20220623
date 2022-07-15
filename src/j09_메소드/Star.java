package j09_메소드;

import java.util.Scanner;

public class Star {
	
	public static void printStar(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void printStar(String n) {
		int n2 = Integer.parseInt(n); // 문자열을 숫자로 바꿔주는 것
		
		for(int i = 0; i < n2; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static String inputN() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("별을 몇 번 찍을까요? ");
		return scanner.nextLine(); // String으로 받았기 때문에 nextLine을 사용한다
	}
	
	public static void main(String[] args) {
		
		String n = inputN();
		System.out.println("입력 받은 n : " + n);
		printStar(n);
		printStar(5);

	}

}
