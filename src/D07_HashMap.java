import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class D07_HashMap {

	/*
	 # Map
	 - key/value�� �� ��Ʈ�� �̷�� �ڷᱸ��
	 - key���� ���� value�� ã�� �ڷᱸ��
	 - key�� �ߺ��� ������� �ʴ´�
	 */
	
	public static void main(String[] args) {
		// Map�� key/value ���� �̷�� ������ ���׸��� �ΰ� �޴´�
		Map<String, String> map1 = new HashMap<>();
		
		// put�޼��带 �̿��� �����͸� �����Ѵ�
		// - key�� �ش� �������� ī�װ�(�Ӽ�, property, attribute)�� �ǹ��Ѵ�
		// - value�� �ش� �׸��� ���� �����Ѵ�
		// - ���������� ��Ʈ���� �θ���
		map1.put("�̸�", "������");
		map1.put("����", "5��");
		map1.put("����", "���޶�Ͼ�");
		map1.put("����", "ġ�Ϳ�"); // ���� Key�� �̿��ϸ� (���� + ġ�Ϳ�)�� �ƴ� ġ�Ϳͷ� ���� �����ȴ�
		map1.put("������ ����", "5��");
		
		// get�޼��忡 key���� ������ ���ϴ� �׸��� ���� ������
		System.out.println(map1.get("����"));
		
		// # �ݺ������� Map Ȱ���ϱ�
		// - keySet : Ű��� �̷���� Set�� ��ȯ�Ѵ�
		// - valueSet : value��� �̷���� Collection�� ��ȯ�Ѵ�
		// - entrySet : Entry<k, v>��� �̷���� Set�� ��ȯ�Ѵ�
		
		System.out.println("map1�� key�� : " + map1.keySet());
		System.out.println("map1�� value�� : " + map1.values());
		System.out.println("map1�� entry�� : " + map1.entrySet());
		
		// # KeySet���� ������
		for (String key : map1.keySet()) {
			System.out.println(key + " - " + map1.get(key));
		}
		// # KeySet���� ������
		// - key�� value�� ã�°��� ������ Value�� Key�� ã�°��� �Ұ����ϴ�(���γ���,������ 5��� ���ͼ�)
		for (String value : map1.values()) {
			System.out.println(value);
		}
		// # entrySet���� ������
		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("������", "13");
		
		// # containsKey
		System.out.println(map1.containsKey("������ ����")); // true
		System.out.println(map1.containsKey("������ ���� ")); // false
		// # containsValue
		System.out.println(map1.containsValue("5��"));
		
		// # putAll�� �ٸ� Map�� �����͸� �߰��� �� �ִ�
		map1.putAll(map2);
		System.out.println(map1);
		
		// # remove�޼���� ���ϴ� �����͸� ����� �ִ�
		// - key�� ������ ����� ��� : ��� ������ ���� ��ȯ�Ѵ�
		// - key�� value��θ� ������ ����� ��� : ��Ȯ�ϰ� ���� ��ġ�Ҷ� �����Ѵ�
		System.out.println(map1.remove("����", "6��"));
		System.out.println(map1.size());
		System.out.println(map1.remove("����", "5��"));
		System.out.println(map1.size());
		
		// # get�޼��带 ����ϴٰ� ������ Ȥ�� Ű�� ���� ��� null�� ��ȯ�Ǿ�
		// NullPointerException�� �߻��� ������ �ִ�
		
		// # getOrDefault�޼��带 �̿��� null���� ��ȯ�Ǵ� ��Ȳ�̶�� �⺻����
		// ��ȯ���� �� �ִ�
		System.out.println(map1.getOrDefault("������ �̸�", "�⺻��").charAt(1));
		System.out.println(map1.get("������ ����"));
		
		// # MapŸ�� ���ο� MapŸ�� �ֱ�
		HashMap<String, HashMap<String, String>> phone_book = new HashMap<>();
		
		// ���ο� �ؽ��� �ν��Ͻ��� ������ �����ϸ�, Ű������ �ش� �ؽ����� ���� �� �ְ� �ȴ�
		phone_book.put("�п�", new HashMap<>());
		phone_book.put("����", new HashMap<>());
		phone_book.put("����б�", new HashMap<>());
		phone_book.put("���б�", new HashMap<>());
		phone_book.put("���Ƹ�", new HashMap<>());
		
		HashMap<String, String> group_map = phone_book.get("�п�");
		
		// �ߺ��Ǵ� ���� Ű������ ����� �� ���� ������
		// Ű������ �̸����ٴ� ��ȭ��ȣ�� ����ϴ� ���� ����
		group_map.put("010-1234-1234", "�踻��");
		group_map.put("010-5678-5678", "�踻��");
		
		System.out.println(phone_book);
		
		
		
	}
	
}






















