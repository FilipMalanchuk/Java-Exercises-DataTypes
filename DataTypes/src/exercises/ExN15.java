package exercises;

import java.util.Scanner;

public class ExN15 {
	public static class point {
		double x = 0,y = 0;
	}
	public static void ExN15 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("«адание 15");
		System.out.println("¬ведите количество данных");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		point[] points = new point[100];
		
		// ввод данных
		for (int i = 0;i<n;i++) {
			System.out.println("¬ведите данныe");
			String str = scanner.nextLine();
			String[] curData = str.split(" ");
			points[i] = new point();
			
			points[i].x = Integer.parseInt(curData[0]);
			points[i].y = Integer.parseInt(curData[1]);
			
			
		}
		// изначальные точки дл€ сравнени€ и периметр их треугольника
		point first = points[0];
		point second = points[1];
		point third = points[2];
		double pMax = Math.sqrt(Math.pow(second.x - first.x, 2) + Math.pow(second.y - first.y, 2)) + Math.sqrt(Math.pow(third.x - first.x, 2) + Math.pow(third.y - first.y, 2)) + Math.sqrt(Math.pow(third.x - second.x, 2) + Math.pow(third.y - second.y, 2));
		
		// проверка каждой точки, если периметр с ней увеличитьс€, то показатели мен€ютьс€
		for(int i = 3;i<n;i++) { 
			// f s i = fs fi si
			double p1 = Math.sqrt(Math.pow(second.x - first.x, 2) + Math.pow(second.y - first.y, 2)) + Math.sqrt(Math.pow(points[i].x - first.x, 2) + Math.pow(points[i].y - first.y, 2)) + Math.sqrt(Math.pow(points[i].x - second.x, 2) + Math.pow(points[i].y - second.y, 2));
			// f i t = fi ft it
			double p2 = Math.sqrt(Math.pow(points[i].x - first.x, 2) + Math.pow(points[i].y - first.y, 2)) + Math.sqrt(Math.pow(third.x - first.x, 2) + Math.pow(third.y - first.y, 2)) + Math.sqrt(Math.pow(third.x - points[i].x, 2) + Math.pow(third.y - points[i].y, 2)); 
			// s i t = si st it
			double p3 = Math.sqrt(Math.pow(points[i].x - second.x, 2) + Math.pow(points[i].y - second.y, 2)) + Math.sqrt(Math.pow(third.x - second.x, 2) + Math.pow(third.y - second.y, 2)) + Math.sqrt(Math.pow(third.x - points[i].x, 2) + Math.pow(third.y - points[i].y, 2)); 
			boolean f1= false,f2= false,f3 = false;
			
			// где-то тут можно учитывать, что данные могут быть неправильными :)
			
			// сравнение результатов
			if(p1>pMax) {
				pMax = p1;
				f1 = true;
				f2 = false;
				f3 = false;
			}
			if (p2 > pMax) {
				pMax = p2;
				f1 = false;
				f2 = true;
				f3 = false;
			}
			if (p3 > pMax) {
				pMax = p3;
				f1 = false;
				f2 = false;
				f3 = true;
			}
			// проверка флагов, какую точку заменить из данных
			if (f1) {first = points[i];}
			else if (f2) {second = points[i];}
			else if (f3) {third = points[i];}
		}
		
		System.out.println(pMax);
		System.out.println("“очки: "+ first.x + ":"+ first.y + " : " +second.x + ":" + second.y + " : " + third.x + ":" + third.y);
		
		
		// при каких-то услови€х возникает баг иногда и выводит числа выше чем должно, так и не узнал из-за чего
		
		scanner.close();
	}
}