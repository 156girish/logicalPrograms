import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt(),newNum = 0;
		int temp=num;
		while(num != 0) {
			newNum = newNum*10+num%10;
			num = num /10;
			
		};
		if(newNum == temp)
			System.out.println(temp + " is palindrome");
		else
			System.out.println(temp + " is not a palindrome");

	}

}
