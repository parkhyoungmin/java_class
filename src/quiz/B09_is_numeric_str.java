package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {

	public static void main(String[] args) {

		/*
		 �Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ ����� 1�� ����
		 �ٸ� ���ڰ� ���ԵǾ� �ִٸ� 0�� �����Ͽ� ���
		 
		 �� ��, ���ڿ��� ����������� ����� 2
		 */
			
			
		String str = new Scanner(System.in).nextLine();
		
		
		// # ���ڿ��� �̻��� ��� 3����
		// - null : str�� ����Ű�� �ּҰ� ���� ���
		// - str�� ���� ""�� ���
		// - str�� ���̰� 0�� ���
		
		int status= 1;
		
		if (str == null || str.equals("") || str.length() == 0) {
			status= 2;
		} else {
			for (int i = 0; i < str.length(); i ++) {
				
				char ch = str.charAt(i);
				
				if (ch > '0' || ch > '9') {
					status = 0;
					break;
				}
			}
		}
		System.out.println(status);
		
		
//		switch (status) {
//		case 0 :
//			break;
//		case 1 :
//			break;
//		case 2 :
//			break;
//		}
		
		
		
		
		
		
		
		
	}

}
















