package dataTypes;
import java.lang.StringBuilder;

public class ListNode {
	
	public int val;
	public ListNode next;
	
	public ListNode(){}
	
	public ListNode(int val){
		this.val = val;
	}
	
	public ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
	
	public static void print(ListNode temp) {
		
		StringBuilder builder = new StringBuilder();

		builder.append("( ");
		
		while (temp.next != null) {
			builder.append("" + temp.val + ", ");
			temp = temp.next;
		}
		
		builder.append(" )");
		
		System.out.println(builder.toString());
		
	}
	
}
