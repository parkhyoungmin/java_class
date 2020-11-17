package myobj.mango;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<MaxMango> mango_list = new ArrayList<MaxMango>();
		
		int i = 1;
		
		while (i <= 100) {
			i++;
			mango_list.add(new MaxMango());
		}
		
		
		Collections.sort(mango_list, new Comparator<MaxMango>() {
			@Override
			public int compare(MaxMango o1, MaxMango o2) {
				return (int) (o1.calorie() - o2.calorie());
			}
		});
		System.out.println(mango_list);
		
		
		
		
		
	}

}







