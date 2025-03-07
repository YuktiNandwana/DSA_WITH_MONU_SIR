package Gcd_Fibo;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int reverse=0;
		while(n>0) {
			int digits=n%10;//extract last digit
			reverse=reverse*10+digits;//append yours last digit in reverse variable
			        n=n/10;    //remove your last digits
		}
		System.out.print(reverse);
	}
	}

