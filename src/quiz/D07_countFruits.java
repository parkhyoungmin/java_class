package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class D07_countFruits {

	private enum Fruit {
		APPLE,
		BANANA,
		ORANGE,
		KIWI
	}
	
	// 다음 리스트를 이용해 각 과일이 몇 개인지 저장한 Map을 생성해보세요
	
	static List<Fruit> fruits;
	
	static {
		fruits = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			fruits.add(Fruit.values()[(int) (Math.random() * 4)]);
		}
	}
	
//	public static void main(String[] args) {
//		System.out.println(fruits);
//		
//		Map<Fruit, Integer> fruit_list = new HashMap<Fruit, Integer>();
//		
//		fro (Fruit fruit : Fruit.values()) {
//			int freq = collections.frequency(fruits, fruit);
//			fruit_list.put(fruit, freq);
//		}
//		System.out.println(fruit_list);
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		int[] count = new int[4];
//		
//		for (int i = 0; i < fruits.size(); i++) { // Fruit fruit : Fruit.values()
//												// collections.frequency(fruits, fruit)
//			for (int j = 0; j < 4; j++) {
//				if (Fruit.values()[i].equals(fruits)) { // fruit.equals(Fruit.APPLE)
//					count[j]++;
//				}
//			}
//		}
//		fruit_list.put("APPLE", count[0]);
//		fruit_list.put("BANANA", count[1]);
//		fruit_list.put("ORANGE", count[2]);
//		fruit_list.put("KIWI", count[3]);
//		for (Entry<String, Integer> entry : fruit_list.entrySet()) {
//			System.out.println(entry.getKey() + " / " + entry.getValue());
//		}
//		
//	}
	
	
}
















