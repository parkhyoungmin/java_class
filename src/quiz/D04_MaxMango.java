package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import myobj.mango1.Mango;

public class D04_MaxMango {

	/*
	 ������ Į�θ��� �絵�� �������� �����Ǵ� ���� Ŭ������ �ϳ� �����ϰ�
	 100���� ���� �ν��Ͻ� �� ���� Į�θ��� ���� ���� �����غ�����
	 
	 �� ���� Į�θ��� ���� ��� �� ���� �絵�� ���� �ν��Ͻ��� �����ؾ���
	 */
	public static void main(String[] args) {
		
		List<Mango> mangos = new ArrayList<>(100);
		
		for (int i = 0; i < 100; i++) {
			mangos.add(new Mango());
		}
		
		Mango most_mango = Collections.max(mangos);
		
		System.out.println(most_mango.calorie);
		System.out.println(most_mango.sweet);
		
		
	}
	
	
	
}







