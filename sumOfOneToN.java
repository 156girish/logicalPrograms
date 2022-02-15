import java.util.Scanner;

//Write a program to display sum of 1 to N numbers?

public class sumOfOneToN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n th number");
		int i,sum=0, n=sc.nextInt();
		for(i=1;i<=n;i++) {
			sum = sum + i;
		}
		System.out.println("Sum of 1 to "+n+" = "+sum);
	}
}
