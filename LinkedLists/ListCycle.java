/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class ListCycle {
	public ListNode detectCycle(ListNode a) {
	    ListNode current = a;
	    HashSet set = new HashSet();
	    while( current != null ) {

	        if( set.contains(current) )
	            return current;

            set.add( current );
	        current = current.next;
	    }
	    return null;
	} 
}
