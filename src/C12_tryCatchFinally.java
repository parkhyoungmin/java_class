
public class C12_tryCatchFinally {

	/*
	 # ���� ó��
	 - �츮�� ������� �˰��ִ� ���� �۾����� ����(Exception)��� �θ���
	 - ���������� Ʋ������ ���ܰ� �ƴ϶� �����̴�
	 - ���α׷��Ӱ� ���ܿ� ���� ������ ��ġ�� �����شٸ�
	 ���α׷��� ������������ �ʰ� ����ؼ� �����ϰ� �ȴ�
	 */
	
	/*
	 # try
	 - ���ܰ� �߻��� �� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��
	 - ���ܰ� �߻����� ������ ��� ���� ����ȴ�
	 - ���ܰ� �߻��Ѵٸ� �ش� ���ܸ� �޴� catch������ �Ѿ�� �ȴ�
	 - catch���� �������� ����� �� �ִ�
	 */
	
	/*
	 # catch
	 - try�� ������ �ڵ忡�� ���ܰ� �߻��ϸ� �ش� catch������ �̵��Ѵ�
	 - ù��° �Ű������� �ش� ���ܿ� ���� ������ ����ִ� ��ü�� �޴´�
	 - catch���� ��ø ����� �����ϴ�
	 - ExceptionŸ���� catch���� ��� ���ܸ� catch�� �� �ִ�
	 �� Exception : ��� ������ �θ�Ÿ��
	 */
	
	/*
	 # finally
	 - try�� ������ ���� �߻� ���ο� ������� ������ ����Ǵ� ����
	 */
	
	
	public static void main(String[] args) {
		int[] abc = new int[10];
		
		try {
			System.out.println("try���� ����");
			
			System.out.println(abc[10]); // ���� �߻� �ڵ�
			
			// Integer.parseInt(str) : ���ڿ��� intŸ���� ������ ��ȯ�ϴ� �ż���
			System.out.println(Integer.parseInt("123")); // ���� �߻� �ڵ� 2
			
			System.out.printf("%d\n", 123);
			
			System.out.println("try���� ������");
		} catch (Exception e) {
			System.out.println("catch : " + e.getMessage());
		} finally {
			System.out.println("������ ���");
		}
		
		
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("�ε��� ���� : catch�� ����");
//		} catch (NumberFormatException e) {
//			System.out.println("���ڰ� �ƴ� : catch�� ����");
//		} catch (IllegalCharsetNameException e) {
//			// catch���� ù ��° �Ű������� ���� ���� ��ü�� ���޵ȴ�
//			System.out.println("catch�� ���� : " + e.getMessage());
//			
////			e.printStackTrace(); // ���� �߻��� �⺻�����̾��� ��
////			System.exit(0);
//		}
		
		System.out.println("������� �� ����Ǿ����ϴ�");
	}
	
	
}













