
public class A01_Escape {

	public static void main(String[] args) {
		
		// # Escape ����
		// - Ư���� ����� ���� ����
		// - �׳� ����Ϸ��� �ϸ� ������ ����� ���ڵ�
		// - �տ� \(��������)�� ���� ���ڴ� Escape ���ڷ� �����Ѵ�
		// - �� ���ڰ� ���ļ� �ϳ��� ���ڷ� �νĵȴ�
		
		// \n : �ٹٲ��� ����� ���� Ư�� ���� (linebreak, linefeed, newline ..)
		System.out.println("�ȳ��ϼ���,\n�ݰ����ϴ�.");
		
		// \t : TabŰ�� ����� ���� Ư�� ����
		System.out.println("�ȳ��ϼ���!\t�ݰ����ϴ�.");
		System.out.println("�̸�\t����\t����");
		System.out.println("��ö��\t34\t��");
		System.out.println("�迵��\t43\t��");

		// \\ : �׳� �������ø� ����ϰ� ���� �� ����Ѵ�
		// ex> C:\Program Files\Java\jdk�� ����ϰ� ���� ���
		System.out.println("C:\\Program Files\\Java\\jdk");
		
		// \" : �׳� ū����ǥ�� ����ϰ� ���� �� ����Ѵ�
		// ex> ������ "�п�"���� �Դ´�
		System.out.println("������ \"�п�\"���� �Դ´�");
		
		// \' : �׳� ��������ǥ�� ����ϰ� ���� �� ����Ѵ�
		// ex> ������ '�п�'���� ������
		System.out.println("������ \'�п�\'���� ������");
		System.out.println('\'');
		
	}

}
