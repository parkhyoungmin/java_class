package crypto;

import java.util.Arrays;

public class TranspositionCipher extends Cipher{

	/*
	 # 전치 암호
	 - 메세지를 key값 만큼의 길이로 나눈 뒤 다른 방향으로 읽어서 암호화하는 방식
	 
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
		
		System.out.println("X표 개수 : " + numOfBlanks);
		System.out.println("꽉찬 줄 개수 : " + numOfFull);
		
		StringBuilder[] builders = getBuilders(columnsize);
		
		for (int column = 0; column < columnsize; column++) {
			int crypto_index = column;
			
			// 한 줄이 반복될 때마다 FullLine인 경우 컬럼만큼 인덱스 증가
			// FullLine이 아닌 경우 컬럼-1만큼 인덱스 증가
			for (int row = 0; row < key; row++) {
				builders[column].append(crypto.charAt(crypto_index));
				
				if (row < numOfFull) {
					crypto_index += columnsize;
				} else {
					crypto_index += columnsize-1;
				}
				// 추가한 인덱스가 마지막 컬럼이면서 동시에 마지막 fullline인 경우
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
		
		// - 임시 변수인 builder에 새로운 인스턴스를 만들어 넣는 것이기 때문에
		// 중괄호를 벗어나면 사라진다
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












