package Array;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {  9,9,9,9,9,9,9,9 ,9,9,9,9,9,9  };
		 int[] newArr = plusOne(arr);
		 for(int i=0;i<newArr.length;i++) {
		 System.out.println(newArr[i]);
		 }
	}
public static int[] plusOne(int[] digits) {
         
        int sum=0;
        for(int i=0;i<digits.length;i++) {
        	int digit = digits[i];
        	double multiply = Math.pow(10,digits.length-1-i);
        	sum+= digit* multiply;
        }
        int newSum = sum+1;
        String str = String.valueOf(newSum);
        char[] charArr = str.toCharArray();
        if(sum>=Integer.MAX_VALUE||sum<=Integer.MIN_VALUE) {
        	int last = digits[digits.length-1];
        	if(last!=9) {
        	digits[digits.length-1] = last + 1;
        	 return digits;}
        	else {
        		int step = last;
        		int index = digits.length-1;
        		while(step==9&&index>0 ) {
        			digits[index] = 0;
        			index--;
        			step = digits[index];
        		}
        		if(step!=9) {
        		digits[index] = step+1;
        		return digits;
        		}
        		else {
        			digits[index] = 0;
        			digits=Arrays.copyOf( digits,1+digits.length);
        			digits[0] = 1;
        			return digits;
        		}
        	}
        }
        if(charArr.length>digits.length) {
        	digits=Arrays.copyOf( digits,1+digits.length);
        }
        for(int i=0;i<charArr.length;i++) {
        	digits[i] = Integer.parseInt(String.valueOf(charArr[i]));
        }
        return digits;
    }
}
