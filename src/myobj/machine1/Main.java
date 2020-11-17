package myobj.machine1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Main에서 인터페이스만 할용한 코드를 작성한다면
		// 사용하는 클래스를 다른 클래스를 간단하게 교체할 수 있다
		ElectricSource infi_battery = new ElectricSource() {
			public void consum(int power) {
				System.out.printf("배터리에서 %d만큼 소비\n", power);
			}
		};
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("전자기기 선택");
			
			String selected = sc.nextLine();
			
			Electronics e = null;
			if (selected.toLowerCase().equals("cleaner")) {
				e = new Cleaner();
			} else {
				e = new MicroWave("샘성", 80);
			}
			e.setConnect(infi_battery);
			e.execute();
		}
	}

	
	
	
}







