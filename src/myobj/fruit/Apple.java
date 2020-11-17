//package myobj.fruit;
//
//// ※ 클래스 하나당 파일 하나가 바람직하다
//public class Apple {
//	int calorie;
//	
//	public Apple(String color) {
//		calorie = 100;
//		
//		if (!color.equals("red")) {
//			throw new InvalidColorException();
//		}
//	}
//	
//	public Apple eat() {
//		
//		try {
//			if (calorie <= 0) {
//				throw new NomoreCalorieException();
//				
//			}
//		} catch(NomoreCalorieException e) {
//			System.out.println(e.getMessage());
//			return this;
//		}
//		System.out.println("먹음");
//		calorie -= 100;
//		return this;
//	}
//	
//	public static void main(String[] args) {
//		try {
//			new Apple("red").eat();
////		} catch (NomoreCalorieException e) {
////			System.out.println(e.getMessage());
////		}
////	}
//	
//	
//	
//}














