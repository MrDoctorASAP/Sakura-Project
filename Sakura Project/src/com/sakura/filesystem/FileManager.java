package com.sakura.filesystem;

public interface FileManager<File, Content> {
	
	public Content readFile(File file) throws Exception;
	
	public void writeFile(File file, Content content) throws Exception; 
	
	public void appendToFile(File file, Content content) throws Exception;
	
}
