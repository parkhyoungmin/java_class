package myobj.machine;

public interface Electronics {
	
	/*
	 ���� ��� �������̽�
	 
	 1. ��� ���ڱ��� ���� ������ ���� �� �ִ�
	 2. ��� ���ڱ��� �ֿܼ� �ѹ� ����� ������
	 ���� �Һ񷮸�ŭ�� ������ �Һ��Ѵ�
	 3. ��� ���ڱ��� �����ϰ� �ִ� ������ �ֿܼ� ����Ѵ�
	 
	 �� ���߿� ������ ���� �ʿ��� ������ �ޱ����� �޼������ �����Ѵ�
	 */
	
	void charging_time();
	
	void support(int min);	// ���� ����
	
	void use(int min); // �Һ�
	
	void electricity_fee();	// ���⼼
	
}












