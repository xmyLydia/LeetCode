package String;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int getReverse = reverse(123);
        System.out.println(getReverse);
	}
	 public static int reverse(int x) {
		  
		 if(x==0) {
			 return 0;
		 }
        if(x>Math.pow(2,31)){
            return 0;
        }
        else if(x<Math.pow(-2,31)){
            return 0;
        }
		else if(x>0) {
			 String str = String.valueOf(x);
			 char[] arr = str.toCharArray();
			 int median = Integer.valueOf(arr.length/2);
			 for(int i=0;i<median;i++) {
				 char temp = arr[i];
				 arr[i] = arr[arr.length-1-i];
				 arr[arr.length-1-i] = temp;
			 }
			 String reverseStr = new String(arr);
			 return (Integer.valueOf(reverseStr));
		 }else {
			 String str = String.valueOf(Math.abs(x));
			 char[] arr = str.toCharArray();
			 int median = Integer.valueOf(arr.length/2);
			 for(int i=0;i<median;i++) {
				 char temp = arr[i];
				 arr[i] = arr[arr.length-1-i];
				 arr[arr.length-1-i] = temp;
			 }
			 String reverseStr = new String(arr);
			 return (Integer.valueOf(reverseStr)*(-1));
		 }
	    }
}
