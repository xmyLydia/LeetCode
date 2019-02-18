package LinkedList;

import java.util.ArrayList;

public class RemoveNth {

	public static void main(String[] args) {
		RemoveNth rn = new RemoveNth();
		// TODO Auto-generated method stub
      ListNode n1 = new ListNode(1);
      ListNode n2 = new ListNode(2);
     ListNode n3 = new ListNode(3);
  ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(5);
      n1.next = n2; 
   n2.next = n3;
     n3.next = n4;
      n4.next = n5;
      ListNode result = rn.removeNthFromEnd(n1, 2);
      System.out.println(result.val);
	}
	public ListNode removeNthFromEnd(ListNode head, int n) { 
		 //count length 
		ListNode countNode = head;
		 int length = 0;
		 while(countNode!=null) {
			 length++;
			 countNode = countNode.next;
		 }
		 if(length==1){
	            return null;
	        }
		 ArrayList<ListNode> list = new ArrayList<>();
		
		 if(n==1) {//delete the last one
			 while(head!=null ) {
	        	 if(head.next.next==null) {
	        		 head.next = null;
	        	 }  
	        	 list.add(head);
	        	 head=head.next; 
	        	 
	         }
			 return list.get(0);
		 }
        
         int i = 0; 
         ListNode test = head;
         while(head!=null ) {
        	 if(i==length-n) {
        		 head.val = head.next.val;
        		 head.next = head.next.next;
        	 }  
        	 list.add(head);
        	 head=head.next; 
        	 i++;
         }
         ListNode node = list.get(0);
         return node;
    }
}
