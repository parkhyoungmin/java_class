import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class E05_StreamToObject {

	/*
	 # Serializable �������̽�
	 - �ش� ��ü�� ����ȭ ������ ��ü�� �����
	 �� ����ȭ : �����͸� ���������� ��ȯ�ϴ°�
	 */
	
	static class Apple implements Serializable {
		
		private static final long serialVersionUID = 1L; // ���� �ö� ���ƾ�
		
		int size;
		String color;
		String local;
		
		public Apple(int size, String color, String local) {
			this.size = size;
			this.color = color;
			this.local = local;
		}
		
		@Override
		public String toString() {
			return size + "/" + color + "/" + local;
		}
	}
	
	// # ObjectOutputStream/ObjectInputStream�� ����
	//	��ü�� Stream���� �����ٴ� �� �ִ�
	
	public static void main(String[] args) {
		
		// AutoClose�� ������ Ŭ�������� try-with-resources�� �̿��� �� �ִ�
		// try-with-resources�� �̿��� �� �ִ�
		try (
			FileOutputStream fout = new FileOutputStream("D:\\java_io\\object.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			ObjectOutputStream oout = new ObjectOutputStream(bout);
				) {
			oout.writeObject(new Apple(9, "��Ȳ��", "�뱸"));
			oout.writeInt(12345);
			oout.writeObject(new Apple(11, "���λ�", "����"));
			oout.writeObject(new Apple(12, "�����", "����"));
			
			System.out.println("��ü ���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (
			FileInputStream fin = new FileInputStream("D:\\java_io\\object.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			ObjectInputStream oin = new ObjectInputStream(bin);
			) {
			// ObjectInputStream�� readObject��
			// �����͸� ObjectŸ������ �޾ƿ��� ������
			// ����� ����ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ϴ�
			System.out.println("���Ͽ��� �о�� ��ü");
			System.out.println(oin.readObject());
//			System.out.println(oin.readObject()); // ���� -> ������Ʈ��ü�ƴ϶�, ������� �־����
			System.out.println(oin.readInt());
			System.out.println(oin.readObject());
			System.out.println(oin.readObject());
			
			
		}	catch (Exception e) {
			e.printStackTrace();
		}
	}

}


















