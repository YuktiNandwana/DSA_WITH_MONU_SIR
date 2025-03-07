package Two_D_Arrays_Demo;
import java.util.Scanner;


/// user input
public class Print_Two_D_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();// row input
   int m=sc.nextInt();//column input
   int [][]arr=new int [n][m];//array bnaya
   for(int i=0;i<arr.length;i++) { //row traversal
	   for(int j=0;j<arr[0].length;j++) {  //column traversal
		   arr[i][j]=sc.nextInt();//each element input in a matrix
	   }
   }
Display(arr);
}
   public static void Display(int[][]arr) {
	   for(int i =0;i<arr.length;i++) {  //row traversal
		   for(int j=0;j<arr[0].length;j++) {//column traversal
			   System.out.print(arr[i][j] + " ");
		   }
		   System.out.println();
	   }
   }
	}

