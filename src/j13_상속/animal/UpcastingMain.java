package j13_상속.animal;

public class UpcastingMain {

	public static void main(String[] args) {
		
		/*
		 * 다운캐스팅의 조건 : 업캐스팅이 되었던 녀석이어야만 한다.
		 */
		Animal[] animals = new Animal[3];
		
		animals[0] = new Animal();
		animals[1] = new Human();
		animals[2] = new Tiger(); 
		
		for(int i = 0; i <animals.length; i++) {
			animals[i].move();
		}


		
}
}
