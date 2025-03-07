package Gcd_Fibo;

public class Gcd {
		public static void main(String[]args) {
			int dividend=60;
			int divisor=36;
			while(dividend%divisor!=0) {
			int rem=dividend%divisor;
			dividend=divisor;
			divisor=rem;
		}
			System.out.print(divisor);
		}
		}


