package Array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {  4,1,2,1,2 };
        int result = singleNumber(arr);
        System.out.println(result);
	}
public static int singleNumber(int[] nums) {
        int res=0;
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++) {
        	int tmp = nums[i];
        	int key = tmp;
        	Object value = map.get(key);
        	if(value==null) {
        		map.put(key, 1);
        	}else {
        		int newVal = Integer.parseInt(value.toString())+1;
        		map.put(key, newVal);
        	}
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	int key = entry.getKey();
            Object Value = entry.getValue() ;
            int int_val = Integer.parseInt(Value.toString());
            if(int_val==1) {
            	return key;
            }
        }
    
        return res;
    }
}
