package quiz;

import java.util.ArrayList;

public class D01_StudentList {

	/*
	 학생 클래스를 요소로 갖는 ArrayList를(group) 생성하고
	 학생을 30명 추가해보세요
	 
	 1. 30명의 점수가 자동으로 설정되도록 만들어보세요
	 
	 2. 모든 학생의 총 점수와 평균 점수를 구해보세요
	 
	 3. 반 평균을 구해보세요.
	 */
	
	public static void main(String[] args) {
		
		ArrayList group = new ArrayList();
		System.out.println("KGITBANK 1반학생목록");
		for (int i = 0; i < 30; i++) {
			group.add(i, i + "번 학생");
		}
		System.out.println(group);
		
		
		ArrayList kor_score_list = new ArrayList();
		ArrayList eng_score_list = new ArrayList();
		ArrayList math_score_list = new ArrayList();
		ArrayList total_avg_list = new ArrayList();
		System.out.println("KGITBANK 1반 국영수점수");
		for (int i = 0; i < 30; i++) {
			int kor = (int) (Math.random() * 101);
			int eng = (int) (Math.random() * 101);
			int math = (int) (Math.random() * 101);
			int total = kor + eng +math;
			double avg = total / 3;
			kor_score_list.add(i, i + "번학생:" + kor + "점");
			eng_score_list.add(i, i + "번학생:" + eng + "점");
			math_score_list.add(i, i + "번학생:" + math + "점");
			total_avg_list.add(i, i + "번학생 총점:" + total + "점," + "평균:" + avg);
		}
		System.out.println("국어");
		System.out.println(kor_score_list);
		System.out.println("영어");
		System.out.println(eng_score_list);
		System.out.println("수학");
		System.out.println(math_score_list);
		System.out.println("학생 개인병 총점과 평균");
		System.out.println(total_avg_list);
		
		
	}
	
	
}


class Student {
	int kor, eng, math;
	int total;
	double avg;
	
	
	
}







