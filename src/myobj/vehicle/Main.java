package myobj.vehicle;

public class Main {

	public static void main(String[] args) {
		
		Car bmw = new Car();
		Car canival = new Car();
		bmw.name = "BMW";
		canival.name = "카니발";
		bmw.brand = "BMW";
		canival.brand = "KIA";
		bmw.size = "중형";
		canival.size = "대형";
		bmw.speed = 300;
		canival.speed = 200;
		bmw.price = 3000;
		canival.price = 2000;
		bmw.explain();
		canival.explain();
		
		Car[] kia_car = new Car[3];
		for (int i = 0; i < kia_car.length; i++) {
			kia_car[i] = new Car();
			kia_car[i].name = "기아차" + (i+1);
			kia_car[i].size = "소형";
			kia_car[i].speed = 100;
			kia_car[i].brand = "KIA";
			kia_car[i].price = 1000;
			kia_car[i].explain();
		}
		
		Car myCar = new Car(500, 100, "중형", "수제", "붕붕이");
		myCar.explain();
		
		System.out.print("카니발연비 -> ");
		canival.fuel_efficiency("KIA");
		System.out.print("BMW연비 -> ");
		bmw.fuel_efficiency("BMW");
		kia_car[1].fuel_efficiency("hyundae");
		
		
	}
}









