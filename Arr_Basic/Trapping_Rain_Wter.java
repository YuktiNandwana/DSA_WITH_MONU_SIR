package Arr_Basic;

public class Trapping_Rain_Wter {
public static void main(String[]args) {
//	int []arr= {0,1,0,2,1,0,1,3,2,1,2,1};
	int []arr= {4,2,0,3,2,5};
	System.out.print(Trap(arr));
}
public static int Trap(int[]arr) {
	int n=arr.length;
	//left max
	int []left=new int [n];
	left[0]=arr[0];
	for(int i=1;i<left.length;i++) {
		left[i]=Math.max(left[i-1],arr[i]);
	}
	int []right=new int[n];
	right[n-1]=arr[n-1];
	for(int i=n-2;i>=0;i--) {
		right[i]=Math.max(right[i+1],arr[i]);
	}
	//now we find area=l*b ; where breadth=1 unit; by taking min  usko minus krenge arr[i]and aur store renge sum variavble mei
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum= sum+ Math.min(right[i],left [i])-arr[i];
		
	}
	return sum;
}

}
