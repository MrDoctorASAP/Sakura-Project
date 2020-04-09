package com.sakura.module;

import com.sakura.system.Incudable;
import com.sakura.system.System;

/**
 * <b>System module</b><br>
 * <p>Module is a component that can be included into the system.<p>
 * <p>
 * Module has access to the system and other modules of its system.<br>
 * Module has name and information about self.<br>
 * </p><p>
 * The module has three control methods : <br>
 * init() - initlization <br>
 * run() - start module <br>
 * shutdown() - shutdown module, calls before shutdown system <br>
 * </p>
 * @see System
 * @see Incudable
 * @see Informative
 * @version 1
 * @author MrDoctorASAP
 * */
public abstract class Module implements Incudable, Informative {
	
	/**
	 * <b>System</b>
	 * <p>Access to this system and others modules.</p>
	 * @see System
	 * */
	private System system;
	
	/**Ñreate a new module with access to the system*/
	public Module(System system) {
		// Allow access to the system and other components
		this.system = system;
	}
	
}