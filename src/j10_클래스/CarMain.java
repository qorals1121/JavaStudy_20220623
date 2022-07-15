package j10_클래스;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 차량 3대
		 * 
		 * 1. 기아 자동차
		 *    K3
		 *    화이트
		 *    
		 * 2. 현대 자동차
		 *    쏘나타
		 *    블랙
		 *    
		 * 3. BMW
		 *    520d
		 *    레드
		 *    
		 */
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.company = "기아 자동차";
		car1.model = "k3";
		car1.color = "화이트";
		
		car2.company = "현대 자동차";
		car2.model = "쏘나타";
		car2.color = "블랙";
		
		car3.company = "BMW";
		car3.model = "520d";
		car3.color = "레드";
		
		car1.showInfo();
		car2.showInfo();
		car3.showInfo();
		
		
	}

}
