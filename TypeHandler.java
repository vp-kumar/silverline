package com.rtjvm.java.lectures.codetest;

public class TypeHandler {

	public void handleType(String type) {

		String dataType = type.equals("a") ? type : type.toUpperCase();
		switch (dataType) {
			case "a":
				executeA();
				break;
			case "B":
				executeB();
				break;
			case "C":
				executeC();
				break;
			case "D":
				executeD();
				break;
		}

	}

	void executeA() {
		System.out.println("type A:");

	}

	void executeB() {
		System.out.println("type B:");

	}

	void executeC() {
		System.out.println("type C:");

	}

	void executeD() {
		System.out.println("type D:");
	}

	public static void main(String args[]) {
		TypeHandler handler = new TypeHandler();
		handler.handleType("a");
		handler.handleType("b");
		handler.handleType("D");
		handler.handleType("A");
	}
}
