package mainpackage;

import java.util.Scanner;

public class SpeckCipher {
	public String word;
	
	public SpeckCipher()
	{
		Scanner keyboard= new Scanner
				("C:\\Users\\moebiusd5099\\Desktop\\DaneMoebiusProject\\DaneEclipseProject\\src\\mainpackage\\fileRead.txt");
		word=keyboard.nextLine();
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
