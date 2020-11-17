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
	 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든후
	 프로그램 종료시 자동으로 플레이어의 전적을 파일에 저장해보세요
	 
	 프로그램 실행시 전적을 불러오도록 만들어보세요
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
				result = "무승부";
			} else if (com == 1) {
				result = "승리";
			} else {
				result = "패배";
			}
		} else if (player == 1) {
			if (com == 0) {
				result = "패배";
			} else if (com == 1) {
				result = "무승부";
			} else {
				result = "승리";
			}
		} else {
			if (com == 0) {
				result = "승리";
			} else if (com == 1) {
				result = "패배";
			} else {
				result = "무승부";
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
		
		// 디렉토리 생성 메서드
		File dir = new File("D:\\java_io\\game");
		
		// 디렉토리가 존재하지 않을때만 새로 생성하기
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		try {
			int win = 0, draw = 0, lose = 0;
			String result;
			
			int game_play = 0;
			while (game_play < 10) {
				result = user.check_result();
				if (result.equals("승리")) {
					win++;
				} else if (result.equals("무승부")) {
					draw++;
				} else if (result.equals("패배")) {
					lose++;
				}
				System.out.println(result);
				game_play++;
			}
			System.out.println("가위바위보 끝");
			user.save_record("나의 전적\nwin: "+ win + " draw: " + draw + " lose: " + lose);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}



















