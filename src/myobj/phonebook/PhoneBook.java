package myobj.phonebook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	
	/*
	 # HashMap을 이용한 PhoneBook을 구현해보세요
	 1. 그룹 / 전화번호 / 이름을 저장해야한다
	 2. 그룹 이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다
	 3. 전화번호 목록에 전화번호를 키로 넣으면 이름이 나온다
	 
	 # 구현해야 할 메서드
	 1. 새로운 그룹을 추가하는 메서드
	 2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드
	 3. 등록된 모든 전화번호를 보기좋게 출력하는 메서드
	 4. 이름의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	 5. 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	 */
	
	HashMap<String, HashMap<String, String>> phonebook = new HashMap<>();
	HashMap<String, String> phonename = new HashMap<>(); // HashMap 고쳐야됨
	
	static String group_name;
	static String phone_number;
	static String name;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhoneBook phonebook = new PhoneBook();
		PhoneBook phonename = new PhoneBook();
		
		while(true) {
			
			System.out.println("-----메뉴입력-----");
			System.out.println("-> 그룹추가, 전화번호추가, 전화번호출력, 이름검색, 전화번호검색");
			System.out.print("입력:");
			String input = sc.nextLine();
			switch(input) {
			case("그룹추가") :
				System.out.println("-----그룹추가-----");
				System.out.print("그룹: ");
				phonebook.add_group(sc.next());
				break;
			case("전화번호추가") :
				System.out.println("-----전화번호추가-----");
				phonename.add_number(sc.next());
				break;
			case("전화번호출력") :
				phonebook.print_list();
				break;
			case("이름검색"):
				System.out.print("이름검색 : ");
				break;
			case("전화번호검색"):
				System.out.print("전화번호검색");
				break;
			default:
				System.exit(0);
			}
		}
	}
	
//	1. 새로운 그룹을 추가하는 메서드
	public void add_group(String group_name) {
		phonebook.put(group_name, new HashMap<>());
		HashMap<String, String> phonename = phonebook.get(group_name);
	}

//	 2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드
	public void add_number(String group_name) {
		System.out.println("-----전화번호추가-----");
		if (group_name.equals(group_name)) { // 전화번호부 그룹명 비교
			phonename.put(phone_number, name);
		}
	}

//	 3. 등록된 모든 전화번호를 보기좋게 출력하는 메서드
	public void print_list() {
		System.out.println(phonebook);
	}

//	 4. 이름의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	public void search_name(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (phonename.containsValue(name.charAt(i))) {
				System.out.println(phonebook.get(name));
			}
		}
	}

//	 5. 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	public void search_number() {
		for (int i = 0; i < phone_number.length(); i++) {
			if (phonename.containsKey(phone_number.charAt(i))) {
				System.out.println(phonebook.get(phone_number));
			}
		}
	}
	
}









