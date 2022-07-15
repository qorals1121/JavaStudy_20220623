package j20_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetTest {

	public static void main(String[] args) {
		String[] names = {"곽다은", "곽다은", "감승현", "이희산", "김지원", "최영찬", "안창은"};
		List<String> nameList = Arrays.asList(names);
		
		System.out.println(nameList);
		
		HashSet<String> nameSet = new HashSet<String>(); //새롭게 바뀐 해쉬셋에 넣어주는 것이다.
		nameSet.addAll(nameList); //addAll은 컬렉션으로 만들어져있는 것들을 모두 넣을 수 있는 것이다. 
		
		System.out.println(nameSet);
		
		// 값추가
		nameSet.add("감승현"); //같은 이름을 넣으면 중복이라 안들어가지만 다른 이름을 넣으면 추가가 된다.
		System.out.println(nameSet);
		
		// 값제거
		nameSet.remove("김준일");
		System.out.println(nameSet);
		
		Iterator<String> ir = nameSet.iterator();
		
		while(ir.hasNext()) {
			String name = ir.next();
			System.out.println(name.equals("곽다은"));
		}

	}

}
