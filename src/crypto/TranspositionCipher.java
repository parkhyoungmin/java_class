package crypto;

import java.util.Arrays;

public class TranspositionCipher extends Cipher{

	/*
	 # ��ġ ��ȣ
	 - �޼����� key�� ��ŭ�� ���̷� ���� �� �ٸ� �������� �о ��ȣȭ�ϴ� ���
	 
	 ex)
	 plain : Common sense is not so common
	 key : 8
	 
	 0 1 2 3 4 5 6 7
	 ---------------
	 C o m m o n   s
	 e n s e   i s
	 n o t   s o   c
	 o m m o n .
	 
	 crypto : Cenoonommstmme oo snnio. s s c
	 */
	
	int key;
	
	public TranspositionCipher (int key) {
		this.key = key;
	}
	
	
	public String encryption(String plain) {
		StringBuilder[] builders = getBuilders(key);
		
		int len = plain.length();
		
		for (int i = 0; i < len; i++) {
			builders[i % key].append(plain.charAt(i));
		}
		return joinBuilders(builders);
	}
	
	
	public String decryption(String crypto) {
		int len = crypto.length();
		
		int columnsize = len % key > 0 ? len / key + 1 : len / key;
		int numOfBlanks = columnsize - len % key;
		int numOfFull = key - numOfBlanks;
		
		System.out.println("Xǥ ���� : " + numOfBlanks);
		System.out.println("���� �� ���� : " + numOfFull);
		
		StringBuilder[] builders = getBuilders(columnsize);
		
		for (int column = 0; column < columnsize; column++) {
			int crypto_index = column;
			
			// �� ���� �ݺ��� ������ FullLine�� ��� �÷���ŭ �ε��� ����
			// FullLine�� �ƴ� ��� �÷�-1��ŭ �ε��� ����
			for (int row = 0; row < key; row++) {
				builders[column].append(crypto.charAt(crypto_index));
				
				if (row < numOfFull) {
					crypto_index += columnsize;
				} else {
					crypto_index += columnsize-1;
				}
				// �߰��� �ε����� ������ �÷��̸鼭 ���ÿ� ������ fullline�� ���
				if (column == columnsize - 1 && row == numOfFull - 1) {
					break;
				} else if (crypto_index >= len) {
					break;
				}
			}
		}
		return joinBuilders(builders);
	}
	
	
	private String joinBuilders(StringBuilder[] builders) {
		StringBuilder result = new StringBuilder();
		
		for (StringBuilder builder : builders) {
			result.append(builder);
		}
		return result.toString();
	}
	
	
	private StringBuilder[] getBuilders(int columnSize) {
		StringBuilder[] builders = new StringBuilder[columnSize];
		
		// - �ӽ� ������ builder�� ���ο� �ν��Ͻ��� ����� �ִ� ���̱� ������
		// �߰�ȣ�� ����� �������
//		for (StringBuilder builder : builders) {
//			builder = new StringBuilders;
//		}
		for (int i = 0; i < builders.length; i++) {
			builders[i] = new StringBuilder();
		}
		return builders;
	}
	
	
	public static void main(String[] args) {
		String crypto = new TranspositionCipher(8)
				.encryption("Common sense is not so common");

		System.out.println(crypto);
		
		String plain = new TranspositionCipher(8)
				.decryption(crypto);
		
		System.out.println(plain);
	}
	
	
	
	
	
	
}












