package quiz;

public class B13_count_letter {

	public static void main(String[] args) {
		
		/*
		 ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
		 �ش� ���忡 � ���ĺ��� ��� �����ߴµ� ��� ����غ�����
		 �� ��ҹ��� ���� x
		 */
		
		String msg = "Hello, World!";
		msg = msg.toLowerCase();
		
		int[] count = new int[26]; 
		
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				count[ch - 'a'] += 1;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.printf("%c : %d��", i + 'a', count[i]);
			}
		}
		
		

	}
}



















