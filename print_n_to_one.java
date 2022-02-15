import java.util.Scanner;

//Write a program to Print REVERSE of N to 1 numbers?

public class print_n_to_one {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter n th number ");
		for(int i=sc.nextInt();i>0;i--) {
			System.out.println(i);
		}
	}
}
