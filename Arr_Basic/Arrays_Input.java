package Arr_Basic;
import java.util.Scanner;
public class Arrays_Input {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int [5];
	for(int i=0;i<arr.length;i++) {
	arr [i]=sc.nextInt();
}
	Display(arr);
}
public static void Display(int [] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
}
}