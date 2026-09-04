package model;

import java.io.File;

public class file {
	
	private File File = null;
	
	
	public file(String path) {
		super();
		this.File = new File(path);
	}
	
	public boolean exists() {
		return File.exists();
	}
	
	public boolean isFile() {
		return File.isFile();
	}
	
	public boolean isDirectory() {
		return File.isDirectory();
	}
	
	public File FileReturn() {
		return File;
	}
}