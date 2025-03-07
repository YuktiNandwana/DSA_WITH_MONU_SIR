package BinarySearch;

public class Binary_Search {
public static void main(String[]args) {
	int arr[]= {2,5,6,7,8,9,13,16,18};//sorted array mei use hota h binary search 
	 int target=13;
	 System.out.println(BinarySearch(arr,target));
	
}
public static int BinarySearch(int []arr,int target) {
	int low=0;
	int high=arr.length-1;
	while(low<=high) {
	int mid=(low+high)/2;
	if(arr[mid]==target) {
		return target;
	}else if(arr[mid]>target){
			high=mid-1;
		}else {
			low=mid+1;
		}
	
	
	}
	return -1 ;
}


}
