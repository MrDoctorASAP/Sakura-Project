package com.sakura.module;

/**Interface implementation allows a component to have a description.<br>
 * No description by default.
 * @version 1*/
public interface Informative extends Named {
	
	/**Returns information of component.*/
	default String[] getInfo() {
		return null;
	}
	
}