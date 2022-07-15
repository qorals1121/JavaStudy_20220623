package j20_컬렉션.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/*
		 * numbers 5개의 공간을 가진 배열을 만든다. 5개의 공간에는 1, 5, 4, 3, 2의 값이 순서대로 들어있다.
		 * 
		 * 값 5를 찾아서 제거를 하고 뒤에 있는 값들을 앞으로 정렬하는 프로그램을 작성하시오 값 5를 제거한다는 의미는 0으로 만든다는 의미이다.
		 * 정렬 후에 마지막 인덱스의 값은 0이어야 한다.
		 */

		int[] numbers = { 1, 5, 5, 3, 2, 5, 7, 6, 5, 8, 9 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 5) {
				for (int j = i; j < numbers.length; j++) {
					if (j != numbers.length - 1) { // j가 마지막 인덱스가 아니라면 넣으라는 뜻
						numbers[j] = numbers[j + 1];
					} else {
						numbers[j] = 0;
					}
				}
				if (numbers[i] == 5) { // 5를 제거했는데 그 뒤의 값이 또 5라면 i를 앞으로 한칸 땡겨주는 것
					i--;
				}
			}

		}
		int[] numbers2 = null;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[numbers.length - i - 1] != 0) {
				numbers2 = new int[numbers.length - i]; // 새로운 공간 8개를 만들어줌
				for(int j = 0; j < numbers2.length; j++) {
					numbers2[j] = numbers[j]; // 반복을 하며 옮겨줌
				}
				break;
			}
		}
		for (int num : numbers) {
			System.out.print(num);

		}
		
		System.out.println();
		for(int num2 : numbers2) {
			System.out.print(num2);
		}
	}

}
