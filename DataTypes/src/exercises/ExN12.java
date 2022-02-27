package exercises;

import java.util.Scanner;

public class ExN12 {
	public static class point {
		int x = 0,y = 0;
	}
	public static void ExN12 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 12");
		System.out.println("Введите количество данных");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		point[] points = new point[100];
		point summ = new point();
		
		for (int i = 0;i<n;i++) {
			System.out.println("Введите данныe");
			String str = scanner.nextLine();
			String[] curData = str.split(" ");
			points[i] = new point();
			
			points[i].x = Integer.parseInt(curData[0]);
			points[i].y = Integer.parseInt(curData[1]);
			
			summ.x += points[i].x;
			summ.y += points[i].y;
		}
		
		double ansX = (double)summ.x / n;
		double ansY = (double)summ.y / n;
		
		System.out.println(ansX + ":" + ansY);
		
		scanner.close();
	}
}