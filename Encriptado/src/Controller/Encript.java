package Controller;

import model.Write;

class Encript {
	
	public Encript(String path,String password) throws Exception{
		super();
		Write.WriteEncriptArchive(path, password);
	}
	
}