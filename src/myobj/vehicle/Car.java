package myobj.vehicle;

public class Car {
	int speed;
	int price;
	String size;
	String brand;
	String name;
	
	void explain() {
		System.out.println("==========차종류==========");
		System.out.printf("자동차 이름: %s\n", this.name);
		System.out.printf("주행속도: %d\n", this.speed);
		System.out.printf("자동차 분류: %s\n", this.size);
		System.out.printf("자동차 브랜드: %s\n", this.brand);
		System.out.printf("자동차 가격: %d만원\n", this.price);
	}
	
	public void fuel_efficiency(String brand) {
		if (brand.equals("BMW")) {
			System.out.println("9.3km/ℓ");
		} else if (brand.equals("KIA")) {
			System.out.println("8.9km/ℓ");
		} else {
			System.out.println("없는 브랜드 입니다.");
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













