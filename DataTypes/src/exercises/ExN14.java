package exercises;

import java.util.Scanner;

public class ExN14 {
	public static class point {
		int x = 0,y = 0;
		double dist = 0;
	}
	public static void ExN14 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 14");
		System.out.println("Введите количество данных");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		point[] points = new point[100];
		
		
		for (int i = 0;i<n;i++) {
			System.out.println("Введите данныe");
			String str = scanner.nextLine();
			String[] curData = str.split(" ");
			points[i] = new point();
			
			points[i].x = Integer.parseInt(curData[0]);
			points[i].y = Integer.parseInt(curData[1]);
			points[i].dist = Math.pow(points[i].x,2) + Math.pow(points[i].y,2);
			
			
		}
		// сортирую
		for (int i = 0;i<n;i++) {
			for (int y = i;y<n;y++) {
				if (points[i].dist > points[y].dist) {
					point temp = points[i];
					points[i] = points[y];
					points[y] = temp;
				}
				
			}		
			
		}
		for (int i = 0;i<n;i++) {
			System.out.println(points[i].x +" " + points[i].y);
		}
		
		
		scanner.close();
	}
}