package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.crypto.KeyGenerator;

public class SpeckCipher implements encryptable{
	private String word;
	private byte[] bytegroup;
	private byte[] bytekey;
	private KeyGenerator gen;
	public SpeckCipher()
	{
		Scanner keyboard;
		try {
			keyboard = new Scanner(new File("src\\mainpackage\\fileRead.txt"));
			word=keyboard.nextLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public byte[] encrypt(String input)
	{
		return null;
	}
	public String decrypt(byte[] input)
	{
		return "";
	}
	public String toString()
	{
		return word;
	}
	
}
