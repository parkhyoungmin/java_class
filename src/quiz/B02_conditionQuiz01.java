package quiz;

public class B02_conditionQuiz01 {

	public static void main(String[] args) {
		
		/*
		 [ �˸��� �񱳿����� �������� ]
		    
		1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		2. int�� ���� b�� ¦���� �� true		
		3. int�� ���� c�� 7�� ����� �� true
		4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true	
		5. int�� ���� d�� e�� ���̰� 30�� �� true	
		6. int�� ���� year�� 400���� ������ �������ų� 
		   �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
		7. �μ��� ö������ 2�� ������ true
		8. �μ��� ö������ ������ 3�� ������ true  
 		9. boolean�� ���� powerOn�� false�� �� true
		10. ���ڿ� �������� str�� "yes"�� �� true
		11. �ﰢ�� A�� �����ﰢ���̸� true
		 */
		int a = 15, b = 2, c = 7, hour = 13, year = 400, d = 50, e = 20;
		int min = 15, chul = 13;
		int min_birth = 5, chul_birth = 8;
		boolean powerOn = false;
		String str = "yes";
		int A1 = 90, A2 = 45, A3 = 45;
		
		// 1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		System.out.print("1. ");
		System.out.println(a > 10 && a < 20);
		
		//2. int�� ���� b�� ¦���� �� true		
		System.out.print("2. ");
		System.out.println(b % 2 == 0);
		
		//3. int�� ���� c�� 7�� ����� �� true
		System.out.print("3. ");
		System.out.println(c % 7 == 0);
		
		//4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true	
		System.out.print("4. ");
		System.out.println(!(hour < 0) && !(hour >= 24) && hour >= 12);
		
		//5. int�� ���� d�� e�� ���̰� 30�� �� true	
		System.out.print("5. ");
		System.out.println(d - e == 30 || e - d == 30);
		
//		6. int�� ���� year�� 400���� ������ �������ų� 
//		   �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
		System.out.print("6. ");
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		
		//7. �μ��� ö������ 2�� ������ true
		System.out.print("7. ");
		System.out.println(min - chul == 2);
		
		//8. �μ��� ö������ ������ 3�� ������ true  
		System.out.print("8. ");
		System.out.println(chul_birth - min_birth == 3);
		
		//9. boolean�� ���� powerOn�� false�� �� true
		System.out.print("9. ");
		System.out.println(!powerOn);
		
		//10. ���ڿ� �������� str�� "yes"�� �� true
		System.out.print("10. ");
		System.out.println(str.equals("yes"));
		
		// �ҹ��ڷ� �����ϴ� Ÿ�� - ���� �����Ѵ�
		// �빮�ڷ� �����ϴ� Ÿ�� - �ּҸ� �����Ѵ� (������)
		
		String str2 = "yes";
		String str3 = new String("yes");
		String str4 = str;
		
		//11. �ﰢ�� A�� �����ﰢ���̸� true
		System.out.print("11. ");
		System.out.println("�ﰢ�� A ���� -> A1, A2, A3");
		System.out.println(A1 == 90 || A2 == 90 || A3 == 90 && (A1 + A2 + A3 == 180));
		
	}

}







