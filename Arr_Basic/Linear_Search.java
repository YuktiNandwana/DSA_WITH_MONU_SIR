package Arr_Basic;

public class Linear_Search {
public static void main(String[]args) {
	    int []arr= {3,5,1,8,4,9};
	    int target=3;
	    System.out.println(Search(arr,target));
}
public static int Search(int[]arr, int target) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			return i;
		}
	}
	return-1;
}
	
}