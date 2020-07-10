import java.util.Scanner;

public class AgeGuess {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = scan.next();
	
		System.out.print("Enter Age: ");
		int age = scan.nextInt();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
