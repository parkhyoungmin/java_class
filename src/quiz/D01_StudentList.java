package quiz;

import java.util.ArrayList;

public class D01_StudentList {

	/*
	 �л� Ŭ������ ��ҷ� ���� ArrayList��(group) �����ϰ�
	 �л��� 30�� �߰��غ�����
	 
	 1. 30���� ������ �ڵ����� �����ǵ��� ��������
	 
	 2. ��� �л��� �� ������ ��� ������ ���غ�����
	 
	 3. �� ����� ���غ�����.
	 */
	
	public static void main(String[] args) {
		
		ArrayList group = new ArrayList();
		System.out.println("KGITBANK 1���л����");
		for (int i = 0; i < 30; i++) {
			group.add(i, i + "�� �л�");
		}
		System.out.println(group);
		
		
		ArrayList kor_score_list = new ArrayList();
		ArrayList eng_score_list = new ArrayList();
		ArrayList math_score_list = new ArrayList();
		ArrayList total_avg_list = new ArrayList();
		System.out.println("KGITBANK 1�� ����������");
		for (int i = 0; i < 30; i++) {
			int kor = (int) (Math.random() * 101);
			int eng = (int) (Math.random() * 101);
			int math = (int) (Math.random() * 101);
			int total = kor + eng +math;
			double avg = total / 3;
			kor_score_list.add(i, i + "���л�:" + kor + "��");
			eng_score_list.add(i, i + "���л�:" + eng + "��");
			math_score_list.add(i, i + "���л�:" + math + "��");
			total_avg_list.add(i, i + "���л� ����:" + total + "��," + "���:" + avg);
		}
		System.out.println("����");
		System.out.println(kor_score_list);
		System.out.println("����");
		System.out.println(eng_score_list);
		System.out.println("����");
		System.out.println(math_score_list);
		System.out.println("�л� ���κ� ������ ���");
		System.out.println(total_avg_list);
		
		
	}
	
	
}


class Student {
	int kor, eng, math;
	int total;
	double avg;
	
	
	
}







