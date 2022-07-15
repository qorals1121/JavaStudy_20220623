package j07_반복;

public class Star {

	public static void main(String[] args) {
/*
 *  *
 *  ** 
 *  ***
 *  ****
 *  *****
 *   
 */
	
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i + 1; j++) {
			System.out.print("*");}
	
			System.out.println();
				}
		
		System.out.println("=====================");
		// 변수의 값을 0으로 두는 것이 제일 좋기 때문에 좋은 코드는 아님,,,,,
		for(int k = 0; k < 10; k++) {
			for(int x = 9; x + 1 > k; x--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			System.out.println("==========================");
		}
		int n = 10;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
				for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
				for(int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
       /*
        * 숙제로
        *                 *
        *                **
        *               ***
        *              ****
        *             *****
        *             *****
        *              ****
        *               ***
        *                **
        *                 *
        * 해오기
        * 
        */
	}
		
	}