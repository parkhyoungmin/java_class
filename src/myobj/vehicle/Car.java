package myobj.vehicle;

public class Car {
	int speed;
	int price;
	String size;
	String brand;
	String name;
	
	void explain() {
		System.out.println("==========������==========");
		System.out.printf("�ڵ��� �̸�: %s\n", this.name);
		System.out.printf("����ӵ�: %d\n", this.speed);
		System.out.printf("�ڵ��� �з�: %s\n", this.size);
		System.out.printf("�ڵ��� �귣��: %s\n", this.brand);
		System.out.printf("�ڵ��� ����: %d����\n", this.price);
	}
	
	public void fuel_efficiency(String brand) {
		if (brand.equals("BMW")) {
			System.out.println("9.3km/��");
		} else if (brand.equals("KIA")) {
			System.out.println("8.9km/��");
		} else {
			System.out.println("���� �귣�� �Դϴ�.");
		}
	}
	
	public Car(int price, int speed, String size, String brand, String name) {
		this.price = price;
		this.speed = speed;
		this.size = size;
		this.brand = brand;
		this.name = name;
	}
	
	public Car() {
		
	}
	
	
}













