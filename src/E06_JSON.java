import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06_JSON {

	/*
	 # JSON
	 - JavaScript���� ���
	 - ���ڿ������� Map�� �����ϰ� ǥ���� �� �־ �αⰡ ����
	 - { Key : Value, Key : Value }�� ���¸� ������
	 
	 # JSON Value�� ���Ǵ� �ڹٽ�ũ��Ʈ Ÿ�Ե�
	 - '',"" : ���ڿ�
	 - ����, �Ҽ� : Number
	 - [] : Array
	 - {} : JSON
	 
	 # JAVA���� JSONŸ���� �������� �ʱ� ������ �����͵���
	 	JSON������ ���ڿ��� �������� �Ѵ� (Parsing, Binding)
	 */
	
	public static void mapToJsonFile(Map<String, Object> map) {
		StringBuilder builder = new StringBuilder();
		
		builder.append("{\n");
		
		int count = 0;
		int size = map.size() - 1;
		
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			builder.append("\t\"" + key + "\" : ");
			
			if (value == null) {
				builder.append("null");
			} else if (value instanceof String) {
				builder.append("'" + value + "'");
			} else if (value instanceof Object[]) {
				Object[] arr = (Object[]) value; // Object -> ������ ���� �ִ� Ÿ��
				if (arr.length == 0) {
					builder.append("[]");
				}
				
				if (arr instanceof String[]) {
					builder.append("[");
					
					int len = arr.length - 1;
					
					int lencount = 0;
					for (Object obj : arr) {
						builder.append("'" + obj + "'");
						
						if (lencount++ == len) {
							builder.append("]");
						} else {
							builder.append(", ");
						}
					}
				} else {
					builder.append("[");
					
					int len = arr.length - 1;
					
					int lencount = 0;
					for (Object obj : arr) {
						builder.append("'" + obj + "'");
						
						if (lencount++ == len) {
							builder.append("]");
						} else {
							builder.append(", ");
						}
					}
				}
			} else {
				builder.append(value);
			}
			if (count++ == size) {
				builder.append("\n}");
				break;
			}
			builder.append(",\n");
		}
		System.out.println(builder);
	}
	
	
	// .json���Ͽ� ����� �����͸� JAVA������ ��ȯ�ϴ� �޼��带 ��������
//	public static void jsonFileToMap(Map<String, Object> map2) {
//		try {
//			FileReader fr = new FileReader("D:\\java_io\\data.json", 
//					Charset.forName("EUC-KR"));
//			BufferedReader br = new BufferedReader(fr, 2048);
//			int read_map;
//			StringBuilder sb = new StringBuilder();
//			
//			while ((read_map = br.read()) != -1) {
//				sb.append((char) read_map);
//			}
//			String str = sb.toString();
//			String[] str1 = str.split(",\n");
//			
//			ArrayList<String> list = new ArrayList<String>();
//			for (int i = 0; i < str1.length; i++) {
//				list.add(str1[i]);
//			}
//			System.out.println(list);
//			br.close();
//			fr.close();
//			System.out.println("��ȯ�Ϸ�");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	
	public static void jsonFileToMap(Map<String, Object> map) throws IOException {
		FileReader fr = new FileReader("D:\\java_io\\data.json");
		
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = fr.read()) != -1) {
			sb.append((char) ch);
		}
		System.out.println("���Ͽ��� �о�� ����");
		System.out.println(sb);
		
		fr.close();
		
		String jsonObj = new String(sb);
		
		Pattern entry_pattern = Pattern.compile(".+:.+\n");
		
		Matcher matcher = entry_pattern.matcher(jsonObj);
		
		while (matcher.find()) {
			String entry = matcher.group().trim();
			
			if (entry.charAt(entry.length() - 1) == ',') {
				entry = entry.substring(0, entry.length() - 1);
			}
			System.out.println("Entry: " + entry);
			
			String[] split_entry = entry.split(":");
			
			String key = split_entry[0].trim().replace("[\"\']", "");
			String value = split_entry[1].trim();
			
			System.out.println("key: " + key);
			System.out.println("value: " + value);
			
			if (value.equals("null")) {
				System.err.println("null");
			} else if (Pattern.matches("[\"\'].+[\"\']", value)) {
				System.out.println("���ڿ��� ������");
				map.put(key, value.replaceAll("[\"\']", ""));
				
			} else if (Pattern.matches("\\d+", value)) {
				System.out.println("���ڷ� ������");
				map.put(key, Integer.parseInt(value));
				
			} else if (Pattern.matches("\\d+\\.\\d+", value)) {
				System.out.println("�Ҽ��� ������");
				map.put(key, Double.parseDouble(value));
				
			} else if (Pattern.matches("\\[.+\\]", value)) {
				System.out.println("�迭�� ������");
				
				value = value.replaceAll("[\\[\\]]", "");
				
				String[] items = value.split(",");
				Object[] objs = null;
				
				// �迭 ������ ���븮 ���ڿ� �϶�
				if (Pattern.matches("[\"\'].+[\"\']", items[0])) {
					objs = new String[items.length];
					for (int i = 0; i < items.length; i++) {
						objs[i] = items[i].trim().replaceAll("[\"\']", "");
					}
					
				} else if (Pattern.matches("\\d+", items[0])) {
					objs = new Integer[items.length];
					for (int i = 0; i < items.length; i++) {
						objs[i] = Integer.parseInt(items[i].trim());
					}
					
				} else if (Pattern.matches("\\d+\\.\\d+", items[0])) {
					objs = new Double[items.length];
					for (int i = 0; i < items.length; i++) {
						objs[i] = Double.parseDouble(items[i].trim());
					}
				}
				map.put(key, objs);	
			}
			System.out.println("-----------------------");
		}
	}
	
	
	public static void main(String[] args) throws IOException {	
		HashMap<String, Object> map = new HashMap<>();
		// ���� Map�� ����� �����͸� JSON������ ���ڿ��� �����Ͽ� ����غ�����
//		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "ȫ�浿");
		map.put("age", 15);
		map.put("tel", "010-1234-5678");
		map.put("abc", null);
		map.put("programming", new String[] {"JAVA", "Python", "JS"});
		map.put("lotto", new Integer[] {1, 2, 3, 4, 5, 6});
		
		// ��� : { name:"ȫ�浿", age:15, tel:"010-1234-5678" }
		// instanceof �����ڸ� ���� �ش� ���� Ÿ���� ������ �� �ִ�
		System.out.println(map.get("name") instanceof String);
		System.out.println(map.get("age") instanceof Integer);
		System.out.println(map.get("tel") instanceof String);
		System.out.println(map.get("programming") instanceof String[]);
		
		
//		/////////////////////////////////////////////////////////////////////
		
		
//		System.out.println("{");
//		for (Entry<String, Object> entry : map.entrySet()) {
//			
//			StringBuilder str_entry = new StringBuilder();
//			
//			if (entry.getValue() instanceof String) {
//				System.out.print("\t\"" + entry.getKey() + "\"" + " : " 
//			+ "\'" + entry.getValue() + "\',");
//				System.out.println();
//			} else if (entry.getValue() instanceof String[]) {
//				String[] str = (String[]) entry.getValue();
//				
//				System.out.print("\t\"" + entry.getKey() + "\"" + " : " + "[");
//				for (int i = 0; i < str.length - 1; i++) {
//					System.out.print("\'" + str[i] + "\',");
//				}
//				System.out.print("\'" + str[str.length -1] + "\'");
//				System.out.print("],");
//				System.out.println();
//			} else {
//				System.out.print("\t\"" + entry.getKey() + "\"" + " : "
//			+ entry.getValue() + ",");
//				System.out.println();
//			}
//
//		}
//		System.out.print("}");
		
		
		// //////////////////////////////////////////////////////////////////
		System.out.println();
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("{\n");
		
		int count = 0;
		int size = map.size() - 1;
		
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			builder.append("\t\"" + key + "\" : ");
			
			if (value == null) {
				builder.append("null");
			} else if (value instanceof String) {
				builder.append("'" + value + "'");
			} else if (value instanceof Object[]) {
				Object[] arr = (Object[]) value; // Object -> ������ ���� �ִ� Ÿ��
				if (arr.length == 0) {
					builder.append("[]");
				}
				
				if (arr instanceof String[]) {
					builder.append("[");
					
					int len = arr.length - 1;
					
					int lencount = 0;
					for (Object obj : arr) {
						builder.append("'" + obj + "'");
						
						if (lencount++ == len) {
							builder.append("]");
						} else {
							builder.append(", ");
						}
					}
				} else {
					builder.append("[");
					
					int len = arr.length - 1;
					
					int lencount = 0;
					for (Object obj : arr) {
						builder.append("'" + obj + "'");
						
						if (lencount++ == len) {
							builder.append("]");
						} else {
							builder.append(", ");
						}
					}
				}
			} else {
				builder.append(value);
			}
			if (count++ == size) {
				builder.append("\n}");
				break;
			}
			builder.append(",\n");
		}
		
//		System.out.println(builder);
		
		FileWriter fw = new FileWriter("D:\\java_io\\data.json");
		
		fw.write(new String(builder));
		
		fw.close();
		
		System.out.println("���� ���� �Ϸ�");
		
		//������ ���� �ִ� Ÿ��
		Object a = new int[10];
		Object b = new Object[10];
		 
		// �ٽ� �迭�� ����ϱ� ���� �ٿ�ĳ���� 
		System.out.println(((int[]) a)[0]);
		System.out.println(((Object[]) b)[0]);
		
		mapToJsonFile(map);
		
		HashMap<String, Object> map2 = new HashMap<>();
		
		// .json���Ͽ� ����� �����͸� JAVA������ ��ȯ�ϴ� �޼��带 ��������
		jsonFileToMap(map2);
		System.out.println(map2);
		System.out.println(Arrays.toString((Object[])map2.get("lotto")));
		
	}

}














