package j19_제네릭;
/*
 * 제네릭이란 데이터 타입 (data-type) 즉, 자료형을 일반화한다. (generalize)
 * 1. T (Type) - Integer, String, Double, Boolean
 * 2. E (Elements) - 일반 자료형이 아닌 참조 자료형을 사용할 때
 * 3. K (Key), V (Value) 
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericTest<T> { // E로 사용하는 경우가 있음 (클래스자료형 타입) T는 일반 타입 (Int, String 등)
	private T data1; 
	private T data2;
	
}
