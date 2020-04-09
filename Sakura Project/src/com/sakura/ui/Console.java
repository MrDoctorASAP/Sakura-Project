package com.sakura.ui;

import java.util.Scanner;

import com.sakura.system.System;
import com.sakura.module.Module;

/**
 * <b>Default java console module.</b><br>
 * Implements embedded input and output streams ({@link java.lang.System}).
 * @see Module
 * @see TextUI
 * */
public class Console extends Module implements TextUI {
	
	//simple text reader
	private Scanner scanner;
	
	public Console(System system) {
		super(system);
	}

	/**Read string line from ui*/
	@Override
	public String read() throws Exception {
		return scanner.nextLine();
	}

	/**Print string to ui*/
	@Override
	public void print(String content) {
		java.lang.System.out.println(content);
	}
	
	/**Print empty line*/
	public void print() {
		print("");
	}
	
	@Override
	public void init(String[] args) {
		scanner = new Scanner(java.lang.System.in);
	}

	@Override
	public void run() { }

	@Override
	public void shutdown() { }
	
}
