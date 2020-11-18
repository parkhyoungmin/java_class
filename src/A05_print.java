
public class A05_print {

	public static void main(String[] args) {
		 
		// # 콘솔에 출력하기 위한 여러가지 함수들
		
		// 1. print()
		// - 줄을 자동으로 바꾸지 않으며 출력하는 함수
		System.out.print("Hello, World!");
		System.out.print("Hello, World!");
		System.out.print("Hello, World!\n");
		
		// 2. println()
		// - 줄을 자동으로 바꾸며 출력하는 함수
		// - ()에 전달한 데이터 맨 뒤에 '\n'을 추가하여 출력한다  
		// - ()에 아무것도 전달하지 않으면 '\n'만 출력한다
		System.out.println("Print, World!");
		System.out.println("");
		System.out.println("Hello, World!"); 
		
		// 3. printf()
		// - 서식 문자를 이용해 출력할 수 있는 함수
		// - 서식을 이용하는게 편리한 경우가 많다
		// - 줄을 자동으로 바꿔주지 않는다
		
		// 2020년 10월 20일 출력
		int year = 2020;
		int month = 10;
		int day = 20;
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
		
		// # printf에 사용하는 서식 문자들
		/*
		 %d		: 10진수 정수 (decimal)
		 %x, X	: 16진수 정수 (hexa decimal)
		 %o		: 8진수 정수 (octal)
		 %s		: 문자열 (String)
		 %c		: 문자 (Character)
		 %f		: 실수
		 */
		System.out.printf("%x%x%x\n", 10, 11, 12);
		System.out.printf("%s\n", "1등급");
		System.out.printf("%d[%c], %x(16), %o(8)\n", 65, 'A', 65, 65);
		
		// # 서식문자 옵션
		// ※ d만 넣어야 하는 것은 아님
		
		// %숫자d : 숫자만큼 칸을 확보한 뒤 오른쪽 정렬하여 출력한다
		System.out.printf("이름: %10s\n", "홍길동");
		System.out.printf("나이: %10d\n", 15);
		
		// 너무 길면 넘친다
		System.out.printf("이름: %10s\n", "ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		
		// %-숫자d : 숫자만큼 칸을 확보한 뒤 왼쪽 정렬하여 출력한다
		System.out.printf("%-10s : HonGilDon\n", "Full name");
		System.out.printf("%-10s : 15\n", "Age");
		
		// %0숫자d : 숫자만큼 칸을 확보한 뒤 빈칸에 0을 채워 출력한다
		System.out.printf("%010d\n", 123);
		System.out.printf("%020f\n", 123.123);
		
		// % + 숫자d : 양수 앞에도 부호를 붙이게 된다
		System.out.printf("오늘은 섭씨 '%+d℃'입니다.\n", -5);
		System.out.printf("오늘은 섭씨 '%+d℃'입니다.\n", 20);
		
		// %.숫자f : 소수 자릿수를 설정한다
		System.out.printf(".3\t: %.3f\n", 123.123);
		System.out.printf("default\t: %f\n", 123.123);
		System.out.printf(".10\t: %.10f\n", 123.123);
		System.out.printf(".20\t: %.20f\n", 123.123);
		System.out.printf(".255\t: %.255f\n", 123.123);
		
	}

}



















