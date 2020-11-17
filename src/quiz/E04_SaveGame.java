package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class E04_SaveGame {

	/*
	 ��ǻ�Ϳ� �����ϴ� ������ ���������� ������ ������
	 ���α׷� ����� �ڵ����� �÷��̾��� ������ ���Ͽ� �����غ�����
	 
	 ���α׷� ����� ������ �ҷ������� ��������
	 */
	
//	static {
//		int rock = 0;
//		int scissor = 1;
//		int paper = 2;
//	}
	
	
	
	
	
	public String check_result() {
		int com = (int) (Math.random() * 3);	
		int player = (int) (Math.random() * 3);	
		
		String result = null;
		
		if (player == 0) {
			if (com == 0) {
				result = "���º�";
			} else if (com == 1) {
				result = "�¸�";
			} else {
				result = "�й�";
			}
		} else if (player == 1) {
			if (com == 0) {
				result = "�й�";
			} else if (com == 1) {
				result = "���º�";
			} else {
				result = "�¸�";
			}
		} else {
			if (com == 0) {
				result = "�¸�";
			} else if (com == 1) {
				result = "�й�";
			} else {
				result = "���º�";
			}
		}
		return result;
	}
	
	
	public void save_record(String game_result) throws IOException {
		String fileName = "D:\\java_io\\game\\record.txt";
		
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new FileWriter(fileName,
							Charset.forName("UTF-8"))));
		
		pw.print(game_result);
		pw.close();
	}

	
	public static void main(String[] args) throws IOException {
		E04_SaveGame user = new E04_SaveGame();
		
		// ���丮 ���� �޼���
		File dir = new File("D:\\java_io\\game");
		
		// ���丮�� �������� �������� ���� �����ϱ�
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		try {
			int win = 0, draw = 0, lose = 0;
			String result;
			
			int game_play = 0;
			while (game_play < 10) {
				result = user.check_result();
				if (result.equals("�¸�")) {
					win++;
				} else if (result.equals("���º�")) {
					draw++;
				} else if (result.equals("�й�")) {
					lose++;
				}
				System.out.println(result);
				game_play++;
			}
			System.out.println("���������� ��");
			user.save_record("���� ����\nwin: "+ win + " draw: " + draw + " lose: " + lose);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}



















