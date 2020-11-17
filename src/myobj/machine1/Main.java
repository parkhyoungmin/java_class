package myobj.machine1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Main���� �������̽��� �ҿ��� �ڵ带 �ۼ��Ѵٸ�
		// ����ϴ� Ŭ������ �ٸ� Ŭ������ �����ϰ� ��ü�� �� �ִ�
		ElectricSource infi_battery = new ElectricSource() {
			public void consum(int power) {
				System.out.printf("���͸����� %d��ŭ �Һ�\n", power);
			}
		};
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("���ڱ�� ����");
			
			String selected = sc.nextLine();
			
			Electronics e = null;
			if (selected.toLowerCase().equals("cleaner")) {
				e = new Cleaner();
			} else {
				e = new MicroWave("����", 80);
			}
			e.setConnect(infi_battery);
			e.execute();
		}
	}

	
	
	
}







