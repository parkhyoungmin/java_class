package myobj.machine;

public class Laptop implements Electronics{

	@Override
	public void charging_time() {
		System.out.println("�����ð� 4�ð�");
	}

	@Override
	public void support(int min) {
		if (min >= 240) {
			System.out.println("100% �����Ϸ�");
		} else {
			System.out.printf("%d % ����\n", ((180 / 100) * min));
		}
	}

	@Override
	public void use(int min) {
		System.out.println("�Һ�����: 48W");
		System.out.printf("���� �Һ�����: %dw\n", 40*min);
	}

	@Override
	public void electricity_fee() {
		System.out.println("�Ѵ� ���⼼ �� 5õ��");
	}



}
