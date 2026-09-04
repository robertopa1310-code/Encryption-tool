package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read {
	
	private File file;
	
	public Read(File file) {
		super();
		this.file = file;
	}



	public byte[] readFile() {
		
		byte[] byteRead = new byte[1024];
		
		try(FileInputStream fis = new FileInputStream(file)) {
			
			
			byteRead = fis.readAllBytes();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return byteRead;
		
	}
	
	
}