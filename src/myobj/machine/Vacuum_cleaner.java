package myobj.machine;

public class Vacuum_cleaner implements Electronics{

	@Override
	public void charging_time() {
		System.out.println("충전시간 3시간");
	}
	
	@Override
	public void support(int min) {
		if (min >= 180) {
			System.out.println("100% 충전완료");
		} else {
			System.out.printf("%d % 충전\n", ((180 / 100) * min));
		}
	}

	@Override
	public void use(int min) {
		System.out.println("소비전력: 48W");
		System.out.printf("현재 소비전력: %dw\n", 40*min);
	}

	@Override
	public void electricity_fee() {
		System.out.println("한달 전기세 약 3만원");
	}

}
