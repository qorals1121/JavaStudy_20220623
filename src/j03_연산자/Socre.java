package j03_연산자;

public class Socre {

	public static void main(String[] args) {
		int score = 80;
		int temp = 0;
		int temp2 = 0;
		// score = score + 1; 
		temp = score++; // 더하고 대입까지
		// 선증가(감소)의 경우 대입된 시점에서 더하는거지만 후증가(감소)의 경우 다음번에 더하는 것이라 결과값이 다르게 나옴
		temp2 = score;
		
		System.out.println(temp);
		System.out.println(temp2);
		System.out.println(++temp2);
		System.out.println(temp2++);
		System.out.println(temp2);
		
	}

}
