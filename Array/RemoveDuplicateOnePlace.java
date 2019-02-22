package Array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateOnePlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {0,0,1,1,1,2,2,3,3,4};
       int val = removeDuplicates(nums);
       System.out.println(val);
	}
	 public static int  removeDuplicates(int[] nums) {
		 int val= 0;
		 LinkedHashMap<Integer,Integer> map = new LinkedHashMap();
		 for(int i=0;i<nums.length;i++) {
			 int key = nums[i];
			 if(map.containsKey(key)) {
				 val = map.get(key)+1;
				 map.put(key,val);
			 }
			 else {
				 map.put(key,1);
			 }
		 }
		 int resultLength = map.size();
		 int k = 0;
		 for(Map.Entry<Integer, Integer>entry: map.entrySet()) {
			 int key = entry.getKey();
			 nums[k] = key;
			 k++;
		 }
		 return resultLength;
	 }
}
