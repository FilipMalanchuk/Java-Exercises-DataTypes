package exercises;

import java.util.Scanner;

public class ExN11 {
	public static void ExN11 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� 11");
		
		System.out.println("������� ���������� ������ "); // ������ ���������� ������
		int dataQuant = scanner.nextInt();
		scanner.nextLine();
		
		// ���������� ��� ����������� �������
		int longestDist = 0;
		String furthestDot = "";
		
		int i = dataQuant;
		while (i > 0) {
			System.out.println("������� ������ �" + (dataQuant - i + 1) + " � ������� (* *) ");
			String str = scanner.nextLine();
			// ����� ������ �� ������� � ������ � int ������
			String[] curData = str.split(" ");
			int[] curDataInt = new int[2];
			 curDataInt[0] = Integer.parseInt(curData[0]);
			 curDataInt[1] = Integer.parseInt(curData[1]);
			// ���������� ���������
			double curDist = Math.sqrt(Math.pow(curDataInt[0], 2) + Math.pow(curDataInt[1], 2));
			
			// ��������� � �������� ������� �����
			if ((int)curDist > longestDist) {
				longestDist = (int)curDist;
				furthestDot = str;
			}
			
			i--;
		}
		
		System.out.println("����� ������� ����� - " + furthestDot);
		
		
		
		scanner.close();
	}
}
