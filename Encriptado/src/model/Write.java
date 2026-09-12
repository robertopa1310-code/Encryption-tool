package model;

import java.io.File;
import java.io.FileOutputStream;

public class Write {
	
	private Encripter enc = new Encripter();
	
	public Write() {
		super();
	}
	
	public void WriteEncriptArchive(String path,String password) {
		
		try(FileOutputStream fos = new FileOutputStream(PathandFile(path,true))) {
			Read read = new Read();
			System.out.println(PathandFile(path,true));
			fos.write(enc.encrypter(read.readFile(path), password));
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	public void decryptionArchive(String password,String path) throws Exception {
		
		Read read = new Read();
		
		try(FileOutputStream fos = new FileOutputStream(PathandFile(path,false))) {
			
			fos.write(enc.Decripter(read.readFile(path), password));
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
	}
	
	private String NameChecker (String path) {
		String[] Text = path.split("Encripted|Decrip|\\\\");
		return Text[Text.length-1];
	}
	
	private String PathandFile(String path,boolean decision) {
		
		String[] Text = path.split("\\\\");
		String Name = "";
		if(decision) {
			Name = "Encripted"+NameChecker(path);
		}else {
			Name = "Decrip"+NameChecker(path);
		}
		
		Text[Text.length-1] = Name;
		
		String chain = "";
		for(int i = 0;i<Text.length;i++) {
			if(i<Text.length-1) {
				chain = chain+Text[i]+"\\";
			}else {
				chain = chain+Text[i];
			}
		}
		
		return chain;
	}
	
}