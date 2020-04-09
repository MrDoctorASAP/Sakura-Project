package com.sakura.log.debug;

import com.sakura.system.System;

public abstract class DebugLog extends com.sakura.module.Module{
	
	public com.sakura.ui.TextUI ui;
	
	public DebugLog(System system, com.sakura.ui.TextUI ui) {
		super(system);
		this.ui = ui;
	}
	
	public abstract void log(String log);
	
}
