package mainpackage;

import java.util.Scanner;

public class SpeckCipher {
	public String word;
	
	public SpeckCipher(String input)
	{
		Scanner keyboard= new Scanner("fileRead.txt");
		word=keyboard.next();
	}
	public byte encrypt(String input)
	{
		return 44;
	}
	public String decrypt(byte input)
	{
		return word;
	}
}
