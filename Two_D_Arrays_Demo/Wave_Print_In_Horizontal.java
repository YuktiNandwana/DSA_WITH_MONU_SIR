package Two_D_Arrays_Demo;

public class Wave_Print_In_Horizontal {

public static void main(String[]args) {

	int [][]arr= {{1,2,3,4,5},{-6,7,80,9,10},{11,12,13,14,15},{16,17,-18,19,20}};

	Horizontal_Wave(arr);

}

public static void  Horizontal_Wave (int[][]arr) {

	for(int row=0;row<arr.length;row++) { //outer loop of rows beacause its fixed   !!

		if(row%2==0) { 

			for(int col=0;col<arr.length;col++) {

				System.out.print(arr[7][col]+" ");

			}

		}else {

			for(int col=arr.length-1;col>=0;col--) {

				System.out.print(arr[row][col]+" ");

			}

		}

	}

}

} 
