package exercises;

import java.util.Scanner;

public class ExN16 {
	public static class point {
		double x = 0,y = 0;
	}
	public static double returnP (double side1,double side2,double side3) {
		return (side1 + side2 +side3) / 2;
	}
	public static double returnTriSide (point a, point b) {
		return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
	}
	public static double returnS (double p, double side1, double side2, double side3) {
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
	
	// --------main ;)
	public static void ExN16 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 16");
		System.out.println("Введите количество данных");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		point[] points = new point[100];
		
		// ввод данных
		for (int i = 0;i<n;i++) {
			System.out.println("Введите данныe");
			String str = scanner.nextLine();
			String[] curData = str.split(" ");
			points[i] = new point();
			
			points[i].x = Integer.parseInt(curData[0]);
			points[i].y = Integer.parseInt(curData[1]);
			
			
		}
		// изначальные точки для сравнения и периметр их треугольника
		point first = points[0];
		point second = points[1];
		point third = points[2];
		
		double triSideLen1 = returnTriSide(second,first);
		double triSideLen2 = returnTriSide(third,first);
		double triSideLen3 = returnTriSide(third,second);
		
		double pMax = returnP(triSideLen1,triSideLen2,triSideLen3);
		double sMax = returnS(pMax,triSideLen1,triSideLen2,triSideLen3);
		
		// проверка каждой точки, если периметр с ней увеличиться, то показатели меняються
		for(int i = 3;i<n;i++) { 
			// f s i = fs fi si
			
			double p1 = returnP(returnTriSide(second,first),returnTriSide(points[i],first),returnTriSide(points[i],second));
			// f i t = fi ft it
			double p2 = returnP(returnTriSide(points[i],first),returnTriSide(third,first),returnTriSide(third,points[i])); 
			// s i t = si st it
			double p3 = returnP(returnTriSide(points[i],second),returnTriSide(third,second),returnTriSide(third,points[i]));
			boolean f1= false,f2= false,f3 = false;
			
			double s1 = returnS(p1,returnTriSide(second,first),returnTriSide(points[i],first),returnTriSide(points[i],second));
			double s2 = returnS(p2,returnTriSide(points[i],first),returnTriSide(third,first),returnTriSide(third,points[i]));
			double s3 = returnS(p3,returnTriSide(points[i],second),returnTriSide(third,second),returnTriSide(third,points[i]));
			
			// где-то тут можно учитывать, что данные могут быть неправильными :)
			
			
			// сравнение результатов
			if(s1>sMax) {
				sMax = s1;
				f1 = true;
				f2 = false;
				f3 = false;
			}
			if (s2 > sMax) {
				sMax = s2;
				f1 = false;
				f2 = true;
				f3 = false;
			}
			if (s3 > sMax) {
				sMax = s3;
				f1 = false;
				f2 = false;
				f3 = true;
			}
			// проверка флагов, какую точку заменить из данных
			if (f1) {first = points[i];}
			else if (f2) {second = points[i];}
			else if (f3) {third = points[i];}
		}
		
		System.out.println("Ответ" + sMax);
		System.out.println("Точки: "+ first.x + ":"+ first.y + " : " +second.x + ":" + second.y + " : " + third.x + ":" + third.y);
		System.out.println("Стороны: "+ returnTriSide(second,first) + " : " + returnTriSide(third,first) + " : " + returnTriSide(third,second));
		
		scanner.close();
	}
}
