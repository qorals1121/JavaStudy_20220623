package j19_제네릭.wildcard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class WildCardTest<T> {
	private T data;
	

}
