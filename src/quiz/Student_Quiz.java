//package quiz;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//public class Student_Quiz {
//
//	/*
//	 �л� Ŭ������ ��ҷ� ���� ArrayList��(group) �����ϰ�
//	 �л��� 30�� �߰��غ�����
//	 
//	 1. 30���� ������ �ڵ����� �����ǵ��� ��������
//	 
//	 2. ��� �л��� �� ������ ��� ������ ���غ�����
//	 
//	 3. �� ����� ���غ�����.
//	 */
//	
//	public static void main(String[] args) {
//		ArrayList<Student> group = new ArrayList<>();
//		
//		int num_of_student = 30;
//		
//		double sum = 0;
//		for (int i = 0; i < 30; i++) {
//			group.add(new Student());
//			sum += group.get(i).avg;
//		}
//		
//		// println �Լ��� ��� �ش� ��ü�� tostring()�޼��带 ȣ���Ѵ�
//		System.out.println(group);
//		System.out.println("�� ���: " + sum / (double) num_of_student);
//	}
//}
//
//
//class Student {
//	int kor, eng, math;
//	int total;
//	double avg;
//	String name;
//	
//	final static int NUM_OF_SUBJECTS = 3;
//	static int stu_count = 0;
//	
//	public Student() {
//		Random ran = new Random();
//		kor = ran.nextInt(51) + 50;
//		eng = ran.nextInt(51) + 50;
//		math = ran.nextInt(51) + 50;
//		name = String.format("�׽�Ʈ�л�%04d", stu_count++);
//		
//		total = kor + eng +math;
//		avg = total / (double) NUM_OF_SUBJECTS;
//	}
//	
//	// toString()�� Object Ŭ������ �޼����̱� ������
//	// ��� ��ü�� ������ �ִ�
//	@Override
//	public String toString() {
//		// '�� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�?' �� ���� ���Ǹ� �ϴ� �޼���
//		
//		// #String.format()
////		   printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
////		return "[" + name + "/" + total + "/" + avg + "]";
//		
//		// �ν��Ͻ��޼��� 	- + .charat(..)
//		// static�޼��� 	(int Strng char.....). + -
//		return String.format("\n[%S/%d/%.2f]", name, total, avg);
//		
//		
//	}
//	
//}
//
//
//
//
//
//
//
//
//
//


