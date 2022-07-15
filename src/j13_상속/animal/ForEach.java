package j13_상속.animal;

public class ForEach {

	public static void main(String[] args) {
		String names[] = new String[3];
		names[0] = "김준일";
		names[1] = "김준이";
		names[2] = "김준삼";
		names[3] = "김준사";

		System.out.println();
		
		String name = names[0];
		System.out.println(name);
		name = names[1];
		System.out.println(name);
		
		System.out.println();
	
		for(String n : names) {
			System.out.println(n);
		}
	}

}
