package Two_D_Arrays_Demo;

import java.util.Scanner;

public class Reverse_Words_In_a_String {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String s="  this is a cat   ";
	System.out.println(Reverse_Words(s));
}
public static String Reverse_Words(String s){
    s=s.trim();
        String[]arr=s.split("\s+");
    String ans="";
    for(int i=arr.length-1;i>=0;i--){
        ans=ans+arr[i]+" ";
    }
    return ans.trim();
}
}