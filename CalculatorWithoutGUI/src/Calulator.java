// Importing user inputs package
import java.util.*;

// Class name must be the same with the file name "Calculator"
public class Calulator 
{
// Starting point of execution (Main method)	
	public static void main(String[]args) 
	{
//		Variables declarations
		int first_number = 0;
		int second_number = 0;
		char operator;
		double result = 0.0;
		
//		Creating an instance of the user-input(Scanner) package
		Scanner scan = new Scanner(System.in);
		
//		Enabling user to enter input
		System.out.print("Enter first number: ");
		first_number = scan.nextInt();
		
		System.out.print("Enter operator: ");
		operator = scan.next().charAt(0);
		
		System.out.print("Enter second number: ");
		second_number = scan.nextInt();
		
//		Switch statement to control the operator type
		switch(operator) 
		{
			// The addition case
			case '+':
				result = first_number + second_number;
				break;
			
			// The subtraction case
			case '-':
				result = first_number - second_number;
				break;
			
			// The multiplication case 
			case '*':
				result = first_number * second_number;
				break;
				
			// The division case
			case '/':
				result = first_number / second_number;
				break;
		}
		
//		Displaying calculation result
		System.out.println("The result of " + first_number + " " + operator + " " + second_number
				+ " is " + result);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
