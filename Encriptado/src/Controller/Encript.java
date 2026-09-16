package Controller;

import model.Write;

class Encript {
	
	private Write write = new Write();
	
	public Encript(String path,String password) throws Exception{
		super();
		write.WriteEncriptArchive(path, password);
	}
	
}