import java.util.Scanner;

/*Perfect number, a positive integer that is equal to the sum of its
proper divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3.*/

//Write program weather the number is PERFECT NUMBER or not?

public class perfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt(),i,sum=0;
		for(i=1;i<=num/2;i++) {
			if(num % i == 0) {
				sum=sum+i;
			}
		}
		if(sum == num)
			System.out.println(num + " is a perfect Number.");
		else
			System.out.println(num + " is not a perfect Number.");
	}
}
