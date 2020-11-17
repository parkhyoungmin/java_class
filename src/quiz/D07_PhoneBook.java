package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import myobj.phonebook.PhoneBook;

public class D07_PhoneBook {
	
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
	
	HashMap<String, HashMap<String, String>> phonebook_map;
	
	public D07_PhoneBook() {
		phonebook_map = new HashMap<>();
	}
	
	/**
	 * �׷� �߰� ������ true��ȯ
	 */
	public boolean add_group(String groupName) {
		if (phonebook_map.containsKey(groupName)) {
			System.err.println("�̹� �����ϴ� �׷���Դϴ�");
			return false;
		} else {
			phonebook_map.put(groupName, new HashMap<>());
			System.out.println("���ο� �׷��� �߰��Ǿ����ϴ�.");
			return true;
		}
	}
	
	/**��ȭ��ȣ ��� ������ true*/
	public boolean addPhoneNumber(String groupName, String tel, String name) {
		
		if (!phonebook_map.containsKey(groupName)) {
			System.out.println("�������� �ʴ� �׷���Դϴ�.");
			return false;
		}
		HashMap<String, String> group = phonebook_map.get(groupName);
		
		if (group.containsKey(tel)) {
			System.out.println("�ش� ������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("�ش� ������ �߰��Ǿ����ϴ�.");
		}
		phonebook_map.get(groupName).put(tel, name);
		return true;
	}
	
	private boolean str_contains(String check, String frag) {
		char[] chk = check.toCharArray();
		char[] fr = frag.toCharArray();
		
		char ch1 = fr[0];
		// chk : ��ü ���ڿ�
		// fr : �κ� ���ڿ�
		// �κ� ���ڿ��� �� �ձ��ڰ� chk�� �ִ��� ���� �˻�
		// ã���� �ش� �κк��� ��� fr�� ��ġ�ϸ� true
		
		for (int i = 0; i < chk.length; i++) {
			if (chk[i] == ch1 && (chk.length - i) >= fr.length) {
				int cnt = 0;
				for (int j = 0; j < fr.length; j++) {
					if (chk[i + j] == fr[j]) {
						cnt++;
					} else {
						break;
					}
				}
				if (cnt == fr.length) {
					return true;
				}
			}
		}
		return false;
//		return check.contains(frag);// ���� for�� -> ���ٷ� ������ �ִ�
	}
	
	/**�̸����� �˻��ϸ� �ش��ϴ� entry���� set���·� ��ȯ�Ǵ� �޼���*/
	public Set<List<String>> searchByName(String name_frag) {
		Set<List<String>> to_return = new HashSet<>();
		for (HashMap<String, String> groupMap : phonebook_map.values()) {
			for (String phoneNumber : groupMap.keySet()) {
				String name = groupMap.get(phoneNumber);
				if (str_contains(name, name_frag)) {
					// ã�� ����� ������ ����Ʈ�� �籸���Ͽ� ����
					// index 0���� �̸�, 1���� ��ȣ ����
					List<String> found = new ArrayList<>();
					found.add(name);
					found.add(phoneNumber);
					
					to_return.add(found);
				}
			}
		}
		return to_return;
	}
	
	/**��ȣ�� �˻��ϸ� �ش��ϴ� entry���� set���·� ��ȯ�Ǵ� �޼���*/
	public Set<List<String>> searchByNumber(String phone_frag) {
		Set<List<String>> to_return = new HashSet<>();
		for (HashMap<String, String> groupMap : phonebook_map.values()) {
			for (String phoneNumber : groupMap.keySet()) {
				if (str_contains(phoneNumber, phone_frag)) {
					List<String> found = new ArrayList<>();
					found.add(groupMap.get(phoneNumber));
					found.add(phoneNumber);
					
					to_return.add(found);
				}
			}
		}
		return to_return;
	}
	
	public static void main(String[] args) {
		D07_PhoneBook phonebook_a = new D07_PhoneBook();
		D07_PhoneBook phonebook_b = new D07_PhoneBook();
		
		phonebook_a.add_group("�б�");
		phonebook_a.addPhoneNumber("�б�", "010-2563-8095", "��ö��");
		phonebook_a.addPhoneNumber("�б�", "010-2733-8345", "��ö��");
		phonebook_a.addPhoneNumber("�б�", "010-2453-8325", "��ö��");
		phonebook_a.addPhoneNumber("�б�", "010-2343-7445", "��ö��");
		phonebook_a.addPhoneNumber("�б�", "010-2123-8325", "��ö��");
		
		System.out.println(phonebook_a.phonebook_map);
		System.out.println(phonebook_a.searchByName("��"));
		System.out.println(phonebook_a.searchByNumber("53"));
		
		
	}
}














