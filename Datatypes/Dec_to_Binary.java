package Datatypes;

public class Dec_to_Binary {
public static void main(String[]args) {
	int n=39;
	int mul=1;
	int sum=0;
	while(n>0) {
	int rem=n%2;
	sum=sum+rem*mul;
	n=n/2;
	mul=mul*10;
}
System.out.print(sum);
}
}