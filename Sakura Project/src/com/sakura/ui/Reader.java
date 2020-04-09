package com.sakura.ui;

/**
 * Implementation of the interface allows
 * the component the ability to read from ui.
 * */
public interface Reader<T> {
	
	public T read() throws Exception;
	
}
