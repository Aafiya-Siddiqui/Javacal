import java.util.Scanner;

public class cal {

	// Method for addition
	public static double add(double a, double b) {
		return a + b;
	}

	// Method for subtraction
	public static double subtract(double a, double b) {
		return a - b;
	}

	// Method for multiplication
	public static double multiply(double a, double b) {
		return a * b;
	}

	// Method for division
	public static double divide(double a, double b) {
		if (b == 0) {
			System.out.println("Error: Cannot divide by zero.");
			return 0;
		}
		return a / b;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		boolean keepRunning = true;

		while (keepRunning) {
			System.out.println("\n--- Java Console Calculator ---");
			System.out.println("1. Addition (+)");
			System.out.println("2. Subtraction (-)");
			System.out.println("3. Multiplication (*)");
			System.out.println("4. Division (/)");
			System.out.println("5. Exit");
			System.out.print("Choose an operation (1-5): ");

			int choice = scanner.nextInt();

			if (choice == 5) {
				keepRunning = false;
				System.out.println("Exiting Calculator. Goodbye!");
				break;
			}

			// Get the two numbers
			System.out.print("Enter first number: ");
			double num1 = scanner.nextDouble();
			System.out.print("Enter second number: ");
			double num2 = scanner.nextDouble();

			double result = 0;

			switch (choice) {
			case 1:
				result = add(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 2:
				result = subtract(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 3:
				result = multiply(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 4:
				result = divide(num1, num2);
				if (num2 != 0) {
					System.out.println("Result: " + result);
				}
				break;
			default:
				System.out.println("Invalid choice. Please select from 1 to 5.");
			}
		}

		scanner.close();
	}
}
