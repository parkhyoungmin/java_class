package quiz;

import java.util.Scanner;

public class B04_scoreToGrade {

	public static void main(String[] args) {
		
		// 점수를 입력 받으면 해당하는 등급을 출력해주는 프로그램을 작성해보세요
		/*
		 90이상 -> A
		 80이상 -> B
		 70이상 -> C
		 60이상 -> D
		 그 외 -> F
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 > ");
		int score = sc.nextInt();
		
		if (score > 100 || score < 0) {
			System.out.println("잘못 입력 하셨습니다.");
			return;
			// return; // main()을 끝낸다
//			System.exit(0); // 프로그램을 종료한다
		} else {
			if (score >= 90) {
				System.out.println("등급 -> A");
			} else if (score >= 80) {
				System.out.println("등급 -> B");
			} else if (score >= 70) {
				System.out.println("등급 -> C");
			} else if (score >= 60) {
				System.out.println("등급 -> D");
			} else {
				System.out.println("등급 -> F");
			}
		}
		System.out.println("프로그램 종료");
	}
}















