package exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExN22 {
		
	public static void ExN22 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 22");
		System.out.println("Введите количество данных");
		int n = scanner.nextInt();	
		scanner.nextLine();
		Set<String> set = new HashSet<String>();
		for(int i = 0;i<n;i++) {
			System.out.println("Введите команду");
			String str = scanner.nextLine();
			String[] data = str.split(" ");
			String command = data[0];
			if (command.equals("ADD")) {
				String toAdd = data[1];
				set.add(toAdd);
			} else if (command.equals("PRESENT")) {
				String toCheck = data[1];
				if (set.contains(toCheck)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else if (command.equals("COUNT")) {
				System.out.println("Количество элементов в set = " + set.size());
			} else {
				System.out.println("Неверные данные");
			}
			
		}
		
		scanner.close();
	}
}