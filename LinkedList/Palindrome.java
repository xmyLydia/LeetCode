package LinkedList;

import java.util.ArrayList;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Palindrome palin = new Palindrome();
	   ListNode n1 = new ListNode(-129);
	   ListNode n2 = new ListNode(-129);
	  // ListNode n3 = new ListNode(3);
	  // ListNode n4 = new ListNode(2);
	  // ListNode n5 = new ListNode(1);
	   n1.next = n2; 
	   n2.next = null;
	  // n3.next = n4;
	   //n4.next = n5;
      boolean result = palin.isPalindrome(n1);
      System.out.println(result);
	}
	 public boolean isPalindrome(ListNode head) {
		    
	        boolean result = true;
	        int length = 0;
	        ListNode node = head;
	        ArrayList<Integer> arr  = new ArrayList<>();
	        while(node!=null) {
	        	arr.add(node.val);
	        	length++;
	        	node = node.next;
	        }
	        if(length==2) {
	        	if(arr.get(0).equals(arr.get(1))) {
	        		return true;
	        	}else {
	        		return false;
	        	}
	        }
	        int median = length/2;
	        for(int i=0;i<median;i++) {
	        	if(!arr.get(i).equals(arr.get(length-i-1))) {
	        		result = false;
	        	}
	        }
	        return result;
	    }
}
