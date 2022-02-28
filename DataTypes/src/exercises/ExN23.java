package exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExN23 {
		
	public static void ExN23 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 23");
		
		System.out.println("Введите строку данных");
		String s1 = scanner.nextLine();
		String[] str1 = s1.split(" ");
		
		System.out.println("Введите строку данных");
		String s2 = scanner.nextLine();
		String[] str2 = s2.split(" ");
		
		Set<String> set = new HashSet<String>();
		
		for (int i = 0; i<str1.length;i++) {
			set.add(str1[i]);
		}
		for (int i = 0; i<str2.length;i++) {
			set.add(str2[i]);
		}
		
		System.out.print("Ответ: ");
		System.out.println(str1.length + str2.length - set.size());
		System.out.println("Set: " + set);
		
		
		
		
		scanner.close();
	}
}