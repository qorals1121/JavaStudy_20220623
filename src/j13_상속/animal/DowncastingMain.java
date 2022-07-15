package j13_상속.animal;

public class DowncastingMain {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Animal();
		animals[1] = new Human();
		animals[2] = new Tiger(); 
		
		for(int i = 0; i <animals.length; i++) {
			animals[i].move();
		}
		
		for(Animal animal : animals) { //animals 안에 있는 animal을 꺼내 대입하여 animal.move();로 실행한다. 이것을 for each라고 한다.
			animal.move();
		}
		// 현재 인덱스가 필요한 경우 for each는 사용하지 못한다. 처음부터 끝까지의 배열이 필요한 경우에는 for each가 훨씬 많이 사용된다. 
		
//		Human human = (Human) animals[0]; 
//		// 원래 animal이었던 것을 다시 animal로 바꾸는 것은 괜찮지만 엉뚱한 것으로 바꾸려고 하면 없는 것으로 취급된다. (메모리에 아예 존재하지 않는다)
//		human.readBooks();
		
		System.out.println();
		
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Human) { //instanceof = 객체 중에 ~~가 있는지 확인 (T, F로 결과가 나옴)
			Human human = (Human) animals[i];
			human.readBooks();
			
			} else if(animals[i] instanceof Tiger) {
				Tiger tiger = (Tiger) animals[i];
				tiger.hunting();
				
			}else {
				System.out.println("Downcasting 하지 않음");
			}}
		
		for(Animal animal : animals) {
		 if (animal instanceof Tiger) {
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
			
		} else if(animal instanceof Human) {
			Human human = (Human) animal;
			human.readBooks();
	
		}else {
			System.out.println("Downcasting하지 않음");
		}}

	}

}
