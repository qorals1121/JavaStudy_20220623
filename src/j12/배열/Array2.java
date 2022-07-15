package j12.배열;

public class Array2 {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		int result = 0;
		// numbers.length = 해당 배열의 길이를 구해주는 값
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = ((i + 1) * 10);
		}
		
		System.out.println(numbers[2]);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for(int i = 0; i < numbers.length; i++) {
			result += numbers[i];
		}
		System.out.println(result);
	}

}
