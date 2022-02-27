package exercises;

import java.util.Scanner;

public class ExN13 {
	public static class point {
		int x = 0,y = 0,sum = 0;
	}
	public static void ExN13 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 13");
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
			points[i].sum = points[i].x + points[i].y;
			
			
		}
		// сортирую
		for (int i = 0;i<n;i++) {
			for (int y = i;y<n;y++) {
				if (points[i].sum > points[y].sum) {
					point temp = points[i];
					points[i] = points[y];
					points[y] = temp;
				}
				
			}		
			
		}
		double forAnsX = points[n-1].x - points[0].x;
		double forAnsY = points[n-1].y - points[0].y;
		double ans = Math.sqrt(Math.pow(forAnsX, 2) + Math.pow(forAnsY, 2));
		
		System.out.println(ans);
		
		scanner.close();
	}
}