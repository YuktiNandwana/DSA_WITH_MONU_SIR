//package Abhishek_Ques;
//import java.util.Scanner;
//public class Tuesday_Leetcode {
//public static void main (String[]args) {
//	Scanner sc=new Scanner(System.in);
//	int arr= {1,4,2,7,6,3,5};
//	Sliding(arr);
//}
//public static int Sliding(int arr) {
//	int n=arr.length;
//	int k=4;
//	int i=0;
//	int j=0;
//	//first wind sum
//	int wsum=0; //track window sum
//	while(j<k) {
//		wsum+=arr[j];
//		
//	}
//	return 0;
//}
//
//}
// //q2 count distinct elements in k sized window 
//public static int distinct(int []arr,k);
//int n=arr.length;
//int k=3;
//int i=0;
//int j=k+1;
//package Abhishek_Ques;
//
//import java.util.Arrays;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class TuesdayLeetcode {
//
//    public static void main(String[] args) {
//        // Sample array with duplicate values
//        int[] arr = {5, 3, 8, 1, 2, 3, 5, 7, 8};
//
//        // Create a TreeSet to store distinct values
//        Set<Integer> distinctValues = new TreeSet<>();
//
//        // Add elements from the array to the TreeSet
//        for (int num : arr) {
//            distinctValues.add(num);
//        }
//
//        // Convert the TreeSet back to an array (if needed)
//        Integer[] sortedArray = distinctValues.toArray(new Integer[0]);
//
//        // Print the sorted distinct values
//        System.out.println("Distinct sorted values: " + Arrays.toString(sortedArray));
//    }
//}
import java.util.TreeSet;

public class TuesdayLeetcode {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);

        // Accessing the last value
        Integer lastValue = treeSet.last();
        System.out.println("Last value in TreeSet: " + lastValue);
    }
}