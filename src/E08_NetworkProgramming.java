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
	 # ��Ʈ��ũ ���α׷���
	 - 2�� �̻��� ��ǻ�Ͱ� �ڿ��� �Բ� ����ϴ� ���α׷��� ����� ��
	 - �ٸ� ��ǻ�Ϳ� ����ϱ� ���� IP/��������/��Ʈ��ȣ ���� ������ �̿��Ѵ�
	 
	 # IP�ּ�
	 - �ٸ� ��ǻ�͸� ã�ư��� ���� �ּ�
	 - �� �ڸ����� 0-255�̴� (0.0.0.0 ~ 255.255.255.255)
	 
	 # ��������
	 - ���α׷����� �ǻ������ �ϱ����� ��Ģ
	 - TCP, FTP, Telnet, SMTP
	 
	 # ��Ʈ��ȣ
	 - �� ��ǻ�Ϳ��� �������� ���α׷��� �� �ϳ��� �����ϱ� ���� ��ȣ
	 - IP�ּҿ� ��Ʈ��ȣ�� ���� �������� ���α׷��� ã�ư� �� �ִ�
	 - 0 ~ 65535
	 
	 # MAC�ּ�
	 - ���θ����� �ش� ��ǻ�͸� ��Ȯ�ϰ� ã�ư��� ���� ��ȣ
	 */
	
	// ���� ������ �� -> Ŭ���̾�Ʈ �����ϸ� ������Ǯ�� -> ������������ -> imput,ouputstream�����ִ�
	
	public static void main(String[] args) {
		
		try {
			// ���� ������ �����Ѵ�
			ServerSocket ss = new ServerSocket(3456);
			HashMap<String, Integer> connect_count = new HashMap<>();
			
			int count = 0;
			while(true) {
				// accept�޼��带 �����ϸ� ������ �ɶ����� ��ٸ���
				// �������� �����ϸ� ������ ����ڐl ������ ����ִ� Socket�� ��ȯ�Ѵ�
				System.out.println("[Server] ������ ��ٸ��� ��...");
				Socket s = ss.accept();
				
				System.out.printf("[Server] �޼����� ��ٸ��� ��.." 
				+ "(�� ������ : %d��)\n", ++count);
				BufferedReader br = new BufferedReader(
						new InputStreamReader(
								s.getInputStream()));
				
				String msg = br.readLine();
				
				// Socket�� getInetAddress�� ������ IP�ּҸ� �� ���ִ�
				// Socket���� IP�ּ� �̿ܿ���
				// ������ ���ῡ �ʿ��� �پ��� �������� ����ִ�
				String ipaddr = s.getInetAddress().toString();
				
				System.out.printf("(%s) %s\n", ipaddr, msg);
				
				if (connect_count.containsKey(ipaddr)) {
					connect_count.put(
							ipaddr, connect_count.get(ipaddr) + 1);
				} else {
					connect_count.put(ipaddr, 1);
				}
				
				if (count % 10 == 10) {
					System.out.println("(��) ������ 10�� ����");
				} else if (count == 100) {
					break;
				}
			}
			
			System.out.println("���α׷��� �����մϴ�");
			
			for (Map.Entry<String, Integer> entry : connect_count.entrySet()) {
				System.out.printf("%s���� ����Ƚ�� : %dȸ", entry.getKey(), entry.getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}



















