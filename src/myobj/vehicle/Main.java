package myobj.vehicle;

public class Main {

	public static void main(String[] args) {
		
		Car bmw = new Car();
		Car canival = new Car();
		bmw.name = "BMW";
		canival.name = "ī�Ϲ�";
		bmw.brand = "BMW";
		canival.brand = "KIA";
		bmw.size = "����";
		canival.size = "����";
		bmw.speed = 300;
		canival.speed = 200;
		bmw.price = 3000;
		canival.price = 2000;
		bmw.explain();
		canival.explain();
		
		Car[] kia_car = new Car[3];
		for (int i = 0; i < kia_car.length; i++) {
			kia_car[i] = new Car();
			kia_car[i].name = "�����" + (i+1);
			kia_car[i].size = "����";
			kia_car[i].speed = 100;
			kia_car[i].brand = "KIA";
			kia_car[i].price = 1000;
			kia_car[i].explain();
		}
		
		Car myCar = new Car(500, 100, "����", "����", "�غ���");
		myCar.explain();
		
		System.out.print("ī�Ϲ߿��� -> ");
		canival.fuel_efficiency("KIA");
		System.out.print("BMW���� -> ");
		bmw.fuel_efficiency("BMW");
		kia_car[1].fuel_efficiency("hyundae");
		
		
	}
}









