/**
 * 
 */
package model;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
/**
 * 
 */
public class Encripter {
	
	public byte[] encrypter(byte[] contenido,String password) throws Exception {
		Cipher aes = obtenerCipher(true,password);
		byte[] cifrado = aes.doFinal(contenido);
		
		return cifrado;
	}
	
	public byte[] Decripter(byte[] cifrado,String password) throws Exception {
		
		Cipher aes = obtenerCipher(false, password);
		
		byte[] sinccifrar = aes.doFinal(cifrado);
		
		return sinccifrar;
	}
	
	private Cipher obtenerCipher(boolean Opcion,String password) throws Exception {
		final MessageDigest Digest = MessageDigest.getInstance("SHA-256");
		Digest.update(password.getBytes("UTF-8"));
		SecretKeySpec Key = new SecretKeySpec(Digest.digest(), 0, 16, "AES");
		Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
		if(Opcion) {
			aes.init(Cipher.ENCRYPT_MODE, Key);
		}else {
			aes.init(Cipher.DECRYPT_MODE, Key);
		}
		return aes;
	}
	
}