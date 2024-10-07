/**
 * File: ch12/Calculator.java
 * Package: ch12
 * @author Christopher Williams
 * Created on: Apr 18, 2016
 * Description:  Create a simple text-based calculator to add exception handling to  
 */

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// declare and initialize variables
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		char operation = 0;

		// read in operands and operation from user
		System.out.print("Enter an integer (operand 1) and press Enter: ");
		num1 = scanner.nextInt();

		System.out.print("Enter an operation (+, -, /, *) and press Enter: ");
		operation = scanner.next().charAt(0);

		System.out.print("Enter an integer (operand 2) and press Enter: ");
		num2 = scanner.nextInt();
		
		// The result of the operation
		int result = 0;

		// Determine the operator
		boolean isError = false;
		try {
			switch (operation) { 
				case '+': 
					result = num1 + num2;
					break;
				case '-': 
					result = num1 - num2;
					break;
				case '*': 
					result = num1 * num2;
					break;
				case '/': 
					result = num1 / num2;
					break;
				default:
					scanner.close();
					throw new InvalidCalcOperationException(operation);
			}
		} catch(InvalidCalcOperationException ex) {
			ex.getMessage();
			isError = true;
		} finally {
			if(isError) System.out.println("This program is terminating because of an erorr");
			else System.out.println("This program is terminating");
		}

		// Display result
		System.out.printf("%d %c %d = %d\n", num1, operation, num2, result);
		

		// close scanner when done
		scanner.close();

	}
}
