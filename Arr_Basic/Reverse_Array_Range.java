package Arr_Basic;

public class Reverse_Array_Range {
public static void main(String[]args) {
	int arr[]= {3,5,1,7,8,6,9,11,15,17,18,16,23,27};
 Reverse(arr,3,12);//call kra hai humne apne methods ko
	for(int i=0;i<arr.length;i++) {//iss line se hi toh arr mei iteration hoga
		System.out.print(arr[i]+" ");//aur yeh print krega arr 
		
	}
}
public static void Reverse(int[]arr,int i,int j) {
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}

}
