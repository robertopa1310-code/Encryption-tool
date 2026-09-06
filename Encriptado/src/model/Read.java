package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read {
	
	public Read() {
		super();
	}

	
	
	public byte[] readFile(String path) {
		
		byte[] byteRead = null;
		
		try(FileInputStream fis = new FileInputStream(path)) {
			
			
			byteRead = fis.readAllBytes();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return byteRead;
		
	}
	
	
}