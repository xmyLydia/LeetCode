package LinkedList;

public class RemoveDuplicateSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ListNode n1 = new ListNode(1);
		   ListNode n2 = new ListNode(1);
		   ListNode n3 = new ListNode(2);
		  // ListNode n4 = new ListNode(3);
		  // ListNode n5 = new ListNode(3);
		   n1.next = n2; 
		   n2.next = n3;
		   n3.next = null;
		 //   n4.next = n5;
		 //   n5.next = null;
		   RemoveDuplicateSorted rem = new RemoveDuplicateSorted();
		   ListNode result = rem.deleteDuplicates(n1);
		   System.out.println(result.val);
	}
public   LinkedList.ListNode deleteDuplicates(ListNode head) {
     ListNode node = head;  
     ListNode record = node;
     if(head==null) return head;
     int val =0;
	 while(node!=null&&node.next !=null&&node.next.next !=null) {
		 
		 val = node.val;
		 int val_next = node.next.val;
		 while(val==val_next&&node!=null&&node.next.next!=null) {
			 node.next  = node.next.next;
			 val_next = node.next.val;
		 }
		     record = node;
			 node = node.next;
		     
	 }
	 val = node.val;
	 if(node.next!=null) {
	 int val_next_final = node.next.val;
	 if(val==val_next_final) {
    	 node.next = null;
     }
	 }
else if(node.next==null) {
	if(record.val==node.val) {
		 record.next=null;
	}
	 }
	 return head;
    }
}
