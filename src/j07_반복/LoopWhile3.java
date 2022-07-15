package j07_반복;

import java.util.Scanner;

public class LoopWhile3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 반복 횟수 입력을 받는다.(int n)
		int i = 0;
		int n = 0;
		int result = 0;
		
		System.out.print("반복 횟수 입력 : ");
		n = scanner.nextInt();
		
		while(i < n) {
			System.out.println(i);
			i++;
		}
		
	}

}
