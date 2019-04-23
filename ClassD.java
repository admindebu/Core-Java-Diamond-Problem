package com.imaginea.diamondproblem;

public class ClassD implements InterfaceA, InterfaceB, InterfaceC {

	@Override
	public void getColor() {
		System.out.println("I am a green Color ball");

	}
	public static void main(String[] args) {
		
		InterfaceA objectA = new ClassD();
		InterfaceB objectB = new ClassD();
		InterfaceC objectC = new ClassD();

		objectA.getColor();
		objectB.getColor();
		objectC.getColor();
	}
	}
