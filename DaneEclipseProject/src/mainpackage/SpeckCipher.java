package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpeckCipher {
	public String word;
	
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
	public byte encrypt(String input)
	{
		return 44;
	}
	public String decrypt(byte input)
	{
		return "";
	}
	public String toString()
	{
		return word;
	}
}
