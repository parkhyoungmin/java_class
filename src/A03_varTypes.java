
public class A03_varTypes {

	public static void main(String[] args) {
		// # ������ ����
		// - Ÿ�� 
	
		/*
		 # ����Ÿ�� (''���� Ÿ�� ���� ���� ����� �޴´�)
		 # Ÿ�Ը��� �����͸� ������ �� �ִ� ũ�Ⱑ �ٸ���
		 - byte		(1byte) -128 	~ +127
		 - char		(2byte)	0	 	~ +65535 (65536��, ���ڿ� ����ȭ)
		 - short	(2byte) -32768	~ +32767 (65536��)
		 - int		(4byte)	-22��	~ +22��  (2^32��)
		 - long		(8byte)	��û ū ����
		 */
		
		byte _byte = 127;// ǥ���� �� �ִ� ���ڰ� ���� ��� ������ ������ �� �ִ�
		char _char = 10;
		short _short = 10;
		int _int = 10;
		// int�� ������ ����� ���ڸ� ���� �� �ڿ� L�� �ٿ��� �Ѵ�
		long _long = 900000000000L; 
		
		/*
		 # �Ǽ� Ÿ�� 
		 
		 - float	(4byte)
		 - double	(8byte)
		 */
		
		float _float = 123.123F; // float���� ���� �� �ڿ� f/F�� �ٿ��� �Ѵ�
		double _double = 123.123;
		
		// # ���ͷ�(literal)
		// - �׳� ���� ��
		// - "", '', �Ҽ�, �Ҽ�f, ����, ����L ...
		// - 0����(8), 0x����(16), 0b����(2)
		// - true, false
		System.out.println("111(10) : " + 111);
		System.out.println("111(8) : " + 0111);
		
		// 2���� : 0	1 10 11 100 101 110 ...
		// 8���� : 1 2 3 4 5 6 7 10 ... 16 17 20..
		//16���� : 0 1 2 3...9 A B C D E F 10
		
		System.out.println("111(16) : " + 0x111);

		/*
		 # ��/���� Ÿ��
		 - boolean : true, false �� ������ ���� ������ �� �ִ� ���� Ÿ��
		 */
		boolean _boolean = false;
		boolean goonpil = false;
		boolean passExam = true;
		boolean complete = true;
		
		/*
		 	# ������ Ÿ�� (Ŭ���� Ÿ��)
		 	- String : ���ڿ�
		 	- �� �� ��� Ŭ������..
		 	�� �빮�ڷ� �����ϴ� ��� Ÿ�Ե��� ������ Ÿ���̴�.
		 */
		String hiMsg = "Hi, nice to meet you!";
		String byeMsg = "Good bye";
		
		System.out.println(hiMsg);
		System.out.println(byeMsg + byeMsg + byeMsg);
		
	}

}










