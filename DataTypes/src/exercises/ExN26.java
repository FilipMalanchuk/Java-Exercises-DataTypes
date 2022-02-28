package exercises;

import java.math.*;
import java.util.*;


public class ExN26 {
		
	public static void ExN26 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 26(25 a + b = c)");
		
		System.out.println("Введите число 1");
		String s1 = scanner.nextLine();
		System.out.println("Введите число 2");
		String s2 = scanner.nextLine();
		System.out.println("Введите число 3");
		String s3 = scanner.nextLine();
		
		double sum = Double.parseDouble(s1) + Double.parseDouble(s2);
		
		
		BigDecimal bd = new BigDecimal(sum).setScale(6, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
		
		if (newInput == Double.parseDouble(s3)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		} 
		
		
		scanner.close();
	}
}