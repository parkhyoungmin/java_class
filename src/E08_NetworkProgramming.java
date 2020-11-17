import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class E08_NetworkProgramming {

	/*
	 # 네트워크 프로그래밍
	 - 2대 이상의 컴퓨터가 자원을 함께 사용하는 프로그램을 만드는 것
	 - 다른 컴퓨터와 토신하기 위해 IP/프로토콜/포트번호 등의 개념을 이용한다
	 
	 # IP주소
	 - 다른 컴퓨터를 찾아가기 위한 주소
	 - 각 자리수가 0-255이다 (0.0.0.0 ~ 255.255.255.255)
	 
	 # 프로토콜
	 - 프로그램간에 의사소통을 하기위한 규칙
	 - TCP, FTP, Telnet, SMTP
	 
	 # 포트번호
	 - 한 컴퓨터에서 여러가지 프로그램들 중 하나를 선택하기 위한 번호
	 - IP주소와 포트번호를 통해 상태편의 프로그램을 찾아갈 수 있다
	 - 0 ~ 65535
	 
	 # MAC주소
	 - 내부망에서 해당 컴퓨터를 정확하게 찾아가기 위한 번호
	 */
	
	// 서버 연결대기 중 -> 클라이언트 접속하면 대기상태풀림 -> 소켓정보나옴 -> imput,ouputstream쓸수있다
	
	public static void main(String[] args) {
		
		try {
			// 서버 소켓을 생성한다
			ServerSocket ss = new ServerSocket(3456);
			HashMap<String, Integer> connect_count = new HashMap<>();
			
			int count = 0;
			while(true) {
				// accept메서드를 실행하면 연결이 될때까지 기다린다
				// 누군가가 접속하면 접속한 사용자릐 정보를 담고있는 Socket을 반환한다
				System.out.println("[Server] 연결을 기다리는 중...");
				Socket s = ss.accept();
				
				System.out.printf("[Server] 메세지를 기다리는 중.." 
				+ "(총 접속자 : %d명)\n", ++count);
				BufferedReader br = new BufferedReader(
						new InputStreamReader(
								s.getInputStream()));
				
				String msg = br.readLine();
				
				// Socket의 getInetAddress로 상대방의 IP주소를 알 수있다
				// Socket에는 IP주소 이외에도
				// 상대와의 연결에 필요한 다양한 정보들이 들어있다
				String ipaddr = s.getInetAddress().toString();
				
				System.out.printf("(%s) %s\n", ipaddr, msg);
				
				if (connect_count.containsKey(ipaddr)) {
					connect_count.put(
							ipaddr, connect_count.get(ipaddr) + 1);
				} else {
					connect_count.put(ipaddr, 1);
				}
				
				if (count % 10 == 10) {
					System.out.println("(축) 접속자 10명 돌파");
				} else if (count == 100) {
					break;
				}
			}
			
			System.out.println("프로그램을 종료합니다");
			
			for (Map.Entry<String, Integer> entry : connect_count.entrySet()) {
				System.out.printf("%s님의 조배횟수 : %d회", entry.getKey(), entry.getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}



















