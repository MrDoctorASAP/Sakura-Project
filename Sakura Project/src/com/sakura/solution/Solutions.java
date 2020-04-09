package com.sakura.solution;

import com.sakura.module.Informative;
import com.sakura.ui.TextUI;

public class Solutions {
	
	/**Print information about <code>Informative</code> compoent in <code>TextUI</code>
	 * @param ui - TextUI
	 * @param object - Informative object 
	 * @see TextUI
	 * @see Informative*/
	public static void printInfo(TextUI ui, Informative object) {
		try {
			ui.print(object.getName());
			String[] info = object.getInfo();
			if(info != null)
				for(String line : info) {
					if(line != null) ui.print(line);
				}
		}catch(Exception e) { }
	}
	
}
