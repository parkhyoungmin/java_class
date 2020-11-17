import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class D03_LinkedList {

	/*
	 # ���� ����Ʈ
	 - ArrayList���� ����/������ ������ ����Ʈ
	 - �߰��� ������ �Ͼ�� �� 
	 ArrayList�� ��� �����͸� �ڷ� �̵����Ѿ� ������ (Shift)
	 LinkedList�� ����� ��常 �ٲٸ� �Ǳ� ������ �ξ� ������
	 - ArrayList�� ������ ����, �б⿡ �����ϰ�
	 LinkedList�� ������ �߰� �� ������ �����ϴ�
	 */
	
	public static void main(String[] args) {
		
		LinkedList<String> mem = new LinkedList<>();
		
		mem.add("ȸ��1");
		mem.add("ȸ��2");
		mem.add("ȸ��3");
		
		mem.addFirst("�� �տ� �߰�");
		mem.addLast("�� �ڿ� �߰�");
		
		System.out.println(mem);
		
		System.out.println(mem.get(3));
		System.out.println(mem.getFirst());
		System.out.println(mem.getLast());
		
		// pop() : �� ���� �����͸� �����鼭 ����
		System.out.println("---pop����---");
		for (int i = 0, len = mem.size(); i < len; i++) {
			System.out.println(mem.pop());
			System.out.println("after pop :" + mem);
		}
		
		// �� LinkedList�� ����Ʈ, ����, ťó�� Ȱ���� �� �ִ�
		
		mem.add("ȸ��1");
		mem.add("ȸ��2");
		mem.add("ȸ��3");
		mem.add("ȸ��4");
		mem.add("ȸ��5");
		
		System.out.println(mem);
		
		// poll() : ù��° ��Ҹ� �����鼭 ��� (pop�� �Ȱ���)
		System.out.println(mem.poll());
		System.out.println(mem);
		
		// pollLast() : ���� �ֱٿ� �߰��� ��Ҹ� �����鼭 ��� (LIFO)
		System.out.println(mem.pollLast());
		System.out.println(mem);
		
		// peek() : ������ ���� �ʰ� �� ó�� ��Ҹ� ����ϱ�
		System.out.println(mem.peek());
		System.out.println(mem);
		
		// peekLast() : ������ ���� �ʰ� ������ ��Ҹ� ����ϱ�
		System.out.println(mem.peekLast());
		System.out.println(mem);
		
		// ArrayList�� �߰��� �߰��ϴ� ���� ������
		// LinkedList�� �߰��� �����͸� �߰��� �� �����ϴ�
		
		// �� �̻� �߰�/���� �Ͼ�� ���� �����͸� ArrayList�� ��ȯ�Ͽ� ����
		List<Integer> to_store = new ArrayList<>();
		
		
		
	}

}













