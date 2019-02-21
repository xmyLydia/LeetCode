package LinkedList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
              ListNode node = head;
         if(head==null)return null;
        LinkedHashMap<Integer,Integer > linkedMap = new LinkedHashMap();
        ArrayList<ListNode> list = new ArrayList<>();
		while(node!=null) {
			if(linkedMap.containsKey(node.val)) {
				 int times = linkedMap.get(node.val)+1;;
				 linkedMap.put(node.val, times);
			}else {
				linkedMap.put(node.val,1  );
			}
			node = node.next;
		}
		 ListNode now = head;
		int i=0;
		int length = linkedMap.entrySet().size();
		boolean flag = false;
		for(Map.Entry<Integer, Integer> entry: linkedMap.entrySet()) {
			int times = entry.getValue();
			 
			if(times==1) {
				ListNode tmp = new ListNode(entry.getKey());
				tmp.next = null;
				list.add(tmp);
				flag = true; 
			 
			}
			i++;
		}  
		if(list.isEmpty()) {
			return null;
		}
		ListNode result = list.get(0);
		if(list.size()==1) {
			return result;
		}
		result.next = list.get(1);
		ListNode temp ;
		for(int m=1;m<list.size()-1;m++) {
		    temp = list.get(m);
			temp.next = list.get(m+1);
		}
		 temp = list.get(list.size()-1);
		 temp.next = null;
		return result;
    }
}