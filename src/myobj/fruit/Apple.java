//package myobj.fruit;
//
//// �� Ŭ���� �ϳ��� ���� �ϳ��� �ٶ����ϴ�
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
//		System.out.println("����");
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














