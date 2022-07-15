package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericTest2<T, E> { // E로 사용하는 경우가 있음 (클래스자료형 타입) T는 일반 타입 (Int, String 등)
	private T data1; 
	private E data2;
	
}
