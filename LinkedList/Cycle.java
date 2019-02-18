package LinkedList;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cycle cycle = new Cycle();
       
	   ListNode n1 = new ListNode(1);
	   ListNode n2 = new ListNode(2);
	   ListNode n3 = new ListNode(3);
	   ListNode n4 = new ListNode(4);
	   ListNode n5 = new ListNode(5);
	   n1.next = n2; 
	   n2.next = n3;
	   n3.next = n4;
	   n4.next = n5;
	   //n5.next = n2;
      boolean result = cycle.hasCycle(n1);
      System.out.println(result);
	}
	  public boolean hasCycle(ListNode head) {
		  boolean result = false;
          ListNode lenNode = head;
          HashMap<ListNode,Integer> map = new HashMap<>();
		    while(lenNode!=null){
                if(map.get(lenNode)!=null) {
                	return true;
                }
                else{
                	map.put(lenNode, 1);
                }
                lenNode = lenNode.next;
            }
	        return result;
	    }
}
