package myobj.mango;

import java.util.Random;

public class MaxMango implements Comparable<MaxMango> {

	private int calorie;
	private int sugar_content;
	String name;
	int mango_name = 1;
	
	/*
	 생성시 칼로리와 당도가 랜덤으로 설정되는 망고 클래스를 하나 생성하고
	 100개의 망고 인스턴스 중 가장 칼로리가 높은 망고를 선택해보세요
	 
	 ※ 만약 칼로리가 같은 경우 더 높은 당도를 가진 인스턴스를 선택해야함
	 */
	
	public MaxMango() {
//		Random ran = new Random();
//		
//		calorie = ran.nextInt(200) + 1;
//		sugar_content = ran.nextInt(5) + 10;
		name = String.format("망고%d번", mango_name++);
	}
	
	
	public String mango_info() {
		return String.format("\n망고%d번의 칼로리: %d, 당도: %d", mango_name++, calorie, sugar_content);
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







