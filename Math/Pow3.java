package Math;

public class Pow3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 81;
       System.out.println(isPowerOfThree(n));
	}
	 public static boolean isPowerOfThree(int n) {
	     /*
	      * Given an integer, write a function to determine if it is a power of three.   
	      */
		 boolean flag = true;
		 if(n<=0)return false;
		 if(n==1)return true;
		 while(n!=1) {
			 int remainder = n%3;
			 if(remainder!=0)return false;
			 n=n/3;
		 }
		 return flag;
	    }
}
