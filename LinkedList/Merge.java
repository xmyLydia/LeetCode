package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ListNode n1 = new ListNode(2);
		   ListNode n2 = new ListNode(4);
		   ListNode n3 = new ListNode(3);
		   ListNode n4 = new ListNode(4);
		   ListNode n5 = new ListNode(5);
		   n1.next = n2; 
		   n2.next = null;
		   n3.next = n4;
		   n4.next = n5;
		   n5.next = null;
		   Merge meg = new Merge();
		   ListNode result = meg.mergeTwoLists(n1, n3);
		   System.out.println(result.val);
	}
	 
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		    ListNode rel1 = l1;
		    if(l1==null&&l2==null) {
		    	return null;
		    }else if(l1==null) {
		    	return l2;
		    }else if(l2==null) {
		    	return l1;
		    }
		    ArrayList<Integer> arr = new ArrayList<>();
		    while(rel1!=null) {
		    	arr.add(rel1.val);
		    	rel1 = rel1.next;
		    }
		    ListNode rel2 = l2;	
		    while(rel2!=null) {
		    	arr.add(rel2.val);
		    	rel2 = rel2.next;
		    }
		    Collections.sort(arr);
		  
		    ListNode link = l1;
		    while(link.next !=null) {
		    	link = link.next;
		    }
		    link.next = l2;
		    ListNode sortNode = l1;
		    int index = 0;
		    while(sortNode!=null) {
		    	sortNode.val = arr.get(index);
		    	sortNode = sortNode.next;
		    	index++;
		    }
		  return l1;
	    }
}
