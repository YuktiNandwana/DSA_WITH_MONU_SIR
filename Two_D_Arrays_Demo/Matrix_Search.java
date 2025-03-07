package Two_D_Arrays_Demo;

public class Matrix_Search {
public static void main(String[]args) {
	int [][]arr= {{1,4,7,11,15},
			{2,5,8,12,19},
			{3,6,9,16,22},
			{18,21,23,26,30}};
	System.out.println(Search(arr,36));
}
public static boolean Search(int[][]arr,int target) {
	int r=0;
	int c=arr[0].length-1;//yeh coordinates hai 15 ke 
	while(r<arr.length&& c>=0) {
		if(arr[r][c]==target) {
			return true;
		}else if(arr[r][c]>target) {
			c--;
		}else {
			r++;
		}
	}
	return false;
}
}
