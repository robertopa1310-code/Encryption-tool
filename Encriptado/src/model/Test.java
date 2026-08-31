package model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Encripter Encrypted = new Encripter();
		Message message = new Message();
		boolean Exit = false;
		while(Exit == false) {
			System.out.println("What do you want to do:");
			System.out.println("1)Encrypt");
			System.out.println("2)Decrypt");
			System.out.println("3)Exit");
			int eleccion = Integer.parseInt(sc.nextLine());
			
			if(eleccion == 1) {
				
				System.out.println("Give me the text to encrypt");
				String texttoencrypt = sc.nextLine();
				System.out.println("Dame la constraseña para cifrar");
				String password = sc.nextLine();
				System.out.println(Encrypted.encrypter(texttoencrypt, password));
				message.setMessage(Encrypted.encrypter(texttoencrypt, password));
				
			}else if(eleccion == 2) {
				
				System.out.println("Give me the password");
				String password = sc.nextLine();
				System.out.println(Encrypted.Decripter(message.getMessage(), password));
				
			}else if(eleccion == 3) {
				Exit = true;
			}
			
		}
		
	}

}