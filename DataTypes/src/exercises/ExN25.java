package exercises;

import java.util.*;


public class ExN25 {
		
	public static void ExN25 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 25");
		
		System.out.println("Введите строку данных");
		String s1 = scanner.nextLine();
		String[] str1 = s1.split(" ");
		
		Set<String> set = new HashSet<String>();
		
		for (int i = 0; i<str1.length;i++) {
			if(set.contains(str1[i])) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			set.add(str1[i]);
		}
		
				
		
		
		
		scanner.close();
	}
}