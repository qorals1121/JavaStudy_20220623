package j10_클래스;

public class FishBunMain {
public static void main(String[] args) {
		new FishBun();
		
		FishBun fishBun = new FishBun(); //생성. 해당 틀로 인스턴스 생성 가능. 
		FishBun fishBun2 = new FishBun(); // 생성하고나면 해당되는 데이터만큼 빌려야하고, 반납해야한다. (소멸)
		                                  // 소멸을 깜빡할 수 있는데, java에서는 가비지 컬렉터라는 기능이 쓰지않는 데이터를 자동 or 수동으로 소멸시켜준다.
	
		
		//변수는 무언가를 담을 수 있는 통이라고 생각하면 됨.  
		// class = 붕어빵 틀 or 집 도면, object = 붕어빵 or 만들어진 집, 인스턴스 = 재료 or 각각의 집

		System.out.println(fishBun);
		System.out.println(fishBun2);
		// 실행시켰을 때 j10_클래스.FishBun@5aaa6d82 라는 글이 나오는데 맨뒤에 값이 주소이다.
		// 둘은 똑같이 만들어지기 때문에 동일한 크기를 할당받는다. (= 똑같은 집을 만들어준다) 
		
		fishBun.material = "팥"; 
		fishBun2.material = "슈크림";
		
		System.out.println(fishBun.material); 
		System.out.println(fishBun2.material);
	}

}