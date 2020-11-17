package myobj.phonebook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	
	/*
	 # HashMap�� �̿��� PhoneBook�� �����غ�����
	 1. �׷� / ��ȭ��ȣ / �̸��� �����ؾ��Ѵ�
	 2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�
	 3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű�� ������ �̸��� ���´�
	 
	 # �����ؾ� �� �޼���
	 1. ���ο� �׷��� �߰��ϴ� �޼���
	 2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	 3. ��ϵ� ��� ��ȭ��ȣ�� �������� ����ϴ� �޼���
	 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	 */
	
	HashMap<String, HashMap<String, String>> phonebook = new HashMap<>();
	HashMap<String, String> phonename = new HashMap<>(); // HashMap ���ľߵ�
	
	static String group_name;
	static String phone_number;
	static String name;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhoneBook phonebook = new PhoneBook();
		PhoneBook phonename = new PhoneBook();
		
		while(true) {
			
			System.out.println("-----�޴��Է�-----");
			System.out.println("-> �׷��߰�, ��ȭ��ȣ�߰�, ��ȭ��ȣ���, �̸��˻�, ��ȭ��ȣ�˻�");
			System.out.print("�Է�:");
			String input = sc.nextLine();
			switch(input) {
			case("�׷��߰�") :
				System.out.println("-----�׷��߰�-----");
				System.out.print("�׷�: ");
				phonebook.add_group(sc.next());
				break;
			case("��ȭ��ȣ�߰�") :
				System.out.println("-----��ȭ��ȣ�߰�-----");
				phonename.add_number(sc.next());
				break;
			case("��ȭ��ȣ���") :
				phonebook.print_list();
				break;
			case("�̸��˻�"):
				System.out.print("�̸��˻� : ");
				break;
			case("��ȭ��ȣ�˻�"):
				System.out.print("��ȭ��ȣ�˻�");
				break;
			default:
				System.exit(0);
			}
		}
	}
	
//	1. ���ο� �׷��� �߰��ϴ� �޼���
	public void add_group(String group_name) {
		phonebook.put(group_name, new HashMap<>());
		HashMap<String, String> phonename = phonebook.get(group_name);
	}

//	 2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	public void add_number(String group_name) {
		System.out.println("-----��ȭ��ȣ�߰�-----");
		if (group_name.equals(group_name)) { // ��ȭ��ȣ�� �׷�� ��
			phonename.put(phone_number, name);
		}
	}

//	 3. ��ϵ� ��� ��ȭ��ȣ�� �������� ����ϴ� �޼���
	public void print_list() {
		System.out.println(phonebook);
	}

//	 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	public void search_name(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (phonename.containsValue(name.charAt(i))) {
				System.out.println(phonebook.get(name));
			}
		}
	}

//	 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	public void search_number() {
		for (int i = 0; i < phone_number.length(); i++) {
			if (phonename.containsKey(phone_number.charAt(i))) {
				System.out.println(phonebook.get(phone_number));
			}
		}
	}
	
}









