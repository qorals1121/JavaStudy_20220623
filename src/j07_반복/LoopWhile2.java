package j07_반복;

public class LoopWhile2 {

	public static void main(String[] args) {
	/*	int num = 0;
		int result = 0;
		
		result += ++num;
		result += ++num;
		      ....
		result += ++num;
		
		System.out.println(result);
	반복문을 배우지않았을 때 사용할 수 있는 방법
*/
		int num = 0;
		int result = 0;
		
		while(num < 100) {
			result += ++num;
		// 	result = result + ++num; 와 result += ++num;은 의미가 같다.
			
			System.out.println(result);
		}
		
	}

}
