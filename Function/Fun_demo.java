package Function;

public class Fun_demo {
public static void main(String[]args) {
	System.out.println("hello world");
	Add();
	System.out.println("bye");
}
public static void Add() {
	int a=12;
	int b=3;
	int c=a+b;
	sub();
	System.out.println(c);
	
}
public static void sub() {
	int a=9;
	int b=7;
	int c=a-b;
	System.out.println(c);
}
}