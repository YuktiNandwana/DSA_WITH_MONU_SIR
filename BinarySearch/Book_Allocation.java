package BinarySearch;
import java.util.Scanner;
public class Book_Allocation {
	    public static void main(String args[]) {
	  Scanner sc= new Scanner(System.in);
	  int t=sc.nextInt();
	  while(t-->0){
	  int n=sc.nextInt();//number of books
	  int s=sc.nextInt();//number of students
	  int []arr= new int[n];
	 
		}
		}
	                  
		public static int min_no_pages(int arr[],int s)
	    int low=0;int high=0;
	    for(int i=0;i<arr.length;i++) {
	    	high+=arr[i];
	    }
	    int ans=0;
	    while(low<=high) {
		int mid=low+(high-low)/2;
		if(isitpossible(arr,s,mid)==true) {
			ans=mid;
			high=mid-1;
		}else {
			low=mid+1;
		}
	   }
        return ans;    
	    }
public static boolean isitpossible(int []arr,int s,int mid) {
	int student =1;
	int reas
}
	
