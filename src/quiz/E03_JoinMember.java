package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class E03_JoinMember {

	/*
	 1. ����ڰ� �ڽ��� ���������� �Է��ϸ�
	 �� ������ ������� �̸����� �� ���Ͽ� �����غ�����
	 
	 2. ������� �̸��� ���޹����� �ش� ����ڰ�
	 ���Ե� ȸ���̶�� ���Ͽ��� ������ �о� ������ְ�
	 ���� ���Ե��� ���� ����̶�� ���Ե��� �ʾҴٰ� ����ϴ� �޼��带 �ۼ��غ�����
	 
	 3. ����� ������� ������ ������ �� �ִ� �޼��带 �����غ�����
	 
	 �� D:\\java_io\\member\\'��������'.txt
	 */
	
	public static void modify(Member to_update) throws IOException {
		
		// to_upate�� �������� ���� �������� �����ǰ� �������� �����ǵ���
		String dir = "D:\\java_io\\member\\";
		String filename = to_update.name + ".txt";
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// ���� �����͸� �о���δ�
		try {
			br = new BufferedReader(new FileReader(dir + filename, 
					Charset.forName("UTF-8")));
			String[] data = br.readLine().split("/");
			
			Member before = new Member(
					data[0],
					Integer.parseInt(data[1]),
					data[2],
					data[3]);
			
			// �⺻�����͸� ���ο� �����ͷ� �����
			Member after = before.update(to_update);
			
			// �ϼ��� �����͸� ���Ͽ� �����
			pw = new PrintWriter(
					new BufferedWriter(
							new FileWriter(dir + filename, Charset.forName("UTF-8"))));
			
			// MemberŬ������ toSting�� �̿��Ѵ�
			pw.print(after);
			
		} finally {
			if (br != null) br.close(); 
			if (pw != null) pw.close(); 
		}
		
		
	}
	
	static class Member {
		String name;
		int age;
		String blood_type;
		String tel;
		
		public Member (String name, int age, String blood_type, String tel) {
			this.name = name;
			this.age = age;
			this.blood_type = blood_type;
			this.tel = tel;
		}
		
		public Member update(Member to_update) { // ��������
			return new Member(
					to_update.name == null ? this.name : to_update.name,
					to_update.age == -1 ? this.age : to_update.age,
					to_update.blood_type == null ? this.blood_type : to_update.blood_type,
					to_update.tel == null ? this.tel : to_update.tel
			);
		}
		
		@Override
			public String toString() {
				return String.format("%s/%d/%s/%s", name, age, blood_type, tel);
			}
	}
	
	public static boolean checkNotName(String name) throws IOException {
		String dir = "D:\\java_io\\member\\";
		String filename = name + ".txt";
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(dir + filename, 
					Charset.forName("UTF-8")));
			
			String[] data = br.readLine().split("/");
			System.out.printf("<< '%s'���� ���� >>\n", data[0]);
			System.out.println("�̸� : " + data[0]);
			System.out.println("�̸� : " + data[1]);
			System.out.println("�̸� : " + data[2]);
			System.out.println("�̸� : " + data[3]);
			
			return false;
		} catch (FileNotFoundException e) {
			return true;
		} finally {
			if (br != null) br.close();
		}
	}
	
	public static void save(Member info) throws IOException {
		String dir = "D:\\java_io\\member\\";
		String filename = info.name + ".txt";
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(dir + filename,
				Charset.forName("UTF-8"))));
		
		pw.print(info);
		
		pw.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		// ���� ��� �׽�Ʈ
//		Member to_update = new Member("��ö��", -1, "C", null);
//		modify(to_update);
		
		try {
			// InputStreamReader : InputStream�� ���ڷ� ��ȯ (byte -> char)
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("�̸� > ");
			String name = br.readLine();
			
			if (checkNotName(name)) {
				System.out.print("���� > ");
				int age = Integer.parseInt(br.readLine());
				
				System.out.print("������ > ");
				String blood_type = br.readLine();
				
				System.out.print("��ȭ��ȣ > ");
				String tel = br.readLine();
				
				save(new Member(name, age, blood_type, tel));
				
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	
	}
}













