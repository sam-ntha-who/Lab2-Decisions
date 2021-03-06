import java.util.Scanner;

public class DecisionMaker {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String response;
		// name plz
		System.out.println("Hello, what's your name?");
		String name = scnr.nextLine();
		do {
			// give us a number 
			System.out.println(name + ", enter a number between 1 and 100.");
			int number = scnr.nextInt();
			// validation number within range
			if (number < 1 || number > 100) {
				System.out.println(name + ", please enter a number between 1 and 100.");
			// odd between 1 - 60
			} else if (number % 2 != 0 && number <= 60) {
				System.out.println(name + ", your number is " + number + " and odd.");
			// odd over 60
			} else if (number % 2 != 0 && number >= 60 && number <= 100) {
				System.out.println(name + ", your number is " + number + " and over 60.");
			// even less than 25
			} else if (number % 2 == 0 && number >= 2 && number <= 25) {
				System.out.println(name + ", your number is even and less than 25.");
			// even between 26 - 60
			} else if (number % 2 == 0 && number >= 26 && number <= 60) {
				System.out.println(name + ", your number is even.");
			// even greater than 60
			} else {
				System.out.println(name + ", your number is " + number + " and even.");
			}
			// please feed us more numbers
			System.out.println("Would you like to continue? (Yes/No)");
			response = scnr.next();
		} while (response.equalsIgnoreCase("Yes"));

		scnr.close();
		// no more numbers?
		System.out.println("Bye!");
	}
}