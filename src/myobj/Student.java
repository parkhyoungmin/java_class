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
		name = String.format("테스트학생%04d", stu_count++);
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
	public int compareTo(Student next_student) { // 지금 학생 다음 학생 비교해서 어떤것으로 할지 결정
		// "이 클래스는 크기 비교를 이런식으로 하겠다"를 정의하는 곳
		// - 양수를 리턴 : 현재 객체가 매개변수로 오는 객체보다 더 큼
		// - 음수를 리턴 : 현재 객체가 다음 객체보다 더 작음
		// - 0을 리턴 : 현재 객체와 다음 객체의 크기가 같음
		
		
		
//		if (this.math > next_student.math) {
//			// 수학점수가 더 큰 학생은 정렬시 뒤에 나왔으면 좋겠다는 뜻
//			return 1;
//		} else if (this.math < next_student.math) {
//			// 수학점수가 더 작은 학생은 정렬시 앞으로 나왔으면 좋겠다는 뜻
//			return -1;
//		} else {
//			// 수학 점수가 같을 떈 그냥 내버려두겠다는 뜻
//			return 0;
//		}
		
		
		// 영어성적순 순서
		if (this.eng > next_student.eng) {
			return -1;
		} else if (this.eng < next_student.eng) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	
	
}












