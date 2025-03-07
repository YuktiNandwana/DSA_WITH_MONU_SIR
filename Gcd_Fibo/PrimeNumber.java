package Gcd_Fibo;
import java.util.Scanner;
public class PrimeNumber {
	
		public static void main (String[]args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int count=0;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					count++;
				}
			}
	if(count>=1) {
		System.out.print("not a prime number");
				}else {
					System.out.print("Its  a prime number");
			}
		}
	}

