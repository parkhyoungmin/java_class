import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import myobj.animal.Animal;

public class D02_HashSet {

	/*
	 # Set
	 - 집합을 구현해놓은 클래스
	 - 요소로 같은 값이 들어오는 것을 허용하지 않는다
	 */
	
	/*
	 # Hash
	 - 어떤 값을 넣었을 때 전혀 예측할 수 없는 값이 생성되어야 하는 알고리즘
	 - 예측할 수 없는 값을 이용하므로 정렬이 불가능하다
	 - 생성된 값으로 원래 값을 찾는 것이 불가능에 가깝다
	 - 다시 원래 값으로 돌아갈 수 없는 단방향성 알고리즘
	 - 속도가 빠르고 보안성도 뛰어난 알고리즘
	 */
	
	public static void main(String[] args) {
		
		HashSet<Integer> even = new HashSet<Integer>();
		
		// Set에는 똑같은 데이터를 저장할 수 없다
		even.add(30);
		even.add(10);
		even.add(20);
		even.add(20);
		even.add(30);
		even.add(70);
		
		// Hash를 이용하는 클래스는 값이 넣었던 순서대로 보관되지 않는다
		System.out.println(even);
		
		// HashSet은 index가 없기 때문에 하나만 꺼낼 수가 없다
		for (int i : even) {
			System.out.println("하나씩 꺼내서 사용 : " + i);
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
		
		// 다른 종류의 컬렉션을 Set으로 손쉽게 변경할 수 있다
		// 중복이 제거되는 효과가 있다
		Set<String> animal_set = new HashSet<>(animalList);
		System.out.println(animal_set);
		
		// 컬렉션을 배열로 변환하기
		Object[] animal_arr = animalList.toArray();
		
		// 1. String으로 받을 때 다운캐스팅이 필요함
		System.out.println(animal_arr[0]);
		String first_animal = (String) animal_arr[0];
		System.out.println(first_animal);
		
		// 2. 컬렉션은 배열로 변환하기
		// - 미리 만들어둔 해당 제네릭 배열을 전달하는 방식
		String[] animal_arr1 = new String[animal_set.size()];
		animal_set.toArray(animal_arr1);
		first_animal = animal_arr1[0];
		System.out.println(first_animal);
		
		
		// contains : 컬렉션에 해당 요소가 있는지 여부를 반환
		System.out.println(animalList.contains("dog"));
		System.out.println(animal_set.contains("dog"));
		
		// size : 컬렉션 크기 반환
		System.out.println(animal_set.size());
		
		// remove : 컬렉션 요소 삭제 (삭제 성공시 true 반환)
		System.out.println(animal_set.remove("dog"));
		
		// # 다른 컬렉션을 이용하는 메서드들
		Set<Character> alphabets01 = new HashSet<Character>(); 
		Set<Character> alphabets02 = new HashSet<Character>();
		
		Collections.addAll(alphabets01, 'A', 'B', 'C', 'D', 'E');
		Collections.addAll(alphabets02, 'F', 'G', 'H', 'I', 'J');
		
		System.out.println(alphabets01);
		System.out.println(alphabets02);
		
		// 1. addAll(Collection) : 다른 컬렉션의 모든 값을 추가한다
		List<Character> alpha_all = new ArrayList<Character>();
		
		alpha_all.addAll(alphabets01);
		alpha_all.addAll(alphabets02);
		
		System.out.println(alpha_all);
		
		// 2. removeAll(collection) : 다른 컬렉션과 일치하는 모든 값을 제거한다
		Set<Character> to_remove = new HashSet<Character>();
		Collections.addAll(to_remove, 'A', 'D');
		
		alpha_all.removeAll(to_remove);
		System.out.println(alpha_all);
		
		// 3. retainAll(collection) : 전달한 컬렉션과 일치하는 값만 유지한다
		List<Character> to_retain = new ArrayList<Character>();
		
		to_retain.add('E');
		to_retain.add('G');
		
		alpha_all.retainAll(to_retain);
		System.out.println(alpha_all);
		
		// 4. containsAll(collection)
		// - 전달한 컬렉션의 모든 요소가 포함되어 있는지 확인한다
		Collections.addAll(alpha_all, 'A', 'B', 'C', 'D');
		
		Set<Character> must_contain = new HashSet<Character>();
		
		must_contain.add('A');
		must_contain.add('B');
		must_contain.add('C');
		must_contain.add('D');
//		must_contain.add('Z'); // false
		
		// alpha_all에 must_contain이 모두 포함되어있는가? 를 물어본것과 같다
		System.out.println(alpha_all.containsAll(must_contain));
		
		
		
	}
	
	
	
}























