package com.sakura.shell.arguments;

public class Value {
	
	private String value;
	
	public Value(String value) {
		this.value = value;
	}
	
	public boolean isAvailable() {
		return value != null;
	}
	
	public String toString() {
		return value;
	}
	
	public int toInt() throws Exception {
		try {
			return Integer.parseInt(value);
		}catch(Exception e) {
			throw new Exception("\"" + value + "\" is not a integer.");
		}
		
	}
	
	public boolean toBoolean() throws Exception {
		if(value.equalsIgnoreCase("true")) return true;
		if(value.equalsIgnoreCase("false")) return false;
		throw new Exception("\"" + value + "\" is not a boolean.");
	}
	
	public double toDouble() throws Exception{
		try {
			return Double.parseDouble(value);
		}catch(Exception e) {
			throw new Exception("\"" + value + "\" is not a double.");
		}
	}
	
}
