import java.util.Scanner;

public class sumOfPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ending range");
		int i,num = sc.nextInt(),sum=0;
		for(i=2;i<num;i++) {
			if(isPrime(i)) {
				sum = sum + i;
			}
		}
		System.out.println("Addition of Prime number from 1 to "+num+"="+ sum);
		
	}
	
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num % i == 0 )
				return false;
		}
		return true;
	}

}
