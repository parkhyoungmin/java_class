import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E02_BufferedIO {

	/*
	 # Buffered I/O
	 - ���۸� �̿��� �б�/���� ������ ����Ű�� Ŭ����
	 - ���۶�? �����͸� ��/����ϱ� ���� �ӽ÷� �����صδ� �迭
	 
	 # ���۸� �̿��ؾ��ϴ� ����
	 - ���۾��� �б�/���⸦ �ϰԵǸ� ������� �ʹ� ���� �Ͼ��
	 
	 ex) Java programming�� ���� ���
	 -> �⺻ OutputStream���� �� ���ھ� ���� 16���� ����� �߻��Ѵ�
	 -> �迭�� �����س��� �ѹ��� ���� 1���� ��¸����� ����� ����
	 */
	
	public static void main(String[] args) {
		// �׽�Ʈ�� ���̵�����
		StringBuilder text = new StringBuilder();
		
		for (int i = 0; i < 6; i++) {
			text.append(i + " �ȳ��ϼ���\n");
		}
		
		// # java.io.BufferedOutputStream
		// - �����ڿ� OutputStream�� �䱸�Ѵ�
		// - OutputStream�� ����� ��Ҹ� �����ϴ� �뵵�� ���
		// - BufferedOutputStream�� ���� ���׷��̵��� �뵵�� ���
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\bufferedout.txt");
			
			// # ������ ũ�Ⱑ 1024�� ���
			// - �����͸� �ش� OutputStream�� ���� 1024����Ʈ�� �����Ͱ�
			//	�� ���̸� ����Ѵ�
			// - Ȥ�� ���α׷��Ӱ� flush()�޼��带 ȣ���� �� ����Ѵ�
			// - Ȥ�� close�� �߻��ϸ� ���� ���� �����͸� ����Ѵ�
			BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
			
			// batch processing (�ϰ� ó��)
			byte[] data = new String(text).getBytes();
			
			bout.write(data);
			// �������� �߰� OutputStream�� ����ϴ� ���
			// ���� ���߿� ������ ������� �ݴ´�
			bout.close();
			fout.close();
			
			System.out.println("���� ��� ��");
		} catch (FileNotFoundException e) {
			System.err.println("���� ��ã��");
		} catch (IOException e) {
			System.err.println("IO���� �߻��� ����");
		}
		
		
		// # java.io.BufferedInputStream
		// - InputStream�� �����ڷ� �䱸�Ѵ�
		try {
			FileInputStream fin = new FileInputStream("D:\\java_io\\bufferedout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin, 1024);
			
			// # read()�� �⺻ �����ε�
			// - �� ����Ʈ�� int������ �о�´�
			
			// # read(byte[]) �����ε�
			// - ������ byte[]�� ũ�⸸ŭ�� byteä���ش�
			// - ������ �迭 �߿� �� byte�� ä�������� ��ȯ�Ѵ� (len)
			
			// # read(byte[], off, len)
			// - ������ byte[]�߿��� off���� len�������� �����͸� ä���ش�
			// - ������ �迭�� �� byte�� ä������ ��ȯ�Ѵ�
			
			int b;
			while ((b = bin.read()) != -1) {
				System.out.println((char) b);
			}
			
			bin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}













