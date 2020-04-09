package com.sakura.shell;

import com.sakura.shell.arguments.Command;
import com.sakura.shell.arguments.Tag;

public class SakuraCommandParser implements CommandParser{

	@Override
	public Command parse(String line) {
		return null;
	}
	
	private boolean isTag(String line) {
		return line.startsWith(Tag.symbol);
	}

	private int i;
	
	private String next() {
		return null;
	}
	
	private void back() {
		
	}
	
}
