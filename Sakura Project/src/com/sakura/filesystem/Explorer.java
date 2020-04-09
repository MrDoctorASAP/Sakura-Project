/**
 * 
 */
package com.sakura.filesystem;

/**
 *
 */
public interface Explorer<File, Path> {
	
	public File[] getListFile(File directory) throws Exception;
	
	public void createNewFile(File file) throws Exception;
	
	public void deleteFile(File file) throws Exception;
	
	public void moveFile(File file, Path newPath) throws Exception;
	
	public Path getPath(File file) throws Exception;
	
	public File getFile(Path path) throws Exception;
	
	public boolean isExists(Path path) throws Exception;
	
	public void rename(File file, Path newName) throws Exception;
	
}
