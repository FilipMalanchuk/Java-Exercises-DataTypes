import java.util.Scanner;
import exercises.*;
public class DataTypes {

	public static void main(String[] args) {
		System.out.println("Введите номер задания (11-19, 21-26)");
		Scanner scanner = new Scanner(System.in);
		int exToCheck = scanner.nextInt();
		
		switch (exToCheck) {
		
		case 11:ExN11.ExN11();
		break;
		case 12:ExN12.ExN12();
		break;
		case 13:ExN13.ExN13();
		break;
		case 14:ExN14.ExN14();
		break;
		case 15:ExN15.ExN15();
		break;
		case 16:ExN16.ExN16();
		break;
		case 17:ExN17.ExN17();
		break;
		case 18:ExN18.ExN18();
		break;
		case 19:ExN19.ExN19();
		break;
		case 21:ExN21.ExN21();
		break;
		case 22:ExN22.ExN22();
		break;
		case 23:ExN23.ExN23();
		break;
		case 24:ExN24.ExN24();
		break;
		case 25:ExN25.ExN25();
		break;
		case 26:ExN26.ExN26();
		break;
		case 27:ExN27.ExN27();
		break;
		
		
		
		
		
		default: System.out.println("Нету такого задания");
		break;
		}
		System.out.println("Программа отработала");

	}

}
