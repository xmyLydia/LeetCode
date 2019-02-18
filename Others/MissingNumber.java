package Others;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,6,4,2,3,5,7,0,1};
       int misNum = missingNumber(arr);
       System.out.println(misNum);
	}
	 @SuppressWarnings("unchecked")
	public static int missingNumber(int[] nums) {
	        int res = 0;
	        @SuppressWarnings("rawtypes")
			Map map = new HashMap();
	        for(int i=0;i<nums.length;i++) {
	        	int key = nums[i];
	        	int value = i;
	        	map.put(key, value);
	        }
	        for(int i=1;i<=nums.length;i++) {
	        	int key = i;
	        	Object val = map.get(key);
	        	if(val==null) {
	        		return key;
	        	}
	        }
	        return res;
	    }
}
