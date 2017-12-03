/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
	    ListNode aNode = a;
	    ListNode bNode = b;
	    ListNode head = new ListNode(0);
	    ListNode cNode = head;
	    
	    int quotient = 0, num = 0, remainder = 0;
	    while( aNode != null || bNode != null ) {

	        if( aNode == null ) {
	            num = bNode.val + quotient;
	            quotient = 0;
	        } else if ( bNode == null ) {
	            num = aNode.val + quotient;
	        } else {
	            num = aNode.val + bNode.val + quotient;
	        }
	        
	        remainder = num % 10;
	        quotient = num / 10;
	        cNode.val = remainder;


            if( aNode != null )
	            aNode = aNode.next;
	            
	        if( bNode != null )
	            bNode = bNode.next;
	        
	        if( aNode != null || bNode != null || quotient > 0 ) {
	            cNode.next = new ListNode(quotient);
	            cNode = cNode.next;
	        }
	    }
	    
	    return head;
	}
}
