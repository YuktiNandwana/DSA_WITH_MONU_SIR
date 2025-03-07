
package Sorting_Kadanes;
public class Bubble_Sort {
	public static void main(String[]args) {
		int []arr= {6,3,9,7,2};
		sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int []arr) {
	   for(int turn=1;turn<arr.length;turn++) {
		   for(int i=0;i<arr.length-1;i++) {
			   if(arr[i]>arr[i+1]) {
				   //if this condition follows then do swapping 
				   int temp=arr[i];
				   arr[i]=arr[i+1];
				   arr[i+1]=temp;
			   }
		   }
	   }
	}
	  
	}

	

















