package myobj;

import java.util.Random;

public class Student implements Comparable<Student> {
	private int kor, eng, math;
	private String name;
	
	final static int NUM_OF_SUBJECTS = 3;
	static int stu_count = 0;
	
	public Student() {
		Random ran = new Random();
		kor = ran.nextInt(51) + 50;
		eng = ran.nextInt(51) + 50;
		math = ran.nextInt(51) + 50;
		name = String.format("�׽�Ʈ�л�%04d", stu_count++);
	}
	
	public double getTotal() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return (kor + eng + math) / (double) NUM_OF_SUBJECTS;
	}

	@Override
	public String toString() {
		return String.format("\n%S/%d/%d/%d/%.2f", name, kor, eng, math, getAvg());	
	}

	@Override
	public int compareTo(Student next_student) { // ���� �л� ���� �л� ���ؼ� ������� ���� ����
		// "�� Ŭ������ ũ�� �񱳸� �̷������� �ϰڴ�"�� �����ϴ� ��
		// - ����� ���� : ���� ��ü�� �Ű������� ���� ��ü���� �� ŭ
		// - ������ ���� : ���� ��ü�� ���� ��ü���� �� ����
		// - 0�� ���� : ���� ��ü�� ���� ��ü�� ũ�Ⱑ ����
		
		
		
//		if (this.math > next_student.math) {
//			// ���������� �� ū �л��� ���Ľ� �ڿ� �������� ���ڴٴ� ��
//			return 1;
//		} else if (this.math < next_student.math) {
//			// ���������� �� ���� �л��� ���Ľ� ������ �������� ���ڴٴ� ��
//			return -1;
//		} else {
//			// ���� ������ ���� �� �׳� �������ΰڴٴ� ��
//			return 0;
//		}
		
		
		// ������� ����
		if (this.eng > next_student.eng) {
			return -1;
		} else if (this.eng < next_student.eng) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	
	
}












