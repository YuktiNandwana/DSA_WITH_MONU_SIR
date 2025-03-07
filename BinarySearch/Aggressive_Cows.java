package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;
public class Aggressive_Cows {
public static void main(String[]args) {
	Scanner sc=new Scanner (System.in);
	int t=sc.nextInt();
	while(t>0) {
	int n=sc.nextInt();//number of stalls
	int c=sc.nextInt();//number of cows
	int []stall=new int[n];
	for(int i=0;i<stall.length;i++) {
	stall[i]=sc.nextInt(); //stall ki postion wali input
	}
	Arrays.sort(stall);//sort kro
	System.out.print(largest_mini_dist(stall,c));
     t--;
}
}
 public static int largest_mini_dist(int[]stall,int c) {
	 int low=0;
	 int high =stall[stall.length-1]-stall[0];
	 int ans=0;
	 while(low<=high) {
		 int mid=(low+high)/2;
		 if(ispossible(stall,c,mid)==true) {
			 ans=mid;
		low=mid+1;
		 }else {
			 high=mid-1;		 
	 }
 }
	 return ans;
 }
 public static boolean isitpossible(int[]stall,int c,int mid) {
	 int cow=1;
	 int pos=stall[0];
	 for(int i=1;i<stall.length;i++) {
		 if(stall[i]-pos>=mid) {
			 cow++;
			 pos=stall[i];
		 }
		 if(cow==c) {
			 return true;
		 
		 }
	 return false;
	 }
 }

 
