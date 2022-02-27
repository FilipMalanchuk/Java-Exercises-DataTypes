package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExN17 {
	
	public static class Student {
		String name = "";
		String surname = "";
		int math = 0;
		int physics = 0;
		int informatics = 0;
	}
		
	// --------main ;)
	public static void ExN17 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 17");
		System.out.println("Введите количество студентов");
		int n = scanner.nextInt();	
		scanner.nextLine();
		
		Student[] students = new Student[n];
		Student studSumm = new Student();
		
		for (int i = 0;i < n; i++) {
			System.out.println("Введите студента (имя фамилия матем физик информат)");
			students[i] = new Student();
			String str = scanner.nextLine();
			String[] curData = str.split(" ");
			students[i].name = curData[0];
			students[i].surname = curData[1];
			students[i].math = Integer.parseInt(curData[2]);
			students[i].physics = Integer.parseInt(curData[3]);
			students[i].informatics = Integer.parseInt(curData[4]);
			
			studSumm.math += students[i].math;
			studSumm.physics += students[i].physics;
			studSumm.informatics += students[i].informatics;
			
		}
		double mathSumm = (double)studSumm.math / n;
		double physicsSumm = (double)studSumm.physics / n;
		double informatSumm = (double)studSumm.informatics / n;
		
		DecimalFormat one = new DecimalFormat("#0.0");
		System.out.println("Средние баллы: " + one.format(mathSumm) + "  " + one.format(physicsSumm) + "  " + one.format(informatSumm));
		
		scanner.close();
	}
}