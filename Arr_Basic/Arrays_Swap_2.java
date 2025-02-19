package Arr_Basic;

public class Arrays_Swap_2 {
public static void main(String[]args) {
	int []arr= {2,3,5,6,7};
	int []other= {4,6,3,2,7};
	System.out.println(arr[0]+" "+ other[0]);
	Swap(arr,other);
System.out.println(arr[0]+" "+other[0]);
}
public static void Swap(int[]arr,int[]other) {
	int[] temp=arr;
	arr=other;
	other=temp;
}
}