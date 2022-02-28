package exercises;

import java.math.*;
import java.util.*;


public class ExN27 {
	public static class ration{
		double proteins = 0;
		double fats = 0;
		double carbohy = 0;
		double quant = 0;
		
	}
		
	public static void ExN27 () {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Задание 27(26)");
		
		System.out.println("Введите потребности животного в белках жирах углеводах");
		String[] animalNeed = scanner.nextLine().split(" ");
		double proteinsAnim = Double.parseDouble(animalNeed[0]);
		double fatsAnim = Double.parseDouble(animalNeed[1]);
		double carbohyAnim = Double.parseDouble(animalNeed[2]);
		System.out.println("Введите количество рационов");
		int animalGet = scanner.nextInt();
		scanner.nextLine();
		
		ration[] rations = new ration[animalGet];
		ration rationsSumm = new ration();
		
		// добавляем данные каждому рациону
		for(int i = 0;i < animalGet;i++) {
			System.out.println("Введите данные о рационе №"+(i+1));
			String[] rationData = scanner.nextLine().split(" ");
			rations[i] = new ration();
			rations[i].proteins = Double.parseDouble(rationData[0]);
			rations[i].fats = Double.parseDouble(rationData[1]);
			rations[i].carbohy = Double.parseDouble(rationData[2]);
			rations[i].quant = Double.parseDouble(rationData[3]);
		}
		// суммируем данные о рационах
		for(int i = 0;i<animalGet;i++) {
			rationsSumm.proteins += rations[i].proteins * rations[i].quant;
			rationsSumm.fats += rations[i].fats * rations[i].quant;
			rationsSumm.carbohy += rations[i].carbohy * rations[i].quant;
		}
		
		boolean noFlag = true;
		if (rationsSumm.proteins >=proteinsAnim) {
			if (rationsSumm.fats >=fatsAnim) {
				if (rationsSumm.carbohy >=carbohyAnim) {
					System.out.println("YES");
					noFlag = false;
				}
			}
		}
		if(noFlag) {
			System.out.println("NO");
		}
		
		
		scanner.close();
	}
}