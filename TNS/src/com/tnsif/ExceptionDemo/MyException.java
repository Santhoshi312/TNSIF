package com.tnsif.ExceptionDemo;

@SuppressWarnings("serial")
public class MyException extends Exception {
	public MyException(String mesg) {
		super(mesg);
	}
}
