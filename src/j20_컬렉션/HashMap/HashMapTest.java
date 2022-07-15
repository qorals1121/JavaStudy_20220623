package j20_컬렉션.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		// 값 추가
		map.put(1, "정희정"); // map은 add가 없고 put이 있다
		map.put(2, "서영우");
		map.put(3, "김솜이");
		map.put(4, "이승엽");
		map.put(5, "김경민");
		map.put(6, "김규탁");

		System.out.println(map);

		// key 값으로 value 값 조회
		System.out.println(map.get(1)); // get안에는 key값을 넣는다, key값은 우리가 지정할 수 있다

		map.containsKey(map); // contain = 값을 포함하고 있으면, key or value를 뒤로 붙임

		// key 값으로 value 값 조회할 때 만약 key 값이 존재하지 않으면 뒤에 있는 value값 리턴
		System.out.println(map.getOrDefault(22, "값이 없습니다.")); // key값이 존재하지 않으면, 이 값을 주어라

		// 두개는 같은 의미
		Set<Entry<Integer, String>> entry = map.entrySet();
		System.out.println(entry);

		Iterator<Entry<Integer, String>> ir = map.entrySet().iterator();
		while (ir.hasNext()) {
			Entry<Integer, String> entry2 = ir.next();
			System.out.println(entry2);
			System.out.println("key : " + entry2.getKey());
			System.out.println("value : " + entry2.getValue());
			System.out.println();
		}

		// keySet = key값들을 set으로 바꿔준다
		Iterator<Integer> ir2 = map.keySet().iterator();
		while (ir2.hasNext()) {
			int key = ir2.next();
			System.out.println(key);
			System.out.println(map.get(key));
			System.out.println();
		}
		
		List<String> strList = new ArrayList<String>();
		strList.addAll(map.values());
		System.out.println(strList);
		System.out.println();
		
		strList.forEach(r -> {
			System.out.println("이름 : " + r);
			System.out.println();
			if(r.equals("정희정")); {
				return;
			}
		});
		System.out.println("이름 출력 후 확인");
		
		entry.forEach(r -> {
			System.out.println("entry : " + r);
			System.out.println("key : " + r.getKey());
			System.out.println("value : " +r.getValue());
			System.out.println();
		});
		
		map.forEach((k, v) -> {
			System.out.println("Key : " + k);
			System.out.println("value : " + v);
		});

	}

}
