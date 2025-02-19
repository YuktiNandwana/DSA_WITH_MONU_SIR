package Sorting_Kadanes;

public class Selection_Sort {
public static void main(String[]args) {
	int []arr= {5,3,-7,4,8,2};
	
	}

public static void SelectionSort(int []arr) {
 for(int i=0;i<arr.length;i++) {
	 int idx=Minidx(arr,i);
	 int temp=arr[i];
	 arr[i]=arr[idx];
	 arr[idx]=temp;
 }
	
}
public static void Minidx(int[]arr,int i) {
	int mini=i;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[j]<arr[mini]) {
			mini=j;
		}
	}
}
}