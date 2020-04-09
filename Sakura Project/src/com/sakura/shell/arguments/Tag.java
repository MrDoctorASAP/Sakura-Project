package com.sakura.shell.arguments;

public class Tag {
	
	public static final String symbol = "-";
	
	private String tag;
	
	public Tag(String tag) {
		this.tag = tag;
	}
	
	public String getTag() {
		return tag;
	}
	
	public boolean isAvailable() {
		return tag != null;
	}
	
}
