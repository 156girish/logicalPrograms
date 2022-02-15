import java.util.Scanner;

//Write a program to Print 1 to N numbers?

public class print_one_to_n {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the nth number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
			
	}
}
