package Controller;

import model.Write;

class Decript {
	
	private Write write = new Write();
	
	public Decript(String path,String password) {
		super();
	}
	
	private void DecriptFile(String path,String password) throws Exception {
		write.decryptionArchive(password, path);
	}
	
}