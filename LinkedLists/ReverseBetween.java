/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class ReverseBetween {
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    ListNode current = a, head = a;
	    ListNode preMPtr = null;
	    ListNode mPtr = null, prevNode = null, saveNext = null;
	    
	    int count = 1;
	    while( current != null ) {
	        if( count == (m-1) ) {
	            preMPtr = current;
	        } else if( count == m ) {
	            mPtr = current;
	        } else if( count == n ) {
	            if( preMPtr != null ) {
	                preMPtr.next = current;
	                mPtr.next = current.next;
	                current.next = prevNode;
	            } else {
	                mPtr.next = current.next;
	                current.next = prevNode;
	                head = current;
	            }
	            count++;
	            continue;
	        } else if( count > m && count < n ) {

	            saveNext = current.next;
	            current.next = prevNode;
	            prevNode = current;
	            current = saveNext;
	            count++;
	            continue;
	        }
	        prevNode = current;
	        current = current.next;
	        count++;
	    }
	    return head;
	}
}
