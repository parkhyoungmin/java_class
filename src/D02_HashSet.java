import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import myobj.animal.Animal;

public class D02_HashSet {

	/*
	 # Set
	 - ������ �����س��� Ŭ����
	 - ��ҷ� ���� ���� ������ ���� ������� �ʴ´�
	 */
	
	/*
	 # Hash
	 - � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰���
	 - ������ �� ���� ���� �̿��ϹǷ� ������ �Ұ����ϴ�
	 - ������ ������ ���� ���� ã�� ���� �Ұ��ɿ� ������
	 - �ٽ� ���� ������ ���ư� �� ���� �ܹ��⼺ �˰���
	 - �ӵ��� ������ ���ȼ��� �پ �˰���
	 */
	
	public static void main(String[] args) {
		
		HashSet<Integer> even = new HashSet<Integer>();
		
		// Set���� �Ȱ��� �����͸� ������ �� ����
		even.add(30);
		even.add(10);
		even.add(20);
		even.add(20);
		even.add(30);
		even.add(70);
		
		// Hash�� �̿��ϴ� Ŭ������ ���� �־��� ������� �������� �ʴ´�
		System.out.println(even);
		
		// HashSet�� index�� ���� ������ �ϳ��� ���� ���� ����
		for (int i : even) {
			System.out.println("�ϳ��� ������ ��� : " + i);
		}
		
		ArrayList<String> animalList = new ArrayList<String>();
		
		animalList.add("dog");
		animalList.add("dog");
		animalList.add("cat");
		animalList.add("cat");
		animalList.add("cat");
		animalList.add("bird");
		animalList.add("lion");
		animalList.add("eagle");
		
		Collections.shuffle(animalList);
		System.out.println(animalList);
		
		// �ٸ� ������ �÷����� Set���� �ս��� ������ �� �ִ�
		// �ߺ��� ���ŵǴ� ȿ���� �ִ�
		Set<String> animal_set = new HashSet<>(animalList);
		System.out.println(animal_set);
		
		// �÷����� �迭�� ��ȯ�ϱ�
		Object[] animal_arr = animalList.toArray();
		
		// 1. String���� ���� �� �ٿ�ĳ������ �ʿ���
		System.out.println(animal_arr[0]);
		String first_animal = (String) animal_arr[0];
		System.out.println(first_animal);
		
		// 2. �÷����� �迭�� ��ȯ�ϱ�
		// - �̸� ������ �ش� ���׸� �迭�� �����ϴ� ���
		String[] animal_arr1 = new String[animal_set.size()];
		animal_set.toArray(animal_arr1);
		first_animal = animal_arr1[0];
		System.out.println(first_animal);
		
		
		// contains : �÷��ǿ� �ش� ��Ұ� �ִ��� ���θ� ��ȯ
		System.out.println(animalList.contains("dog"));
		System.out.println(animal_set.contains("dog"));
		
		// size : �÷��� ũ�� ��ȯ
		System.out.println(animal_set.size());
		
		// remove : �÷��� ��� ���� (���� ������ true ��ȯ)
		System.out.println(animal_set.remove("dog"));
		
		// # �ٸ� �÷����� �̿��ϴ� �޼����
		Set<Character> alphabets01 = new HashSet<Character>(); 
		Set<Character> alphabets02 = new HashSet<Character>();
		
		Collections.addAll(alphabets01, 'A', 'B', 'C', 'D', 'E');
		Collections.addAll(alphabets02, 'F', 'G', 'H', 'I', 'J');
		
		System.out.println(alphabets01);
		System.out.println(alphabets02);
		
		// 1. addAll(Collection) : �ٸ� �÷����� ��� ���� �߰��Ѵ�
		List<Character> alpha_all = new ArrayList<Character>();
		
		alpha_all.addAll(alphabets01);
		alpha_all.addAll(alphabets02);
		
		System.out.println(alpha_all);
		
		// 2. removeAll(collection) : �ٸ� �÷��ǰ� ��ġ�ϴ� ��� ���� �����Ѵ�
		Set<Character> to_remove = new HashSet<Character>();
		Collections.addAll(to_remove, 'A', 'D');
		
		alpha_all.removeAll(to_remove);
		System.out.println(alpha_all);
		
		// 3. retainAll(collection) : ������ �÷��ǰ� ��ġ�ϴ� ���� �����Ѵ�
		List<Character> to_retain = new ArrayList<Character>();
		
		to_retain.add('E');
		to_retain.add('G');
		
		alpha_all.retainAll(to_retain);
		System.out.println(alpha_all);
		
		// 4. containsAll(collection)
		// - ������ �÷����� ��� ��Ұ� ���ԵǾ� �ִ��� Ȯ���Ѵ�
		Collections.addAll(alpha_all, 'A', 'B', 'C', 'D');
		
		Set<Character> must_contain = new HashSet<Character>();
		
		must_contain.add('A');
		must_contain.add('B');
		must_contain.add('C');
		must_contain.add('D');
//		must_contain.add('Z'); // false
		
		// alpha_all�� must_contain�� ��� ���ԵǾ��ִ°�? �� ����Ͱ� ����
		System.out.println(alpha_all.containsAll(must_contain));
		
		
		
	}
	
	
	
}























