package model;

import java.io.FileInputStream;

class Read {

	
	
	public static byte[] readFile(String path) {
		
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