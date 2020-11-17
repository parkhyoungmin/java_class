
public class C03_constructer {
		
		// # Ŭ������ ������ (Constructor)
		
		// - Ŭ������ �̸��� �Ȱ��� �̸��� �Լ� (new�� �Բ� ����Ѵ�)
		// - new�� �Բ� �����ڸ� ȣ���ϸ� Ŭ������ ���ǵȴ�� �ν��Ͻ��� �����Ѵ�
		// - �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ� ��ȯ�ȴ�
		// - �����ڸ� ���� �������� ������ �ƹ��͵� ���ǵ��� ���� �⺻�����ڰ� �ڵ����� �����ȴ�
		
		// �� �⺻ ������ - �Ű������� ���� ������
	public static void main(String[] args) {
		Orange o1 = new Orange();
		Orange o2 = new Orange(5, 5, "green");
		
		System.out.println(o1.color);
		System.out.println(o1.size);
		System.out.println(o1.sweet);
		
		System.out.println(o2.color);
		
		Strawberry s1 = new Strawberry();
		
		Grape g1 = new Grape();
		
		for (int i = 0; i < 20; i++) {
			g1.eat();
		}
		
		// �Ʊ� ������ Ŭ������ �����ڸ� 2���� �߰��غ�����
		// mtobj.fruit mtobj.vehicle
	}
}

// ���ǵ� �����ڰ� �ִٸ� �⺻ �����ڰ� �ڵ����� �������� �ʴ´�
class Grape {
	int podo;
	int skin;
	
	public Grape(int podo) {
		this.podo = podo;
		this.skin = 0;
	}
	
	// �ڵ����� �������� �����Ƿ�, �⺻ �����ڸ� ����ϰ� �ʹٸ� ���� �����ؾ� �Ѵ�
	public Grape() {
		this(20); 
		
		System.out.println("�⺻ �����ڷ� ���ƿԽ��ϴ�");
		// �����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�
		// �ٸ� �����ڴ� �ݵ�� ������ �� ���ٿ��� ȣ���ؾ� �Ѵ�
	}
	
	public void eat() {
		if (podo == 0) {
			System.out.println("���� ����");
			System.out.printf("���� %d��, ���� %d��\n", podo, skin);
			return;
		}
		podo--;
		skin++;
		System.out.printf("���� %d��, ���� %d��\n", podo, skin);
	}
}

// �����ڸ� �������� ���ٸ� ������ �⺻ �����ڰ� �����Ѵ�
class Strawberry {
	int seed;
	String color;
}

class Orange {
	
	int size;
	int sweet;
	String color;
	
	// # �������� Ư¡
	// - �ν��Ͻ� �����ÿ� ���� ���� ȣ��ȴ�
	// - �ַ� �ν��Ͻ� ���� ���� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�
	public Orange() { // �ڵ����� ������ ���� - Ŭ������ �Ȱ��� �̸��� �Լ�
		// ���ÿ��� Ŭ���� ���ο��� this�� �����ص� �ʵ忡 ������ ���ִ�
		sweet = 10;
		size = 5;
		color = "orange";
	}
	
	// # �����ڵ� �Լ�ó�� �����ε��� �����ϴ�
	// - �ϳ��� Ŭ������ �پ��� ������ �����ڸ� ������ ���� �� �ִ�
	public Orange(int sweet, int size, String color) {
		// # this
		// - Ŭ���� ���ο��� ���� �ν��Ͻ� ������ �� ����ϴ� Ű����
		
		// �ʵ尪�� ������������ ��ġ�� ���
		// this�� �̿��� ����� �������� ��Ȯ�ϰ� ������ �� �ִ�
		
		// �� this�� ���� ���� �ν��Ͻ� ������ �ȴ�
		this.sweet = sweet;
		this.size = size;
		this.color = color;
	}
}

// �� �ν��Ͻ� �޼��带 ���� ���� static�� ���� �Ѵ�
// static �޼���� �ν��Ͻ� ������ Ȱ���Ҽ�����













