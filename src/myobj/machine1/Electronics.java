package myobj.machine1;

public interface Electronics {
	
	/*
	 ���� ��� �������̽�
	 
	 1. ��� ���ڱ��� ���� ������ ���� �� �ִ�
	 2. ��� ���ڱ��� �ֿܼ� �ѹ� ����� ������
	 ���� �Һ񷮸�ŭ�� ������ �Һ��Ѵ�
	 3. ��� ���ڱ��� �����ϰ� �ִ� ������ �ֿܼ� ����Ѵ�
	 
	 �� ���߿� ������ ���� �ʿ��� ������ �ޱ����� �޼������ �����Ѵ�
	 */
	
	void setConnect(ElectricSource src);
	
	String execute();
	
}












