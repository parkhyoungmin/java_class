package quiz;

import java.util.Scanner;

public class B05_CheckWord {

	public static void main(String[] args) {
		
		/*
		 ����ڷκ��� �ܾ �ϳ� �Է¹ް�
		 ù ��° �ܾ�� ������ �ܾ ��ġ�ϸ� "OK"�� ���
		 �ƴ϶�� "NOT OK"�� ����غ�����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ �Է��ϼ��� >");
		String num = sc.nextLine();
		
		//null : �ƹ��͵� ���� ����
		if (num == null || num == "") {
			System.out.println("�ܾ �ùٸ��� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("�Է��� �ܾ� : " + num);
		
		
		
		char front = num.charAt(0);
		
		char end = num.charAt(num.length() - 1);
		
		if (front == end) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
		
		
		
		
	}

}













