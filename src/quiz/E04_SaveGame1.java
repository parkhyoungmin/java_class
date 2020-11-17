package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E04_SaveGame1 {
	
	static class Game {
		
		public static String SAVEPATH = "D:\\java_io\\game\\save.sav";
		public static File SAVEDIR = new File("D:\\java_io\\game");
		public static File SAVEFILE = new File("D:\\java_io\\game\\save.sav");
		
		static {
			SAVEPATH = "D:\\java_io\\game\\save.sav";
			SAVEDIR = new File("D:\\java_io\\game");
			SAVEFILE = new File(SAVEDIR, "save.sav");
		}
		
		int win;
		int draw;
		int lose;
		int money;
		
		// input
		FileInputStream fin = null;
		DataInputStream din = null;
		BufferedReader br = null;
		
		// ouput
		FileOutputStream fout = null;
		DataOutputStream dout = null;
		
		public Game() {
			// 디렉토리 없는 경우 디렉토리 먼저 생성한다
			File dir = new File("D:\\java_io\\game");
			
			if (!dir.exists()) {
				dir.mkdir();
			}
			
			// 새 게임 인스턴스가 생성되면 파일에서 전적을 읽은 뒤
			// 변수들을 초기화 한다
			try {
				fin = new FileInputStream(new File(dir, "save.sav"));
				din = new DataInputStream(fin);
				
				win = din.readInt();
				draw = din.readInt();
				lose = din.readInt();
				money = din.readInt();
				
			} catch (FileNotFoundException e) {
				// 게임을 처음 실행했을 때 발생하는 예외
				System.out.println("처음 실행입니다. 세이브 파일을 생성합니다");
				try {
					fout = new FileOutputStream(new File(dir, "save.sav"));
					dout = new DataOutputStream(fout);
					
					dout.writeInt(0); // win
					dout.writeInt(0); // draw
					dout.writeInt(0); // lose
					dout.writeInt(5000); // money
					
					// 데이터를 쓴 뒤 인스턴스 변수들을 초기화 한다
					win = 0;
					draw = 0;
					lose = 0;
					money = 5000;
					
				} catch (Exception e1) {
					System.err.println("세이브 파일 생성 도중 에러 발생 : " + e1.getMessage());
				} finally {
					try {
						if (dout != null) dout.close();
						if (fout != null) fout.close();
					} catch (Exception e1) {}
				}
			} catch (IOException e) {
				System.err.println("데이터 읽기 도중 에러 발생 : " + e.getMessage());
			} finally {
				try {
					if (din != null) din.close();
					if (fin != null) fin.close();
				} catch (IOException e) {}
			}
			print_game();
		}
		
		public void print_game() {
			System.out.println("플레이어 정보");
			System.out.printf("%d승 %d무 %d패\t%d원 보유중\n", win, draw, lose, money);
		}
		
		public void execute_game() throws IOException {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			int com_select = (int) (Math.random()*3); 
			int user_select = -1;
			while (true) {
				try {
					System.out.print("가위(0), 바위(1), 보(2) > ");
					user_select = Integer.parseInt(br.readLine());
					
					if (user_select < 0 || user_select > 2) {
						throw new NumberFormatException("범위를 벗어났습니다");
					}
					break;
				} catch (NumberFormatException e) {
					System.out.println("제대로 선택해주세요");
				} catch (IOException e) {
					e.printStackTrace();;
				}
			}
			
			try {
				System.out.print("가");
				Thread.sleep(200);
				System.out.print("위");
				Thread.sleep(200);
				System.out.print("바");
				Thread.sleep(200);
				System.out.print("위");
				Thread.sleep(200);
				System.out.print("보");
				Thread.sleep(200);
				System.out.print("!");
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("내선택: " + user_select);
			System.out.println("컴퓨터선택: " + com_select);
			
			if (user_select == com_select) {
				draw++;
				System.out.println("무승부!");
			} else if (user_select == (com_select + 1) % 3) {
				win++;
				money += 500;
				System.out.println("유저승리!");
			} else if ((user_select + 1) % 3 == com_select) {
				lose++;
				money -= 500;
				System.out.println("유저패배!");
			}
			print_game();
		}
		
		private void save() {
			try {
				fout = new FileOutputStream("D:\\java_io\\game\\save.sav");
				dout = new DataOutputStream(fout);
				
				dout.writeInt(win);
				dout.writeInt(draw);
				dout.writeInt(lose);
				dout.writeInt(money);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (dout != null) dout.close();
					if (fout != null) fout.close();
				} catch (Exception e) {}
			}
			}
		}
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		Game game = new Game();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			game.execute_game();
			
			System.out.println("계속 하시겠습니까? (Y/N)");
			if (!"Y".equalsIgnoreCase(br.readLine())) {
				game.save();
				System.out.println("저장되었습니다. 프로그램을 종료합니다");
				break;
			}
		}

	}

}














