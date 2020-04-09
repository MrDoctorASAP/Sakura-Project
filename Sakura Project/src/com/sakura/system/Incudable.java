package com.sakura.system;

/** Implementing this interface allows a component
 *  to be a module of system or the system itself.<br>
 *  It supports three stages: initialization, start runing, shutdown.<br>
 *  For modules - allows you to be included into the system.</br>
 *  @see {@link com.sakura.system.System}
 *  @version 1
 *  */
public interface Incudable {
	
	/**
	 * <b>Initilization</b><br>
	 * Called before the component starts.
	 * @param args - arguments to pass to the component
	 * */
    public void init(String[] args);
    
    /**<p>Called when the component starts after initialization</p>*/
	public void run();
	
	/**<p>Called before system shutdown</p>*/
	public void shutdown();
	
}
