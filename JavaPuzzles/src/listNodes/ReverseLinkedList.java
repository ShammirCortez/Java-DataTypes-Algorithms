package listNodes;
import dataTypes.ListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		ListNode listNodeCreation = new ListNode();
		ListNode toReverse = listNodeCreation;
		
		listNodeCreation.next = new ListNode(1);
		listNodeCreation = listNodeCreation.next;
		
		listNodeCreation.next = new ListNode(2);
		listNodeCreation = listNodeCreation.next;
		
		listNodeCreation.next = new ListNode(3);
		listNodeCreation = listNodeCreation.next;
		
		listNodeCreation.next = new ListNode(4);
		listNodeCreation = listNodeCreation.next;
		
		listNodeCreation.next = new ListNode(5);
		listNodeCreation = listNodeCreation.next;
		
		ListNode.print(toReverse);
		
		ListNode reversedNode = reverseNodes(toReverse);
		
		ListNode.print(reversedNode);

	}
	
	public static ListNode reverseNodes(ListNode list) {
		
		ListNode bump = null;
		
		while (list != null) {
			
			ListNode second = list.next;
			list.next = bump;
			bump = list;
			list = second;
			
		}
		
		return bump;
		
	}
	
}
