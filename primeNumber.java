import java.util.Scanner;

//Write a program to display PRIME NUMBERS from 1 to n?

public class primeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n th number");
		int i,j, n = sc.nextInt(),cnt;
		for(i=1;i<n;i++) {
			cnt=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					cnt++;
					break;
				}					
			}
			if(cnt == 0 && i != 1)
				System.out.println(i + " ");
				
		}
	}
}
