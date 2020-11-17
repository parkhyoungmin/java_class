
public class C04_static {

	/*
	 # static (���� ����, Ŭ���� ���� <=> �ν��Ͻ� ����)
	 - ���� ũ������ ��� �ν��Ͻ��� �������� ����ϴ� ����
	 - static������ Ŭ���� �� �ϳ��̱� ������
	 	Ŭ���� �̸��� .�� ��� ����ϴ� ���� ����ȴ�
	 	(�ν��Ͻ��� .����� ����ص� ������ �� ���� ���� ���� ������)
	 - static ������ �ڿ��� �ν��Ͻ��� ����� ������ ȣ���� �� �ִ�
	 - �ν��Ͻ��� �������� ���� ���� static�� ���� ���ɼ��� �ֱ� ������
	 	static �޼��忡���� instance�ڿ��� ����� �� ����
	 	(�ν��Ͻ����� ����ƽ������ ������ ����Ѵ�)
	 */
	
	public static void main(String[] args) {
		
//		System.out.println(Card.width);
//		System.out.println(Card.height);
		
		Card s1 = new Card("Spade", 1); // ����ƽ -> �ν��Ͻ� -> constructor
		Card s2 = new Card("Spade", 2); // ����ƽ ���� ó�� �Ҹ��� �����Ŀ��� �� �Ҹ�
		
//		Card s1 = new Card("Spade", 1);
//		Card s2 = new Card("Spade", 2);
//		Card s3 = new Card("Spade", 3);
//		Card s4 = new Card("Spade", 4);
//		Card s5 = new Card("Spade", 5);
//		
//		Card.width = 333;
//		System.out.println(Card.width);
//		System.out.println(s1.width);
//		System.out.println(s2.width);
//		System.out.println(s3.width);
		
		// myobj ��Ű�� ���ο� static ������ �޼��带 ����
		// Ŭ������ �ϳ� ���� �غ�����
		// (������/����ǥ�� ����, width/height ����)

	}
}


class Card {
	// �� ī�帶�� �ٸ� ���� ������ �־���ϴ� ���� (�ν��Ͻ�)
	// -> �ν��Ͻ� ������ ����ϱ⿡ ������
	String shape;
	int number;
	
	// ī���� ũ��� ��� ī�忡�� �ݵ�� ���ƾ� �Ѵ�
	// -> �ν��Ͻ� ������ ����ϸ� ������ �Ʊ��� -> ���� ������ ���
	static int width;
	static int height;
	
	// static block���� �ʱ�ȭ�� �����ϴ� ���� ����
	static {
		width = 100;
		height= 200;
		System.out.println("static block called");
	}
	
	{
		System.out.println("instance block called");
	}
	
	public Card(String shape, int number) {
		this.shape = shape;
		this.number = number;
		
		System.out.println("constructor block called");
		
		// �����ڿ��� static�� �ʱ�ȭ �ϴ� ���
		// �ʱ�ȭ ���� ���� static �ʵ带 ����� ������ �ִ�
//		width = 100; x
//		height = 200; x
	}
	
	// static method 
//	   - �Ű������� ����ϰų� static ������ ��밡��
//	   - �ν��Ͻ��� �����ϰ� �׻� ������ ����� ������ �� ����Ѵ�
	public static void changeCardSize(int width, int height) {
		// static �޼��忡���� this�� �������� �ʴ´�
		// (���� �ν��Ͻ��� �������� �ʾ��� ���� �����Ƿ�)
		Card.width = width;
		Card.height = height;
	}
	
	public static int[] getCardSize() {
		return new int[] { width, height };
	}
}


class Coffee {
	int from; // �������� ��ȣ�� ǥ���ϱ�� ��
	
	// ������ ��ȣ�� ��� Ŀ�ǵ��� ���� ��ȣ�� ����ؾ� ��
	// -> ���� ������ ����ϴ� ���� �ո����̴�
	final static int SOUTH_KOREA = 0;
	final static int COLUMNBIA = 1;
	final static int BRAZIL = 2;
}














