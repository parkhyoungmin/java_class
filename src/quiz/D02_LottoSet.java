package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class D02_LottoSet {

	/*
	 1부터 45사이의 중복없는 랜덤 숫자 6개로 이루어진 HashSet을 생성해보세요
	 */
	public static Set<Integer> generate() {
		Random ran = new Random();
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		while (lotto.size() < 6) {
			lotto.add(ran.nextInt(45) + 1);
		}
		return lotto;
	}
	
	
	public static void main(String[] args) {
//		HashSet<Integer> lotto_list = new HashSet<Integer>();
//		
//		for (int i = 1; i < 46; i++) {
//			lotto_list.add(i);
//		}
//		ArrayList<Integer> lotto_list_arr = new ArrayList<Integer>(lotto_list);
//		Collections.shuffle(lotto_list_arr);
//		
//		Set<Integer> lotto_set = new HashSet<Integer>(lotto_list_arr);
//		System.out.println(lotto_set);
		
		
		
		System.out.println(generate());
	}

}















