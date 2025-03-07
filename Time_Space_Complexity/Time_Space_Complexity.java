package Time_Space_Complexity;
//notes mei solve re hai ques
//yeh  hai experimental way 
//isme hardware dependencies hai  toh hume jo pdhna hai woh hardwareindependent padhna hai
public class Time_Space_Complexity {

	public static void main(String[] args) {
		
//	long start=System.currentTimeMillis();
//for(int i=0;i<=1000000;i++) {
//	}
//long end=System.currentTimeMillis();
//System.out.println(end-start);
	
//CONSTANT time lgega 0(1) All mathematical operation like(add,subtraction,multiplicTION , DIVISION, Comparison, simple print ki line mei bhi)
//System.out.println("Hello");// 0(1)
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
//ab in sab 5 statements jo hai print ki inki time complexity 0(5) yeh nhi hogi yeh hogi 0(1) constant
		
	 
		//now we will find time complexity of linear search ; make sure main methdo ka hum find nhi krte T.C sirf logic ka hi krte hai T.c find
		
		public static int Search(int[]arr, int target) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==target) {
					return i;
				}
			}
			return-1;
		}
			
		}
	}
}


