
package Function;
import java.util.Scanner;
public class Odd_Even_Car{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(Odd_Even_Car(n)==true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	public static boolean Odd_Even_Car (int n) {
		int sumOdd=0;int sumEven=0;
		while(n>0) {
			int rem=n%10;
			if(rem%2==0) {
				sumEven+=rem;
			}else {
				sumOdd+=rem;
			}
			n=n/10;
		}
		
	if(sumEven%4==0||sumOdd%3==0) {
		return true;
	}else {
		return false;
	}
		
	}
}
























































































