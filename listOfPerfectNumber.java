import java.util.Scanner;

//Write a program to display RANGE of PERFECT NUMBERS?
/*
enter a number
100
1is a perfect number
6is a perfect number
28is a perfect number
 */

public class listOfPerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ending range");
		
		int n=sc.nextInt(),i,j;
		
		for(i=1;i<=n;i++) 
		{
			int sum=1; // here sum should 1 because 1 is also a perfect number
			for(j=2;j<=i/2;j++) // if sum=1 then j should be start form 2
			{
				if(i%j==0) 
					sum = sum + j;
			}
			if(sum==i)
				System.out.println(" " + i +" ");
		}
			
	}

}
