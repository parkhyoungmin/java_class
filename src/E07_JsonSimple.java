//import java.io.FileReader;
//import java.io.IOException;
//import java.text.ParseException;
//import java.util.ArrayList;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.JSONValue;
//import org.json.simple.parser.JSONParser;
//
//public class E07_JsonSimple {
//
//	// ���ۿ��� maven repo �˻�, �ڹٶ��̺귯������ ���ִ� ����Ʈ
//	
//	// �ܺ� ���̺귯�� �߰� ���
//	// Build path -> Configure BuildPath -> Lib Tab
//	// -> Add external JAR
//	
//	public static void main(String[] args) {
//		
//		// mapó�� �����͸� �߰��Ѵ�
//		JSONObject obj = new JSONObject();
//		
//		// JSON �迭�� ����� ���ؼ��� ArrayList�� ����ؾ� �Ѵ�
//		ArrayList<String> arr = new ArrayList<>();
//		
//		arr.add("game");
//		arr.add("soccer");
//		arr.add("Programming");
//		
//		obj.put("car", "BMW");
//		obj.put("addr", "��õ��");
//		obj.put("age", 27);
//		obj.put("hobbies", arr);
//		
//		// toString�� �����Ǿ��ִ�
//		System.out.println(obj);
//		String jsonStr = obj.toString();
//		System.out.println(jsonStr);
//		
//		JSONParser parser = new JSONParser();
//		
//		try {
//			// File���� �о�� �����͸� JSON������ Map���� �Ľ�
//			JSONObject obj2 = (JSONObject) parser.parse(
//					new FileReader("D:\\java_io\\data.json"));
//			System.out.println(obj2.get("lotto"));
//			
//			// JSONObject ������ �迭 ������ ����ϱ�
//			JSONArray programs = (JSONArray) (obj2.get("programming"));
//			
//			for (Object program : programs) {
//				System.out.println(program);
//			}
//			
//			// JSONObject ������ JSONObject ����ϱ�
//			JSONObject minsu = (JSONObject) obj2.get("�μ�");
//			System.out.println(minsu.get("����"));
//			
//			// JSON - ������ ������ Map�� ������ �� �ִ� ���ڿ� (�����ϱ� ���� ����)
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	
//	
//}















