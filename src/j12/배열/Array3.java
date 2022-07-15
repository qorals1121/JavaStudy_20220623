package j12.배열;

import j10_클래스.Phone; // 다른 패키지에 있기 때문에 import 해서 가져와야함.

public class Array3 {

	public static void main(String[] args) {
		Phone[] phones = new Phone[10];
		
		for(int i = 0; i < phones.length; i++) {
			System.out.println(phones[i]);
		}
		
//		Phone p = new Phone(); //주소값
//		
//		int[] nums = new int[10];
//		
//		int num = 10;
		
		//주소를 만들 수 있는 공간 10개를 만든 것
		
		for(int i = 0; i < phones.length; i++) {
			phones[i] = new Phone();
		}
		
		phones[2].setCompany("SAMSONG");
		phones[5].setCompany("LG");
		phones[7].setCompany("APPLE");
		
		for(int i = 0; i < phones.length; i++) {
			if (phones[i].getCompany() == null) {
				continue;
				
				// 혹은 if (phones[i].getCompany != null) {
				// phones[i].showInfo(); }
			}
			phones[i].showInfo();
		}
		
	}

}
