package crypto;

public class CaesarHacker {
	
	/*
	 ��ȣ���� charset�� �˰����� ������ȣ ������� �˰��ִٰ� ������ ���·�
	 ��ȣ���� �̿��Ͽ� ���� �����غ�����
	 */
	
	// �� ��ȣ�� �������� ���ҋ� ���� 3������ ��� �����ڰ� �˰��ִٰ� �����Ѵ�
	int key; 
	static char[] charset = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuvwxyz").toCharArray();
	static String hijacked = "uryyBmhJBEyqi";
	
	public static void main(String[] args) {
		// ��� key���� �����غ��� ���� ���� ������ ���ִ�
		for (int key = 0; key < charset.length; key++) {
			Caesar cipher = new Caesar(key);
			System.out.println(cipher.decryption(hijacked));
		}
	}
	
	
}















