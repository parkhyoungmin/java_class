import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {

	/*
	 # ����ǥ���� (Regular Expression)
	 - ���ڿ��� ������ ǥ���ϴ� ǥ����
	 - �ش� ���ϰ� ��ġ�ϴ� ���ڿ��� �˻��� �� �ִ�
	 */
	
	/*
	 # Pattern Ŭ����
	 - ����ǥ������ �ٷ�� Ŭ����
	 */
	
	/*
	 # Matcher Ŭ����
	 - ������ �̿��Ͽ� ��� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
	 */
	
	public static void main(String[] args) {
		
//		String str = "abc@naver.com";
//		
//		if (str.contains("@") && str.contains(".")) {
//			System.out.println("�̸����Դϴ�");
//		} else {
//			System.out.println("�̸����� �ƴմϴ�. ���� �����ּ���");
//		}
		
		
		System.out.println(Pattern.matches("sleep", "sleep")); // ��,������ ��ġ����
		
		// [] : �ش� ��ġ�� �� Ŭ�ڿ� � ���ڵ��� �� �� �ִ��� �����Ѵ�
		System.out.println(Pattern.matches("s[hl]eep", "sleep"));
		System.out.println(Pattern.matches("s[hl]eep", "sheep"));
		System.out.println(Pattern.matches("s[a-cA-Z]eep", "sdeep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sdeep"));
		
		// []���ο� ������ �� �ִ� �͵�
		// 1. abc : abc�� ���
		// 2. ^abc : abc�� ������ ��θ� ���
		// 3. a-z : a���� z���� ���
		// 4. && : ������ -> ������ �����ȿ� �ִ°͸� ���
		
		// �� �������ڸ� �����ϰ� ǥ���ϴ� �͵�
		// 1. . : �ش� �ڸ��� ������ ��� ("s.eep","s$eep") - �� []�ۿ� ��� ��
		// 2. \d : �ش� �ڸ��� ���ڵ��� ���
		// 3. \D : �ش� �ڸ��� ���ڸ� ������ ������ ���
		// 4. \s : �ش� �ڸ��� ������ ��� [\t\n\r.. ���� ��� �����]
		// 5. \S : �ش� �ڸ��� ������ ������ ������ ���
		// 6. \w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9]
		// 7. \W : �Ϲ����� ���ڵ��� ������ ������ ���
		System.out.println(Pattern.matches("s\\deep", "s3eep"));
		System.out.println(Pattern.matches("s\\Deep", "s��eep"));
		System.out.println(Pattern.matches("s\\seep", "s\reep"));
		System.out.println(Pattern.matches("s\\Seep", "s eep"));
		
		// �� �ش� ������ ����� ������ ������ �����ϴ� ��� - �� ������ ����ߵ�
		// 1. Ex{n} : �տ� �ִ� ������ n���� ����ȴ�
		// 2. Ex{n,m} : �տ� �ִ� ������ �ּ� n���� �̻� �ִ� m���� ��ġ�ؾ� �Ѵ�
		// 3. Ex{n,} : n���� �̻� ��ġ�ؾ� �Ѵ�
		// 4. Ex? : �ѹ� Ȥ�� ����� �Ѵ�
		// 5. Ex+ : �ѹ� �̻� ���� �ؾ��Ѵ�
		// 6. Ex* : 0�� Ȥ�� ������
		System.out.println(Pattern.matches("....[\\d]{4}", "adjs1234"));
		System.out.println("��ȿ���̵� : " + Pattern.matches("[\\w��-�R]{2,12}", "����"));
		
		String email = "abc@naver.com";
		System.out.println("�̸��� ���� : " 
				+ Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email));
		
		/*
		  # Pattern.matches(regex, str)
		  - ������ ���ڿ��� ����ǥ���İ� ��ġ�ϸ� true
		 */
		
		/*
		 # Pattern.compile(regex)
		 - ������ ����ǥ������ �̿��� ������ �ν��Ͻ��� ��ȯ�Ѵ�
		 */
		Pattern split_regex = Pattern.compile("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+");
		
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// # ������ Pattern �ν��Ͻ��� matcher�����ϱ�
		
		// # java.util.regex.Matcher
		// - ���ڿ��� ó����ó ������ �˻��ϸ鼭
		//	�ش� ����ǥ���İ� ��ġ�ϴ� �ε����� ã�� ���
		
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		
		// find : ����ǥ������ ���� ã�� ���� ������ true
		while(matcher.find()) {
			System.out.println("ã�� �� : " + matcher.group());
			System.out.println(matcher.start() + " to " + matcher.end());
		}
		
		
		
		
		
	}

}
















