package myobj.fruit;

// RuntimeException�� ��ӹ��� ��ü�� ó������ �ʾƵ� �Ǵ� ���� ��ü�� �ȴ�
public class InvalidColorException extends RuntimeException{
	public InvalidColorException() {
		super("�̻��� ���� ����");
		
		// throw�� ����������,�ݵ�� ó���϶�� �������� �� ��
	}

}
