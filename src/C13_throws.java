
public class C13_throws {

	/*
	 # throws
	 - ���� �޼��忡�� �߻��ϴ� ������ ó���� �޼��带 ȣ���� ������ �̷��
	 - �޼��� �ڿ� �߻��� ������ �ִ� ���ܸ� �Բ� �����Ѵ�
	 - �ش� �޼��带 ȣ���ϴ� ���� ��� ���� �� �ִ�
	 
	 # throw
	 - ���ϴ� ���ܸ� �߻���Ų��
	 
	 # Exception Ŭ������ ��ӹ�����
	 "�ݵ�� ó���ؾ� �ϴ� ���� ��ü"�� �ȴ�
	 
	 # RuntimeException�� ��ӹ��� ��ü��
	 �ݵ�� ó������ �ʾƵ� �Ǵ� ���� ��ü�� �ȴ�
	 */
	
	public static void stupid_method1() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		
		int a = 1;
		
		if (a == 1) {
			throw new ArithmeticException("�׳� �߻���");
		} else if (a == 2) {
			throw new java.util.EmptyStackException();
		}
		
		stupid_method1();
		
	}
	
	
}





















