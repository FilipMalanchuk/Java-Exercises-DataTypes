package exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExN21 {
		
	public static void ExN21 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������� 21");
		System.out.println("������� ���������� ������");
		int n = scanner.nextInt();	
		scanner.nextLine();
		System.out.println("������� ������ ����� ������");
		String str = scanner.nextLine();
		String[] data = str.split(" ");
		
		Set<String> set = new HashSet<String>();
		for(int i = 0;i<n;i++) {
			set.add(data[i]);
		}
		System.out.println(set.size());
		
		scanner.close();
	}
}