package com.sakura.shell;

import com.sakura.shell.arguments.Command;

public interface CommandParser {
	
	public Command parse(String line);
	
}
