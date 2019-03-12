package LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ListNode t1 = new ListNode(1);
            ListNode t2 = new ListNode(8);
            ListNode t3 = new ListNode(3);
            ListNode t4 = new ListNode(7);
            ListNode t5 = new ListNode(1);
            ListNode t6 = new ListNode(7);
            t1.next = t2;
            t2.next = t3;
            t3.next = null;
            t4.next = t5;
            t5.next = null;
            t6.next = null;
            AddTwoNumbers atb = new AddTwoNumbers();
            ListNode result = atb.addTwoNumbers(t1, t4);
            System.out.println(result);
	}
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	/* You are given two non-empty linked lists representing two non-negative integers. 
	 * The digits are stored in reverse order and each of their nodes contain a single digit. 
	 * Add the two numbers and return it as a linked list.
	 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	 * Output: 7 -> 0 -> 8
	 */
	if(l1==null&&l2==null) return null;
	if(l1==null&&l2!=null) {
		l1 = new ListNode(0);
		l1.next =null;
	}
	if(l2==null&&l1!=null) {
		l2 = new ListNode(0);
		l2.next = null;
	}
    ListNode node1 = l1;
    ListNode node2 = l2;
    int length1= 0;
    int length2 = 0;
    ListNode record1 = new ListNode(0);
    ListNode record2 = new ListNode(0);
    while(node1!=null) {
    	length1++;
    	record1 = node1;
    	node1= node1.next;
    }
   
    while(node2!=null) {
    	length2++;
    	record2 = node2;
    	node2= node2.next;
    }
   
    if(length1<length2) {//²¹Æël1
    	while(length1<length2) {
    		ListNode tmp = new ListNode(0);
    		record1.next = tmp; 
    		record1 = record1.next;
    		length1++;
    	}
    }
    if(length2<length1) {//²¹Æël2
    	while(length2<length1) {
    		ListNode tmp = new ListNode(0);
    		record2.next = tmp;
    		record2 = record2.next;
    		 
    		length2++;
    	}
    }
    ListNode k1 = l1;
    ListNode k2 = l2;
    //Stack<Integer> stack = new Stack<>();
    boolean flag = false;
    while(k1!=null&&flag==false) {
    	int val1 = k1.val;
    	int val2 = k2.val;
    	
    	if(val1+val2<10) {
    		k1.val = val1+val2;
    		//stack.push(val1+val2);
    	}else {
    		if(k1.next!=null) {
    			//stack.push(val1+val2-10);
    			k1.val = val1+val2-10;
    			k1.next.val = k1.next.val + 1;
    		}else {
    			ListNode last = new ListNode(1);
    			k1.val = val1+val2-10;
    			k1.next = last;
    			flag = true;
    			//stack.push(val1+val2-10);
    			//stack.push(last.val);
    		}
    	}
    	k1 = k1.next;
    	k2 = k2.next;
    }
	return l1;
    }

}
