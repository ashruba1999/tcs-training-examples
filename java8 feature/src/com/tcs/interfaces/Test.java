package com.tcs.interfaces;

public interface Test {
	
	void method1();
	void method2();
	
	
	static void method3() {
		System.out.println("static method inside test");
		
		
	
	}
	
	default void method4() {
		
		System.out.println("default method() inside test");
		
	}

}
