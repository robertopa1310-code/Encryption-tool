package model;

import java.io.FileOutputStream;

public class Write {
	
	private static Encripter enc = new Encripter();
	
	
	public static void WriteEncriptArchive(String path,String password) throws Exception {
		
		try(FileOutputStream fos = new FileOutputStream(PathandFile(path,true))) {
			System.out.println(PathandFile(path,true));
			fos.write(enc.encrypter(Read.readFile(path), password));
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	
	public static void decryptionArchive(String password,String path) throws Exception {

		
		try(FileOutputStream fos = new FileOutputStream(PathandFile(path,false))) {
			
			fos.write(enc.Decripter(Read.readFile(path), password));
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	private static String NameChecker (String path) {
		String[] Text = path.split("Encripted|Decrip|\\\\");
		return Text[Text.length-1];
	}
	
	private static String PathandFile(String path,boolean decision) {
		
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