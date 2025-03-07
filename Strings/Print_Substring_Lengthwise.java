package Strings;

public class Print_Substring_Lengthwise {
public static void main(String[]args) {
	 String str="abcd";
	 Print( str);
}
public static void Print(String str) {
	for(int length=1;length<=str.length();length++) { //length loop
	for(int j=length;j<=str.length();j++){//j loop
		int i=j-length;
		System.out.println(str.substring(i,j));
	}				
	}
	}
		
}