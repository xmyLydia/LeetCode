package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComputeIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] num1 = {1,2 };
   int[] num2 = {2,1};
   int[] intersection = intersect(num1,num2);
    for(int i=0;i<intersection.length;i++) {
	   System.out.println(intersection[i]);
   }  
	}
	  public static int[] intersect(int[] nums1, int[] nums2) {
		  if(nums1==null||nums2==null||nums1.length==0 || nums2.length==0) {
			  int[] arr = {};
			  return arr;
		  }
		   
		  else{
			  if(nums1.length==nums2.length) {
				  ArrayList<Integer> list_a = new ArrayList<>();
				  ArrayList<Integer> list_b = new ArrayList<>();
				   for(int i=0;i<nums1.length;i++) {
					   list_a.add(nums1[i]);
					   list_b.add(nums2[i]);
				   }
				   Collections.sort(list_a);
				   Collections.sort(list_b);
				   boolean flag = true;
				  for(int i=0;i<list_a.size();i++) {
					  if(list_a.get(i)!=list_b.get(i)) {
						  flag = false;
					  }
				  }
				  if(flag==true) {
					  return nums1;
				  }
			  }
			  if(nums1.length<nums2.length) {//set nums1 to be longer
		    	int[] tmp = nums2;
		    	nums2 = nums1;
		    	nums1 = tmp;
		    }
		  if(nums2.length==1) {
			  for(int i=0;i<nums1.length;i++) {
				  if(nums1[i]==nums2[0]) {
					  return nums2;
				  }
			  }
		  }
	        int[] result = null;
	        ArrayList<String> list = new ArrayList<>();
	        String common = "";
	      //  if(nums2.length<nums1.length) {
	        	String str_num1 = "";
	        	for(int i=0;i<nums1.length;i++) {// main string
	        		str_num1+=String.valueOf(nums1[i]);
	        	}
	        	//nums2 as the sub array
	        	String str = String.valueOf(nums2[0]);
	        	list.add(str );
	        	for(int i=1;i<nums2.length ;i++) {
	        		 str+=String.valueOf(nums2[i]);
	        		 list.add(str);
	        	}
	        	
	        	for(int i=0;i<list.size();i++) {
	        		String sub = list.get(i);
	        		int find = str_num1.indexOf(sub);
	        		if(find!=-1) {
	        		   common = sub;
	        		}
	        	}
	        	//change string to int
	           int[] arr_new = Arrays.copyOf(nums2, common.length());
	           char[] arr_char = common.toCharArray();
	           for(int i=0;i<arr_char.length;i++) {
	        	   arr_new[i] = Integer.parseInt(String.valueOf(arr_char[i]));
	           }
	       // }
	        
	        return arr_new;}
	    }
}
