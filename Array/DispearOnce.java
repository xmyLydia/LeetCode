package Array;

import java.util.ArrayList;
import java.util.List;

public class DispearOnce {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 81;
       int[] arr = { 4,3,2,7,8,2,3,1 };
       List<Integer> list = findDisappearedNumbers(arr);
       System.out.println(list.size());
	}
public static List<Integer> findDisappearedNumbers(int[] nums) {
	   /*
	    * Given an array of integers where 1 ¡Ü a[i] ¡Ü n (n = size of array), some elements appear twice and others appear once.
        * Find all the elements of [1, n] inclusive that do not appear in this array.
	    */
	 List<Integer> result = new ArrayList<>();
     if(nums==null )return null;
     if(nums.length==0)return result;
     int min = nums[0];
     int max = nums[0];
     for(int i=1;i<nums.length;i++) {
     	int tmp = nums[i];
     	if(min>tmp) {
     		min = tmp;
     	}
     	if(max<tmp) {
     		max = tmp;
     	}
     }
     boolean greater = false;
     if(nums.length>max){
         max = nums.length;
         greater = true;
       //  result.add(nums.length);
     }
      
     for(int i=1;i< max;i++) {
     	int val = i;
     	boolean flag = false;
     	for(int j=0;j<nums.length;j++) {
     		int real_val = nums[j];
     		if(real_val==val) {
     			flag = true;break;
     		}
     	}
     	if(flag==false) {
     		result.add(val);
     	}
     }
     if(greater==true)result.add(nums.length);
     return result; 
    }
}
