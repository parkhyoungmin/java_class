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
			System.out.println("아직 연결되지 않았음");
		}
		
		cook();
		
		return "요리함";
	}
	
	private void cook() {
		// microwave는 요리할떄마다 연결된 전력원의 전력을 소비함
		src.consum(power);
	}

	
	
}









