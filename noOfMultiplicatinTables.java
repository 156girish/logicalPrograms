
import java.util.Scanner;

public class noOfMultiplicatinTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt(),i,j,mul=0;
		for(i=1;i<=num;i++) {
			for(j=1;j<=10;j++) {
				mul = j * i;
				System.out.println(i +"*"+j+"="+mul);
			}
			System.out.println("-----------------------------------------");
		}
	}

}
