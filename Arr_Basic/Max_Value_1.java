package Arr_Basic;

public class Max_Value_1 {  //  gulak vala logic yaad rkhna.ek gulak ko max leleo uske baad saari gulak ko usse dekoho agr badi hai toh update krdo 
public static void main(String[]args) {
	int []arr= {2,5,4,8,9,6,1};
	System.out.println(Max(arr));
}
public static int Max(int[]arr) {
	int m=arr[0];
	for(int i=1;i<arr.length;i++) {
	if(m<arr[i]) {
		m=arr[i];
	}
}
	return m;
}
}