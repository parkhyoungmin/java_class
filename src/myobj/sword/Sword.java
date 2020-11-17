package myobj.sword;

public class Sword {

	// �ʵ� 
	//	- ���ݷ�
	//	- ���� ��ȭ ���
	//	- ������ ��ȭ Ȯ�� (��޸��� ��ȭ Ȯ���� �ٸ�)
	//	- ������ ���ݷ� ������
	int attack;
	int grade;
	int upgrade_price;
	
	boolean destroyed;
	
	int[] upgrade_table; // ��ȭ ���� Ȯ�� ���̺�
	double[] amp_table;  // ������ ���ݷ� ������ ���̺�
	
	final int MAX_GRADE; 
	
	public Sword(int attack) {
		this.attack = attack;
		this.upgrade_price = attack * 500;		
		this.grade = 0;	
		this.destroyed = false;
		this.upgrade_table = new int[] {
				100, 90, 90, 70, 60, 30, 
				20, 10, 5, 3, 2, 1
		};
		this.amp_table = new double[] {
				1.0, 1.02, 1.1, 1.15, 1.2, 1.25,
				1.5, 2.0, 3, 4, 5, 10
		};
		
		MAX_GRADE = upgrade_table.length;
	}
	
	public Sword() {
		this(10);
	}
	
	// �޼���
	//	- ��ȭ�ϱ� (�������� ���� ���� ���а� �����)
	//	  �� �ִ� ��ȭ �������� �����ϱ� ���� �ɸ� ��ȭ Ƚ���� ����غ���
	//	- ���� (��󿡰� ���ݷ� ��ŭ�� �������� ����) 
	//	  �� ������ ����� �Ǵ� ��ü�� HP�� �־�� �Ѵ�
	
	// �� �ν��Ͻ� �޼��带 ���� ���� static�� ���� �Ѵ�
	//	 static �޼���� �ν��Ͻ� ������ Ȱ���� �� ����
	public boolean upgrade_weapon() {
		int ran = (int)(Math.random() * 100 + 1);		
		
		if (ran <= upgrade_table[grade]) {
			// ��ȭ ����
			grade += 1;
			System.out.printf("��ȭ�� �����ϼ̽��ϴ�!! (%+d)\n", grade);
			
			return true;
		} else {
			// ��ȭ ����			
			if (grade >= 10) {
				// 10�� �̻��� ��� ���н� 50% Ȯ���� �ı� 
				ran = (int)(Math.random() * 2);
				
				if (ran == 0) {
					System.err.println("���Ⱑ �ı��Ǿ����ϴ�");
					destroyed = true;
				} else {
					System.err.printf("��ȭ �ܰ谡 �϶��߽��ϴ� (%+d)\n", grade);
					grade -= 1;
				}
			}					
			
			return false;
		}
	}
	
	// ���� Į�� �������� ����Ͽ� ��ȯ�Ѵ�
	public int damage() {
		return (int)(Math.ceil(attack * amp_table[grade]));
	}
	
	
	public static void main(String[] args) {
		Sword basic_sword = new Sword();
		
		System.out.println(basic_sword.attack);
		System.out.println(basic_sword.upgrade_price);
		
		int count = 0;
		while (basic_sword.grade != basic_sword.MAX_GRADE) {
			basic_sword.upgrade_weapon();
			count += 1;
			
			if (basic_sword.destroyed) {
				basic_sword = new Sword();
			}
		}
		System.out.println("�õ�Ƚ�� : " + count);
	}
}







