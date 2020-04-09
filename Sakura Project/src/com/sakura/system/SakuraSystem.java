package com.sakura.system;

import com.sakura.commandsystem.SakuraCommandSystem;
import com.sakura.log.debug.ConsoleDebug;
import com.sakura.solution.Solutions;
import com.sakura.ui.Console;

/**<b>Sakura System</b><br>
 * Contains : <br>
 * Console - default java console ui<br>
 * ConsoleDebug - system to print debug messages<br>
 * SakuraCommandSystem - command system<br>
 * @version 1.0
 * @see System*/
public class SakuraSystem extends System {
	
	/* Information */
	
	/**System name*/
	public static final String name = "Sakura Project";
	
	/**System description*/
	public static final String[] info = {
			"Version : 1.0.0.0",
			"Author : MrDoctorASAP"
	};
	
	/* Modules */
	
	/**Default java console*/
	public Console console;
	
	/**Console debug*/
	public ConsoleDebug debug;
	
	/**Command System*/
	public SakuraCommandSystem cmd;
	
	/* System */
	
	@Override
	public void assembly() {
		include(console);
		include(debug);
		include(cmd);
	}
	
	@Override
	public void init(String[] args) {
		console = new Console(this);
		debug = new ConsoleDebug(this, console);
		cmd = new SakuraCommandSystem(this, console);
	}
	
	@Override
	public void start() {
		Solutions.printInfo(console, this);
		Solutions.printInfo(console, cmd);
		cmd.start();
	}

	@Override
	public void close() {
		
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String[] getInfo() {
		return info;
	}
	
}
