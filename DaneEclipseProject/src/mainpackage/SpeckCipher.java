package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.crypto.KeyGenerator;

public class SpeckCipher implements encryptable{
	private int[] plainText;
	private int wordcount=4;
	private int rounds=27;
	private byte[] key;
	int alpha = 8; 
	int beta = 3; 
	int x,y;
	int[] l = new int[2*rounds];
	int[] k = new int[rounds];
	public SpeckCipher()
	{
		Scanner keyboard;
		
		try {
			keyboard = new Scanner(new File("src\\mainpackage\\fileRead.txt"));
			
			
			/*for (int i = 0; i < nums.length; i++) 
	            {
	                nums[i] = keyboard.nextByte();
	                keyboard.nextLine();
	                i++;
	            }
		*/
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cannot Find File!");
		}
		
		plainText=new int[] {2,1,3,4,5,6,7,8};
		
		 x = boxing(plainText, 0, 1);
		    y = boxing(plainText, 1, 2);
	}
   
public void keyextension()
{
	for(int i = 0; i < rounds-1; i++) {
	    l[i+wordcount-1] = (k[i] + rotateRight(l[i], alpha)) ^ i;
	    k[i+1] = rotateLeft(k[i], beta) ^ l[i+wordcount-1];
	}
}
public static int boxing(int[] arr, int i, int j) {
    int temp[] = new int[j];
        temp[i] |= arr[i*4] & 0xff;
        temp[i] = temp[i] << 8 | arr[i*4+1] & 0xff;
        temp[i] = temp[i] << 8 | arr[i*4+2] & 0xff;
        temp[i] = temp[i] << 8 | arr[i*4+3] & 0xff;


    return temp[i];
}
	public static int rotateLeft(int number, int amount) {
		   return number << amount | number >>> (32-amount);
		}
	
	public static int rotateRight(int number, int amount) {
		   return number >>> amount | number << (32-amount);
		}
		
	public String encrypt()
	{
		
		for(int i = 0; i < rounds; i++) {
	        x = (rotateRight(x, alpha) + y) ^ k[i];
	        y = rotateLeft(y, beta) ^ x;
	    }
		return "Encrypt: " + x +" "+y;
	}
	public String decrypt()
	{
		
		for(int i = rounds-1; i >= 0; i--) {
	        y = rotateRight(x ^ y, beta);
	        x = rotateLeft((x ^ k[i]) - y, alpha);
	    }
		return "Decrypt: " + x +" "+y;
	}
	public String toString()
	{
		return Arrays.toString(plainText);
	}
	
}
