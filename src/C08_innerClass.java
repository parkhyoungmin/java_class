
public class C08_innerClass {

	// Ŭ���� ���ο� Ŭ���� ����ϱ�
	public static void main(String[] args) {
		AppleBox box = new AppleBox(20);
		
		System.out.println(box.box[0].color);
		
		// �ܺο��� �ٸ� Ŭ������ ���� Ŭ���� ����ϱ� (���� ����)
		AppleBox.Apple apple01 = new AppleBox(10).new Apple();
		
		System.out.println(apple01.color);
		System.out.println(apple01.size);
	}
}

// # outer class
// - ���� �����ڿ� default�� public�� ����� �� �ִ�
class AppleBox {
	
	Apple[] box;
	
	public AppleBox(int size) {
		box = new Apple[size];
		for (int i = 0; i < box.length; i++) {
			// ���� Ŭ���� ������ �ڿ��̱� ������ this�� �����ϰ� ����� �� �ִ�
			box[i] = new Apple(); //this.new Apple()
		}
	}
	
	// # inner class
	// - AppleBox�� �ν��Ͻ��� ����������� inner class Apple�� �������� �ʴ´�
	// - ���� �����ڸ� �����Ӱ� ����� �� �ִ�
	// - outer class�� �ʵ忡 ���� �޶����� Ŭ������ �ۼ��� �� �ִ� (���� Ŭ���� �ۼ�)
	public class Apple {
		int color;
		int size;
	}
	
}











