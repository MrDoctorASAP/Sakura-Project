package com.sakura.shell.arguments;

public class Command {
	
	private String pkg;
	
	private String name;
	
	private Argument[] args;
	
	public Command(String pkg, String name,Argument[] args) {
		this.pkg = pkg;
		this.name = name;
		this.args = args;
	}
	
	public String getPkg() {
		return pkg;
	}
	
	public String getName() {
		return name;
	}
	
	public Argument[] getArguments() {
		return args;
	}
	
}
