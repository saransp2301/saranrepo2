package Calculator;
import java.util.Scanner;
public class calcc 
{
	public static void main(String[] args)
	{ 
		System.out.println("Hi there, Ready for some Maths");
		try (Scanner scaninput = new Scanner(System.in)) {
			System.out.println("Enter first number : ");
			int x = scaninput.nextInt(); 
			System.out.println("Enter second number : ");
			int y = scaninput.nextInt();
			System.out.println("Addition of two numbers is: " + calculator.add(x,y));
			System.out.println("Subtraction of two numbers is: " + calculator.sub(x,y));
			System.out.println("Multiplication of two numbers is: " + calculator.mul(x,y));
			System.out.println("Division of two numbers is: " + calculator.div(x,y));
		}
	}

}