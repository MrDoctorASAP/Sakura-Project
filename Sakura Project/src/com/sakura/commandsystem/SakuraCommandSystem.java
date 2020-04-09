package com.sakura.commandsystem;

import com.sakura.system.System;
import com.sakura.ui.TextUI;

public class SakuraCommandSystem extends com.sakura.module.Module implements CommandSystem {
	
	private TextUI console;
	
	private boolean active;
	
	public SakuraCommandSystem(System system, TextUI console) {
		super(system);
		this.console = console;
	}

	@Override
	public void init(String[] args) {
		
	}

	@Override
	public void run() {
		
	}
	
	@Override
	public void shutdown() {
		stop();
	}
	
	@Override
	public void start() {
		active = true;
		while(active) {
			try {
				console.read();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void stop() {
		active = false;
	}
	
}
