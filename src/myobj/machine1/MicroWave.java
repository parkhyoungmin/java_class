package myobj.machine1;

public class MicroWave implements Electronics {
	
	ElectricSource src;
	
	String name;
	int power;

	public MicroWave(String name, int power) {}
	
	@Override
	public void setConnect(ElectricSource src) {
		this.src = src;
	}

	@Override
	public String execute() {
		
		if (src == null) {
			System.out.println("���� ������� �ʾ���");
		}
		
		cook();
		
		return "�丮��";
	}
	
	private void cook() {
		// microwave�� �丮�ҋ����� ����� ���¿��� ������ �Һ���
		src.consum(power);
	}

	
	
}









