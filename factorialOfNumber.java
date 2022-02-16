import java.util.Scanner;

//5! = 5 * 4 * 3 * 2 * 1 = 120
//Write a program to find the FACTORIAL of a given number?

public class factorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		/*
		int num=sc.nextInt(),i,mul=1;
		for(i=num;i>=1;i--) {
			mul = mul * i;
			num--;
		}
		*/
		int num=sc.nextInt(),fact=1,i;
		for(i=1;i<=num;i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial of number = " + fact);
	}

}
