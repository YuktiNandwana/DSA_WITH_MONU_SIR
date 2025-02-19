package Function;

public class Fun_demo_3 {
	static int val=100;
public static void main(String[]args) {
//	System.out.println("hello");
//	int a=7;
//	int b=11;
//	System.out.println(val);
////	System.out.println(Add(a,b));
////}
////public static int Add(int a, int b) {
////	int c=a+b;
////	return c-Sub(c,b);
////}
////public static int Sub(int a, int b) {
////	int c=a-b;
////	return c;
//}
//}
System.out.println("hello");
System.out.println(Add());
}
public static int Add() {
	int a=8;
	int b=7;
	int c=a+b-Sub();
	return c;
}
public static int Sub() {
	int a=9;
	int b=7;
	int c=a-b;
	return c;
}
}