import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D08_String {

	public static void main(String[] args) {
		
		String str = "apple/banana/orange/sagwa";
		
		// split : 문자열을 해당 문자 기준으로 잘라서 문자열 배열로 반환한다
		String[] fruits = str.split("/");
		System.out.println(Arrays.toString(fruits));
		
		// join : 전달한 문자를 이용해 문자열 배열을 합친다
		System.out.println(String.join(",", fruits));;
		
		// replace : 일치하는 문자열을 원하는 문자열로 교체한다
		str = "abc123@naver.com";
		str = str.replace("@naver.com", "@gmail.com");
		System.out.println(str);
		
		// replaceAll
		// - 해당 정규표현식과 일치하는 문자열을
		// 모두 원하는 문자열로 교체한 결과를 반환
		str = "My name is Bob. My name is sue. My name is John";
		System.out.println(str.replaceAll("is", "was"));
		
		// format : 서식을 이용해 원하는 문자열을 생성한다
		System.out.println(String.format("%d", 1));
		
		// contains : 문자열에 해당 문자열이 포함되어있는지를 검사한다
		System.out.println(str.contains("bob"));
		System.out.println(str.toLowerCase().contains("bob"));
		
		// equalsIgnoreCase() : 대소문자에 상관없이 일치하는지 검사한다
		System.out.println("Apple".equalsIgnoreCase("aPPLE"));
		
		// startWith(seq) : 문자열이 해당 문자열로 시작하는지 검사한다
		str = "image-fruit-apple.jpg";
		
		System.out.println("image-로 시작하나요?" + str.startsWith("image-"));
		
		// endsWith(seq) : 문자열이 해당 문자열로 끝나는지 검사한다
		System.out.println(".jpg로 끝나나요?" + str.endsWith(".jpg"));
		
		// getBytes : 문자열로 byte타입 배열을 생성한다
		str = "ABCDEFG";
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));
		
		str = "안녕하세요";
		
		try {
			// 문자열을 코드화 한다 (인코딩)
			byte[] utf8_bytes = str.getBytes("UTF-8");
			byte[] euc_bytes = str.getBytes("EUC-KR");
			
			System.out.println(Arrays.toString(utf8_bytes));
			System.out.println(Arrays.toString(euc_bytes));
			
			// 코드들을 문자열로 변환한다 (디코딩)
			// - 인코딩할때 사용했던 방식으로 디코딩하지 않으면 한글이 깨진다
			System.out.println(new String(utf8_bytes, "UTF-8"));
			System.out.println(new String(utf8_bytes, "EUC-KR")); // 한글 깨짐
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지않는 인코딩입니다" + e.getMessage());
		}
		
		// getChars : char[]에 문자열의 원하는 부분을 담아준다
		str = "Hello java python c-lang!!";
		
		char[] buffer = new char[10];
		str.getChars(6, 16, buffer, 0); 
		//   6부터 16까지 buffer의 0번까지 넣어 달라는뜻
		System.out.println(buffer);
		
		// substring(begin, end) : 문자열의 원하는 부분을 문자열로 반환한다
		System.out.println(str.substring(10)); // begin만 넣으면 끝까지 자른다
		System.out.println(str.substring(11, 17));
		
		// compareTo : Comparable 인터페이스 메서드
		System.out.println("compare result: " + "car".compareTo("jet"));
		
		// trim : 문자열 바깥쪽의 공백을 제거한다
		str = "	good bye	";
		System.out.println(str);
		System.out.println(str.trim().length());
		
		// valueOf : 다른 타입의 값을 문자열로 변환한다
		//			(해당 객체의 toString결과를 반환받는다)
		String ott = String.valueOf(123);
		System.out.println(ott);
		
		// StringTokenizer
		// - 문자열을 자르는데에 특화된 클래스
		// - split을 순차적으로 실행할 수 있다
		str = "99/88/77/66/55/44/33/22/11";
		
		// 자를 때 사용했던 문자열이 필요하다면 세 번째 파라미터를 true로 활성함
		StringTokenizer st = new StringTokenizer(str, "/");

		System.out.println("토큰 개수 : " + st.countTokens());
		
		// Tokens는 String타입으로 반환한다
		// Elements는 Object타입으로 반환한다
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// String 생성자
		
		
		
		
	}

}
















