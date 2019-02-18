package LinkedList;

import java.util.ArrayList;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Reverse rev = new Reverse();
		   ListNode n1 = new ListNode(1);
		   ListNode n2 = new ListNode(2);
		   ListNode n3 = new ListNode(3);
		   ListNode n4 = new ListNode(4);
		   ListNode n5 = new ListNode(5);
		   n1.next = n2; 
		   n2.next = n3;
		   n3.next = n4;
		   n4.next = n5;
		   ListNode result = rev.reverseList(n1);
		   System.out.println(result.val);
	}
public  ListNode reverseList(ListNode head) {
        ListNode node = head;
        ArrayList<Integer> values = new ArrayList<>();
        while(node!=null) {
        	int val = node.val;
        	values.add(val);
        	node = node.next;
        }
        ListNode assign = head;
        int i = 0;
        while(assign!=null) {
        	assign.val = values.get(values.size()-i-1);
        	assign = assign.next;
        	i++;
        }
        return node;
    }
}
