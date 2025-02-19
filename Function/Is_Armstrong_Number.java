package Function;
import java.util.Scanner;
public class Is_Armstrong_Number {
public static void main(String[]args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	System.out.println(is_Armstrong_Number(n));

}

public static boolean  is_Armstrong_Number(int n) {
	int c=  countofDigit(n) ;
		int sum=0;
		int p=n;
		while(p>0) {
		int rem=p%10;
		sum=(int)(sum+Math.pow(rem, c));
		p=p/10;
	}
	if(sum==n) {
	return true;
	}else {
		return false;
	}
	}
public static int countofDigit(int n) {
	int count=0;
	while(n>0) {
		count++;
		n=n/10;
	}
	return count;
}
	
}
