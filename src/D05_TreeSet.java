import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.mango1.Mango;

public class D05_TreeSet {

	/*
	 # TreeSet
	 - �ߺ����� ������ �� ����
	 - �����͸� ������ �� ������������ �����Ѵ�
	 - ��ҷ� null�� ������� �ʴ´�
	 - ���� �ӵ��� ���� ��� ������ ����/�˻� �ӵ��� ������
	 
	 �� �ߺ����� + ���ϴ� �κ� ���� ���� + ����
	 */
	
	public static void main(String[] args) {
		
		TreeSet<Mango> sweet_mango_tree = new TreeSet<>(new Comparator<Mango>() {
	
			
			@Override
			public int compare(Mango o1, Mango o2) {
				// Set�� ���� �����͸� ������� �ʱ� ������
//				   ���� �絵�� ���� ���� ��� ������� �ȴ�
//				return o1.sweet - o2.sweet;
				
				// ���� �絵�� ������ ���� ����id�� �������� �ٽ� �����ϱ�
				int sweet_value = o1.sweet - o2.sweet;
				
				// id��� hashcode()�� ����ص� �ȴ� (�ش� ��ü�� �����ϰ� �����ϴ� ��)
				return sweet_value == 0 ?
						o1.hashCode() - o2.hashCode() : sweet_value;
			}

		});
		
		for (int i = 0; i< 500; i++) {
			sweet_mango_tree.add(new Mango());
		}
		System.out.println(sweet_mango_tree);
		System.out.println("TreeSet�� ����� ���� : " + sweet_mango_tree.size());
		
		// Comparable���� return 0�� ���� ��ü���� �ǹ��Ѵ�
		Set<Mango> basic_comp_tree = new TreeSet<>();
		
		for (int i = 0; i < 500; i++) {
			basic_comp_tree.add(new Mango());
		}
		System.out.println("basic_comp_tree�� ����� ���� : " + basic_comp_tree.size());
		
		// # TreeSet Ȱ��
		
		// # descendingSet : ������������ ���ĵ� Set�� ��ȯ
		System.out.println(sweet_mango_tree.descendingSet());
		
		
		
		
		// headSet(toElement) : �� �պ��� ���ϴ� ��ġ������ Set�� ��ȯ
		Set<Mango> hSet = sweet_mango_tree.headSet(new Mango(0, 7, 10));
		System.out.println("headSet : " + hSet);
		System.out.println("hSet�� ���� : " + hSet.size());
		
		// tailSet(toElement) : ���ϴ� ���غ��� �� ������������ Set�� ��ȯ
		SortedSet<Mango> tSet = sweet_mango_tree.tailSet(new Mango(0, 7, 10));
		System.out.println("tailSet : " + tSet);
		System.out.println("tSet�� ���� : " + tSet.size());
		
		SortedSet<Mango> h_tSet = tSet.headSet(new Mango(0, 8, 100));
		System.out.println("h_tSet�� ���� : " + h_tSet.size());
		
		SortedSet<Mango> t_tSet = tSet.tailSet(new Mango(0, 8, 100));
		System.out.println("t_tSet�� ���� : " + t_tSet.size());
		
		
		// subSet(from, to)
		SortedSet<Mango> result =  sweet_mango_tree
				.subSet(new Mango(0, 7, 1000), new Mango(0, 9, 1000));
		// 7���� �����ʿ� �ְ� 9���ٴ� ���ʿ� �ִ°� ã����
		System.out.println(result);
		
		// # TreeSet��ҷ� �ϳ��� �����ϱ�
		TreeSet<Integer> int_tree = new TreeSet<Integer>();
		
		int_tree.add(99);
		int_tree.add(7);
		int_tree.add(39);
		int_tree.add(65);
		int_tree.add(25);
		int_tree.add(21);
		
		/* 
		floor, ceiling
		- �ش� �� �������� ���� ����� ����/���� ���� �ϳ� ��ȯ
		- ������ ���� ���� ���� �ִٸ� �ش� ���� ��ȯ�Ѵ�
		
		lower, higher
		- �ش� �� �������� ���� ����� ����/���� ���� �ϳ� ��ȯ
		- ������ ���� ���� ���� �����Ѵ�
		 */
		
		System.out.println(int_tree.ceiling(12));
		System.out.println(int_tree.floor(12));
		System.out.println(int_tree.higher(12));
		System.out.println(int_tree.lower(12));
		
		
	}
	
}














