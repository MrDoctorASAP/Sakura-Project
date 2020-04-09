package com.sakura.module;

/**Implementation of the interface allows the component to have a name.<br>
 * The default name is a class name.
 * @version 1*/
public interface Named {
	
	/**Returns component name<br>
	 * The default component name is a class name*/
	default String getName() {
		return this.getClass().getName();
	}
	
}
