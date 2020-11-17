package quiz;

import java.util.Scanner;

public class B05_CheckWord {

	public static void main(String[] args) {
		
		/*
		 사용자로부터 단어를 하나 입력받고
		 첫 번째 단어와 마지막 단어가 일치하면 "OK"를 출력
		 아니라면 "NOT OK"를 출력해보세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요 >");
		String num = sc.nextLine();
		
		//null : 아무것도 없는 상태
		if (num == null || num == "") {
			System.out.println("단어가 올바르지 않습니다.");
			return;
		}
		
		System.out.println("입력한 단어 : " + num);
		
		
		
		char front = num.charAt(0);
		
		char end = num.charAt(num.length() - 1);
		
		if (front == end) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
		
		
		
		
	}

}













