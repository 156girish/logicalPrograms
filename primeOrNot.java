import java.util.Scanner;

//Write a program to check whether the given number is PRIME or not?

public class primeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt(),i;
		boolean flag = true;
		for(i=2;i<num;i++){
			if(num % i==0) {
				flag = false;
				break;
			}
		}
		if(flag == false)
			System.out.println("Number is not prime");
		else
			System.out.println("Prime number");
	}
}