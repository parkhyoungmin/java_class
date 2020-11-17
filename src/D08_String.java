import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D08_String {

	public static void main(String[] args) {
		
		String str = "apple/banana/orange/sagwa";
		
		// split : ���ڿ��� �ش� ���� �������� �߶� ���ڿ� �迭�� ��ȯ�Ѵ�
		String[] fruits = str.split("/");
		System.out.println(Arrays.toString(fruits));
		
		// join : ������ ���ڸ� �̿��� ���ڿ� �迭�� ��ģ��
		System.out.println(String.join(",", fruits));;
		
		// replace : ��ġ�ϴ� ���ڿ��� ���ϴ� ���ڿ��� ��ü�Ѵ�
		str = "abc123@naver.com";
		str = str.replace("@naver.com", "@gmail.com");
		System.out.println(str);
		
		// replaceAll
		// - �ش� ����ǥ���İ� ��ġ�ϴ� ���ڿ���
		// ��� ���ϴ� ���ڿ��� ��ü�� ����� ��ȯ
		str = "My name is Bob. My name is sue. My name is John";
		System.out.println(str.replaceAll("is", "was"));
		
		// format : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�
		System.out.println(String.format("%d", 1));
		
		// contains : ���ڿ��� �ش� ���ڿ��� ���ԵǾ��ִ����� �˻��Ѵ�
		System.out.println(str.contains("bob"));
		System.out.println(str.toLowerCase().contains("bob"));
		
		// equalsIgnoreCase() : ��ҹ��ڿ� ������� ��ġ�ϴ��� �˻��Ѵ�
		System.out.println("Apple".equalsIgnoreCase("aPPLE"));
		
		// startWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�
		str = "image-fruit-apple.jpg";
		
		System.out.println("image-�� �����ϳ���?" + str.startsWith("image-"));
		
		// endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻��Ѵ�
		System.out.println(".jpg�� ��������?" + str.endsWith(".jpg"));
		
		// getBytes : ���ڿ��� byteŸ�� �迭�� �����Ѵ�
		str = "ABCDEFG";
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));
		
		str = "�ȳ��ϼ���";
		
		try {
			// ���ڿ��� �ڵ�ȭ �Ѵ� (���ڵ�)
			byte[] utf8_bytes = str.getBytes("UTF-8");
			byte[] euc_bytes = str.getBytes("EUC-KR");
			
			System.out.println(Arrays.toString(utf8_bytes));
			System.out.println(Arrays.toString(euc_bytes));
			
			// �ڵ���� ���ڿ��� ��ȯ�Ѵ� (���ڵ�)
			// - ���ڵ��Ҷ� ����ߴ� ������� ���ڵ����� ������ �ѱ��� ������
			System.out.println(new String(utf8_bytes, "UTF-8"));
			System.out.println(new String(utf8_bytes, "EUC-KR")); // �ѱ� ����
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("���������ʴ� ���ڵ��Դϴ�" + e.getMessage());
		}
		
		// getChars : char[]�� ���ڿ��� ���ϴ� �κ��� ����ش�
		str = "Hello java python c-lang!!";
		
		char[] buffer = new char[10];
		str.getChars(6, 16, buffer, 0); 
		//   6���� 16���� buffer�� 0������ �־� �޶�¶�
		System.out.println(buffer);
		
		// substring(begin, end) : ���ڿ��� ���ϴ� �κ��� ���ڿ��� ��ȯ�Ѵ�
		System.out.println(str.substring(10)); // begin�� ������ ������ �ڸ���
		System.out.println(str.substring(11, 17));
		
		// compareTo : Comparable �������̽� �޼���
		System.out.println("compare result: " + "car".compareTo("jet"));
		
		// trim : ���ڿ� �ٱ����� ������ �����Ѵ�
		str = "	good bye	";
		System.out.println(str);
		System.out.println(str.trim().length());
		
		// valueOf : �ٸ� Ÿ���� ���� ���ڿ��� ��ȯ�Ѵ�
		//			(�ش� ��ü�� toString����� ��ȯ�޴´�)
		String ott = String.valueOf(123);
		System.out.println(ott);
		
		// StringTokenizer
		// - ���ڿ��� �ڸ��µ��� Ưȭ�� Ŭ����
		// - split�� ���������� ������ �� �ִ�
		str = "99/88/77/66/55/44/33/22/11";
		
		// �ڸ� �� ����ߴ� ���ڿ��� �ʿ��ϴٸ� �� ��° �Ķ���͸� true�� Ȱ����
		StringTokenizer st = new StringTokenizer(str, "/");

		System.out.println("��ū ���� : " + st.countTokens());
		
		// Tokens�� StringŸ������ ��ȯ�Ѵ�
		// Elements�� ObjectŸ������ ��ȯ�Ѵ�
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// String ������
		
		
		
		
	}

}
















