import java.util.Scanner;

//Write a program to find the FACTORIAL of a given RANGE of numbers?

public class factorialOfRange {
	
	static int fact(int n)
	{
		int fact=1;
//		while(n != 0)
//		{
//			fact=fact *n;
//			n--;
//		}
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range of factorial");
		int range=sc.nextInt();			
		for(int i=1;i<=range;i++)
		{
			System.out.println("factorial of " + i +" = "+ fact(i));
		}
		
	}

}
