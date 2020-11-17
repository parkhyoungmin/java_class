
public class A03_varTypes {

	public static void main(String[] args) {
		// # 변수의 선언
		// - 타입 
	
		/*
		 # 정수타입 (''문자 타입 값도 정수 취급을 받는다)
		 # 타입마다 데이터를 저장할 수 있는 크기가 다르다
		 - byte		(1byte) -128 	~ +127
		 - char		(2byte)	0	 	~ +65535 (65536개, 문자에 최적화)
		 - short	(2byte) -32768	~ +32767 (65536개)
		 - int		(4byte)	-22억	~ +22억  (2^32개)
		 - long		(8byte)	엄청 큰 범위
		 */
		
		byte _byte = 127;// 표현할 수 있는 숫자가 적은 대신 공간을 절약할 수 있다
		char _char = 10;
		short _short = 10;
		int _int = 10;
		// int의 범위를 벗어나는 숫자를 적을 땐 뒤에 L을 붙여야 한다
		long _long = 900000000000L; 
		
		/*
		 # 실수 타입 
		 
		 - float	(4byte)
		 - double	(8byte)
		 */
		
		float _float = 123.123F; // float값을 적을 땐 뒤에 f/F를 붙여야 한다
		double _double = 123.123;
		
		// # 리터럴(literal)
		// - 그냥 적는 값
		// - "", '', 소수, 소수f, 정수, 정수L ...
		// - 0숫자(8), 0x숫자(16), 0b숫자(2)
		// - true, false
		System.out.println("111(10) : " + 111);
		System.out.println("111(8) : " + 0111);
		
		// 2진수 : 0	1 10 11 100 101 110 ...
		// 8진수 : 1 2 3 4 5 6 7 10 ... 16 17 20..
		//16진수 : 0 1 2 3...9 A B C D E F 10
		
		System.out.println("111(16) : " + 0x111);

		/*
		 # 참/거짓 타입
		 - boolean : true, false 두 가지의 값만 대입할 수 있는 변수 타입
		 */
		boolean _boolean = false;
		boolean goonpil = false;
		boolean passExam = true;
		boolean complete = true;
		
		/*
		 	# 참조형 타입 (클래스 타입)
		 	- String : 문자열
		 	- 그 외 모든 클래스들..
		 	※ 대문자로 시작하는 모든 타입들은 참조형 타입이다.
		 */
		String hiMsg = "Hi, nice to meet you!";
		String byeMsg = "Good bye";
		
		System.out.println(hiMsg);
		System.out.println(byeMsg + byeMsg + byeMsg);
		
	}

}










