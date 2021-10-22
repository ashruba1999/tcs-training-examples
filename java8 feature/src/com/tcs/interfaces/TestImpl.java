package com.tcs.interfaces;

public class TestImpl  implements Test{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("\"method1() part of TestImpl");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("\"method2() part of TestImpl");
		
	}
	
	public void method4() {
		
		System.out.println("method4 is overriden in TestImpl");
	}

}
