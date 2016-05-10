package mainpackage;

public interface encryptable {
	public byte[] encrypt(String input);
	
	public String decrypt(byte[] input);
}
