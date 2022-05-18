import java.util.*;
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java Program for Calculator");
		double a, b, result;
		char op;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your First number: ");
		a = scan.nextDouble();
		System.out.println("Enter your Second number: ");
		b = scan.nextDouble();
		System.out.println("Please select any operator from '+', '-', '*' or '/'");
		Scanner sc= new Scanner(System.in);
		op= scan.next().charAt(0);
		switch(op) {
		case '+':
			result = a+b;
			System.out.println("Addition of two number is "+result);
			break;
		case '-':
			result = a-b;
			System.out.println("Substraction of two number is "+result);
			break;
		case '*':
			result = a+b;
			System.out.println("Multiplication of two number is "+result);
			break;
		case '/':
			result = a/b;
			System.out.println("Devision of two number is "+result);
			break;
		default:
			System.out.println("Please enter valid operator from '+', '-', '*' or '/'");
		}
	}

}
