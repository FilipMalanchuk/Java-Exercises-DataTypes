package exercises;

import java.util.Scanner;

public class ExN11 {
	public static void ExN11 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание 11");
		
		System.out.println("Введите количество данных "); // вводим количество данных
		int dataQuant = scanner.nextInt();
		scanner.nextLine();
		
		// переменные для определение дальней
		int longestDist = 0;
		String furthestDot = "";
		
		int i = dataQuant;
		while (i > 0) {
			System.out.println("Введите данные №" + (dataQuant - i + 1) + " в формате (* *) ");
			String str = scanner.nextLine();
			// делим строку по пробелу и парсим в int массив
			String[] curData = str.split(" ");
			int[] curDataInt = new int[2];
			 curDataInt[0] = Integer.parseInt(curData[0]);
			 curDataInt[1] = Integer.parseInt(curData[1]);
			// определяем растояние
			double curDist = Math.sqrt(Math.pow(curDataInt[0], 2) + Math.pow(curDataInt[1], 2));
			
			// проверяем и заменяем дальнюю точку
			if ((int)curDist > longestDist) {
				longestDist = (int)curDist;
				furthestDot = str;
			}
			
			i--;
		}
		
		System.out.println("Самая дальная точка - " + furthestDot);
		
		
		
		scanner.close();
	}
}
