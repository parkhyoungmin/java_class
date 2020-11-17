package myobj.machine1;

public class Cleaner implements Electronics{

	ElectricSource src;
	int power;
	
	public Cleaner() {}
	
	@Override
	public void setConnect(ElectricSource src) {
		this.src = src;
	}

	@Override
	public String execute() {
		System.out.println("청소기를 1회 사용");
		src.consum(power);
		
		return "청소 완료";
	}

}









