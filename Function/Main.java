package Function;

import java.util.Scanner;

public class Main {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		
	}int m=sc.nextInt();
	int[]map=new int[m];
	for(int i=0;i<=n;i++) {
		map[arr[i]]=n+1;
	}
	int ar[]=new int [m];
	int forward=0;int backward =0;
	for(int i=0;i<arr.length;i++) {
		forward+=arr[i];
		backward+=n-arr[i];
	}
	System.out.println(forward+" "+backward);
	sc.close();
}
}
