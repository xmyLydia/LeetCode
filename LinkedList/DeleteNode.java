package LinkedList;

public class DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	}
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
