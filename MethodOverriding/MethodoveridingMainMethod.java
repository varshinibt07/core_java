package com.xworkz.corejava.MethodOverriding;

public class MethodoveridingMainMethod {

	public static void main(String[] args) {
		RBI rbi = new RBI();
		Canara canara = new Canara();
		SBI sbi = new SBI();

		rbi.intrestrate();
		canara.intrestrate();
		sbi.intrestrate();

	}

}
