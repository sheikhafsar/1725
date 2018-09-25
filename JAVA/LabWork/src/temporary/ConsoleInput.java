package temporary;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter integer: ");
		Integer number = scanner.nextInt();
		scanner.nextLine();
		System.out.println("number= " + number);
		System.out.print("enter string: ");
		String text = scanner.nextLine();
		System.out.println("text = " + text);
		scanner.close();
	}

}
