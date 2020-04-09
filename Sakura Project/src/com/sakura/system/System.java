package com.sakura.system;

import java.util.ArrayList;

import com.sakura.module.Informative;
import com.sakura.module.Module;

/**
 * <p>A system is a collection of modules and a control methods.</p>
 * <p>Modules are included in the override method <code>assembly()</code> by the <code>include()</code> method
 * <p>
 * <b>Components launch order</b><br>
 * System.assembly()<br>
 * Components.init()<br>
 * System.start()<br>
 * Components.run()<br>
 * ...<br>
 * System.close()<br>
 * Components.shutdown()<br>
 * </p>
 * @version 1
 * @author MrDoctorASAP
 * */
/*
 * Technical information :
 * 
 * Full components launch order : 
 * 1. System.init()
 * 2. System.assembly()
 * 3. Components.init()
 * 4. System.run()
 * 5. System.start()
 * 6. Components.run()
 * ...
 * 7.System.shutdown()
 * 8.System.close()
 * 9.Components.shutdown()
 * */
public abstract class System implements Incudable, Informative{
	
	/**Assembly of the system. Including modules and setting them up.*/
	public abstract void assembly();
	
	/**Collection modules*/
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	/**Start up system and modules. Call system.start().*/
	@Override
	public void run(){
		//start system
		start();
		//run modules
		for(Module module : modules) {
			module.run();
		}
	}
	
	/**Shutdown components and close system*/
	@Override
	public void shutdown() {
		//close sistem
		close();
		//shotdown modules
		for(Module module : modules) {
			module.shutdown();
		}
	}
	
	/**
	 * <b>Start System.</b><br>
	 * <p>Called before modules run
	 * @see {@link com.sakura.module.Module}</p>
	 * */
	protected abstract void start();
	
	/**
	 * <b>Close System.</b><br>
	 * <p>Called before shotdown modules.
	 * @see {@link com.sakura.module.Module}</p>
	 * */
	protected abstract void close();
	
	/**Adds a module to the system without arguments.<br>
	 * @param module - System component
	 * @see {@link com.sakura.module.Module}*/
	public void include(Module module) {
		include(module, null);
	}
	/**Adds a module to the system with arguments.<br>
	 * @param module - System component
	 * @param args - Arguments to pass to the module
	 * @see {@link com.sakura.module.Module}*/
	public void include(Module module, String[] args) {
		modules.add(module);
		module.init(args);
	}
	
}
