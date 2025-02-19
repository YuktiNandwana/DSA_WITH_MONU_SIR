package Arr_Basic;

public class Min_Value2 {
public static void main(String[]args) {
	int []arr= {2,4,1,7,9,6,8};
	System.out.println(Min(arr));
}
public static int Min(int[]arr) {
	int m=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(m>arr[i]) {
			m=arr[i];
		}
	}
	return m;
}

}
