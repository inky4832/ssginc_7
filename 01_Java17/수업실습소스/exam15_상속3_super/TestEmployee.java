package exam15_상속3_super;

public class TestEmployee {

	public static void main(String[] args) {

		Engineer eng = new Engineer();
		System.out.println(eng.getName());// Engineer
		System.out.println(eng.getSuperName()); // Employee
		
		System.out.println(eng.getName2());// Engineer
		System.out.println(eng.getSuperName2()); // Employee
	}

}
