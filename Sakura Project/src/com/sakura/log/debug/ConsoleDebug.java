package com.sakura.log.debug;

import com.sakura.system.System;
import com.sakura.ui.TextUI;

public class ConsoleDebug extends DebugLog {

	private boolean enable;
	
	public ConsoleDebug(System system, TextUI ui) {
		super(system, ui);
	}

	@Override
	public void init(String[] args) {
		enable = true;
	}

	@Override
	public void run() {
		com.sakura.solution.Solutions.printInfo(ui, this);
	}

	@Override
	public void shutdown() { }

	@Override
	public void log(String log) {
		try{
			if(enable) ui.print(log);
		} catch(Exception e) { }
	}
	
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	public String getName() {
		return super.getName() + " enable.";
	}
	
}
