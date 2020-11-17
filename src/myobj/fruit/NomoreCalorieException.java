package myobj.fruit;

// 예외 클래스를 상속받으면 "반드시 처리해야 하는 예외"가 된다
public class NomoreCalorieException extends Exception {

	public NomoreCalorieException() {
		super("못 먹는 사과");
	}
	
}
