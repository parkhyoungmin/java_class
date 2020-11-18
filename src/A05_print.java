
public class A05_print {

	public static void main(String[] args) {
		 
		// # �ֿܼ� ����ϱ� ���� �������� �Լ���
		
		// 1. print()
		// - ���� �ڵ����� �ٲ��� ������ ����ϴ� �Լ�
		System.out.print("Hello, World!");
		System.out.print("Hello, World!");
		System.out.print("Hello, World!\n");
		
		// 2. println()
		// - ���� �ڵ����� �ٲٸ� ����ϴ� �Լ�
		// - ()�� ������ ������ �� �ڿ� '\n'�� �߰��Ͽ� ����Ѵ�  
		// - ()�� �ƹ��͵� �������� ������ '\n'�� ����Ѵ�
		System.out.println("Print, World!");
		System.out.println("");
		System.out.println("Hello, World!"); 
		
		// 3. printf()
		// - ���� ���ڸ� �̿��� ����� �� �ִ� �Լ�
		// - ������ �̿��ϴ°� ���� ��찡 ����
		// - ���� �ڵ����� �ٲ����� �ʴ´�
		
		// 2020�� 10�� 20�� ���
		int year = 2020;
		int month = 10;
		int day = 20;
		System.out.printf("%d�� %d�� %d��\n", year, month, day);
		
		// # printf�� ����ϴ� ���� ���ڵ�
		/*
		 %d		: 10���� ���� (decimal)
		 %x, X	: 16���� ���� (hexa decimal)
		 %o		: 8���� ���� (octal)
		 %s		: ���ڿ� (String)
		 %c		: ���� (Character)
		 %f		: �Ǽ�
		 */
		System.out.printf("%x%x%x\n", 10, 11, 12);
		System.out.printf("%s\n", "1���");
		System.out.printf("%d[%c], %x(16), %o(8)\n", 65, 'A', 65, 65);
		
		// # ���Ĺ��� �ɼ�
		// �� d�� �־�� �ϴ� ���� �ƴ�
		
		// %����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ �����Ͽ� ����Ѵ�
		System.out.printf("�̸�: %10s\n", "ȫ�浿");
		System.out.printf("����: %10d\n", 15);
		
		// �ʹ� ��� ��ģ��
		System.out.printf("�̸�: %10s\n", "����������������������������");
		
		// %-����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ���� �����Ͽ� ����Ѵ�
		System.out.printf("%-10s : HonGilDon\n", "Full name");
		System.out.printf("%-10s : 15\n", "Age");
		
		// %0����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ��ĭ�� 0�� ä�� ����Ѵ�
		System.out.printf("%010d\n", 123);
		System.out.printf("%020f\n", 123.123);
		
		// % + ����d : ��� �տ��� ��ȣ�� ���̰� �ȴ�
		System.out.printf("������ ���� '%+d��'�Դϴ�.\n", -5);
		System.out.printf("������ ���� '%+d��'�Դϴ�.\n", 20);
		
		// %.����f : �Ҽ� �ڸ����� �����Ѵ�
		System.out.printf(".3\t: %.3f\n", 123.123);
		System.out.printf("default\t: %f\n", 123.123);
		System.out.printf(".10\t: %.10f\n", 123.123);
		System.out.printf(".20\t: %.20f\n", 123.123);
		System.out.printf(".255\t: %.255f\n", 123.123);
		
	}

}



















