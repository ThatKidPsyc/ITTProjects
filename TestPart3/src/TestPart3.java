import java.util.Scanner;


public class TestPart3 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = input.nextInt();
		
		if (number % 5 == 0)
			System.out.println("Hi-Five");
		
		if (number % 2 == 0 || number % 3 == 0)
			System.out.println("Georgia");
	}
}

