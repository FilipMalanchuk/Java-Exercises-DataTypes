package exercises;

import java.util.Scanner;

public class ExN18 {
	
	public static class Student {
		String name = "";
		String surname = "";
		int math = 0;
		int physics = 0;
		int informatics = 0;
		double middle = 0;
	}
		
	// --------main ;)
	public static void ExN18 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 18");
		System.out.println("Введите количество студентов");
		int n = scanner.nextInt();	
		scanner.nextLine();
		
		Student[] students = new Student[n];
		Student[] studentsBest = new Student[n];
		
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
			students[i].middle = (students[i].math + students[i].physics + students[i].informatics) / 3;
			
		}
		double maxMiddle = 0;
		for (int i = 0; i<n;i++) {
			if(maxMiddle < students[i].middle) {
				maxMiddle = students[i].middle;
			}
		}
		for (int i = 0; i<n;i++) {
			if(maxMiddle == students[i].middle) {
				System.out.println(students[i].name + " " + students[i].surname);
			}
		}
		
		scanner.close();
	}
}