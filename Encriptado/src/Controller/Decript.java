package Controller;

import model.Write;

class Decript {
	
	public Decript(String path,String password) throws Exception {
		super();
		DecriptFile(path, password);
	}
	
	private void DecriptFile(String path,String password) throws Exception {
		Write.decryptionArchive(password, path);
	}
	
}