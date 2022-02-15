import java.util.Scanner;

//Write a program to check given number is EVEN or ODD?

public class evenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one any number");
		int num = sc.nextInt();
		if(num % 2 ==0)
			System.out.println(num+" is Even");
		else
			System.out.println(num+" is Odd");
	}
}
