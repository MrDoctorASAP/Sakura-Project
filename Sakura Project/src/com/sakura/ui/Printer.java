package com.sakura.ui;

/**
 * Implementation of the interface allows
 * the component the ability to print to ui.
 * */
public interface Printer<T> {
	
	public void print(T content) throws Exception;
	
}
