package myobj.mango;

import java.util.Random;

public class MaxMango implements Comparable<MaxMango> {

	private int calorie;
	private int sugar_content;
	String name;
	int mango_name = 1;
	
	/*
	 ������ Į�θ��� �絵�� �������� �����Ǵ� ���� Ŭ������ �ϳ� �����ϰ�
	 100���� ���� �ν��Ͻ� �� ���� Į�θ��� ���� ���� �����غ�����
	 
	 �� ���� Į�θ��� ���� ��� �� ���� �絵�� ���� �ν��Ͻ��� �����ؾ���
	 */
	
	public MaxMango() {
//		Random ran = new Random();
//		
//		calorie = ran.nextInt(200) + 1;
//		sugar_content = ran.nextInt(5) + 10;
		name = String.format("����%d��", mango_name++);
	}
	
	
	public String mango_info() {
		return String.format("\n����%d���� Į�θ�: %d, �絵: %d", mango_name++, calorie, sugar_content);
	}
	
	
	public int calorie() {
		Random ran = new Random();
		this.calorie = ran.nextInt(200) + 1;
		return this.calorie;
	}
	
	public int sugar_content() {
		Random ran = new Random();
		this.sugar_content = ran.nextInt(5) + 10;
		return this.sugar_content;
	}
	

	@Override
	public int compareTo(MaxMango next_mango) {
		if (this.calorie > next_mango.calorie) {
			return -1;
		} else if (this.calorie < next_mango.calorie) {
			return 1;
		} else {
			if (this.sugar_content > next_mango.sugar_content) {
				return -1;
			} else if (this.sugar_content < next_mango.sugar_content) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	
}







