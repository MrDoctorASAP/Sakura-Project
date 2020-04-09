package com.sakura.system;

/**
 * Launcher starts the system.
 * @see System
 * */
public class Launcher {
	
	/**Program entry point*/
	public static void main(String[] args) {
		//create system
		System sakura = new SakuraSystem();
		//create launcher 
		Launcher launcher = new Launcher(sakura);
		//launch system
		launcher.launch(null);
	}
	/**System for launch*/
	private System system;
	
	/**Returns launching system*/
	public System getSystem() {
		return system;
	}
	/**Create new launcher to start up system
	 * @see System*/
	public Launcher(System system) {
		this.system = system;
	}
	
	/**<b>Launch system.</b><br>
	 * Calls the system initialization, assembly and starts it.
	 * @param args - arguments to pass in system
	 * @see System*/
	public void launch(String[] args) {
		system.init(args);
		system.assembly();
		system.run();
	}
	
	public void shutdown() {
		system.shutdown();
	}
	
}
