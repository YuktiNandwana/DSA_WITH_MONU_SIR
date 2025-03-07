package Wrapper_Class;

public class Wrapper_Class_Demo {
public static void main(String[]args) {
	int a=9;//primitive datatype  // store in stack // but wrapper class ki location stores hogi stack mei hi
	Integer a1=91;// wrapper class // store in heap
	System.out.println(a);
	System.out.println(a1);
	 note **** correspondence vale si hi krna ****
	//autoboxing = primitive data ko wrapper class mei rkhna 
    a1 = a;
    
    //unboxing  = wrapper class ko rkho primitve mei 
	 int b =12;
	 int b1=15;
	 b = b1; ab yeh wrapper vala store hjaega stack mei
}

}
