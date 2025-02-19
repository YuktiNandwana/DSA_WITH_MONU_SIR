package Arr_Basic;

public class Max_Value_2 {
public static void main(String[]args) {
	int[]arr= {5,3,2,7,9,8,80,6};
	System.out.println(Max(arr));
} 
public static int Max(int[]arr) {
	int m=Integer.MIN_VALUE; // -2^31
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>m) {
			m=arr[i];
//		m=Math.max(m,arr[i]);
		}
		
	}
	return m;
}
}
 