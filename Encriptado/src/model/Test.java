package model;

import java.io.File;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f1 = new File("D:\\workspace java\\Ejercicios_java\\src\\fichero_binario_repaso\\ProyectosJava\\Encripted88481ab8-db37-40ed-a6dd-01085df91be2.jpg");
		Scanner sc = new Scanner(System.in);
		Write w = new Write();
		
		boolean exit = true;
		
		while(exit) {
			System.out.println("Que vas hacer");
			System.out.println("1)Encriptar");
			System.out.println("2)Decriptar");
			System.out.println("");
			System.out.print("Decide: ");
			int eleccion = Integer.parseInt(sc.nextLine());
			System.out.println("");
			switch(eleccion) {
			case 1:
				System.out.println("Dime una contraseña para encriptar");
				w.WriteEncriptArchive(f1.getAbsolutePath(),sc.nextLine());
				break;
			case 2:
				System.out.println("Dime la ruta del archivo");
				String ruta = sc.nextLine();
				System.out.println("Dime la contra del archivo");
				String password = sc.nextLine();
				w.decryptionArchive(password,ruta);
				break;
			default:
				System.out.println("No existe");
			}
		}
		
	}

}