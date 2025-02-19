package Datatypes;
import java.util.Scanner;
public class Inverse_Number {
public static void main(String[]args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int pos=1;
	int sum=0;
	int rem;
		while(n>0) {
			rem	=n%10;
			sum=(int)(sum+pos*Math.pow(10,rem-1));
			n=n/10;
			pos++;
		}
		System.out.print(sum);
}
}
