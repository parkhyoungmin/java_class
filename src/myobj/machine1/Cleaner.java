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
		System.out.println("û�ұ⸦ 1ȸ ���");
		src.consum(power);
		
		return "û�� �Ϸ�";
	}

}









