
public class B04_if {

	public static void main(String[] args) {
		
		// if ��
		// - ()���� ���� true�� �� {}���� ������ �����Ѵ�
		// - ()���� ���� false�� �� {}���� ������ �����Ѵ�
		// - {}�ȿ� �� ������ �� ���̶�� {}�� ������ �� �ִ�
		
		// else if��
		// - ���� if���� ������� �ʾҴٸ� if��ó�� �����Ѵ�
		// - else if�� �ܵ����� ����� �� ����
		// - else if�� ���� �� ��ø�ؼ� ����� �� �ִ�
		
		// else��
		// - ���� if, else if�� ��� �ƴ϶�� {}���� ������ ������ �����Ѵ�
		// - else���� �ִ� �������� �ݵ�� �ѹ� ����ȴ�
		
		char lastName = '��';
		
		String result;
		
		if (lastName == '��') {
			result = "�达�Դϴ�";
		} else {
			result = "������";
		}
		
		System.out.println(result);
		
//		if (lastName == '��') { // {} ���ο��� ������ ������ �߰�ȣ�� ����� �״´�
//			String result = "�达�Դϴ�";
//		}
//		System.out.println(result);
		
//		String result = "�߰�ȣ�ذ�"; // ������ �߰�ȣ �ۿ��� �Ѵ�
//		if (lastName == '��') {
//			System.out.println(result);
//		}
		
		
		int num = 9999;
		
		if (num > 10000)
			System.out.println("num�� 10000���� Ů�ϴ�.");
		else if (num > 1000)
			System.out.println("num�� 1000���� Ů�ϴ�.");
		
		
		
		
		
		
		
		
		
	}
		
		

}




















