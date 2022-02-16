import java.util.Scanner;

//Write a program to display MULTIPLICATION table?

public class multiplication__table {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to print mul. table");
		int num=sc.nextInt(),i,mul=0;
		for(i=1;i<=10;i++) {
			mul=i*num;
			System.out.println(i +"*"+num+"="+mul);
		}
	}

}
