package quiz;

public class B13_count_letter {

	public static void main(String[] args) {
		
		/*
		 사용자로부터 문장을 하나 입력받았다 치고
		 해당 문장에 어떤 알파벳이 몇번 등장했는디 세어서 출력해보세요
		 ※ 대소문자 구분 x
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
				System.out.printf("%c : %d번", i + 'a', count[i]);
			}
		}
		
		

	}
}



















