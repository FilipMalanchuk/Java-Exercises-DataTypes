package exercises;

import java.util.*;


public class ExN24 {
		
	public static void ExN24 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 24");
		
		System.out.println("Введите строку данных");
		String s1 = scanner.nextLine();
		String[] str1 = s1.split(" ");
		
		System.out.println("Введите строку данных");
		String s2 = scanner.nextLine();
		String[] str2 = s2.split(" ");
		
		Set<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		for (int i = 0; i<str1.length;i++) {
			set.add(str1[i]);
		}
		for (int i = 0; i<str2.length;i++) {
			if (set.contains(str2[i])) {
				set2.add(str2[i]);
			}
		}
		
		List<String> sortedList = new ArrayList<String>(set2);
		Collections.sort(sortedList);
		
		System.out.println(sortedList.toString());		
		
		
		
		scanner.close();
	}
}