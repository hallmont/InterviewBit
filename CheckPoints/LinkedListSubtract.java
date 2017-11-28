/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class LinkedListSubtract {
    public ListNode subtract(ListNode A) {

        // Count number of nodes
        ListNode node = A;
        int count = 0;
        while( node != null ) {
            count++;
            node = node.next;
        }

        // Get pointer to middle of list (midHead)
        ListNode midHead = A;
        for(int i=0;i<(count/2);i++) {
            midHead = midHead.next;
        }
        ListNode reversedMidHead = reverse(midHead);

        node = A;
        ListNode node2 = reversedMidHead;
        for( int i=0;i<(count/2);i++) {
            node.val = node2.val - node.val;
            node = node.next;
            node2 = node2.next;
        }

        midHead = reverse(reversedMidHead);

        return A;
    }

    public ListNode reverse(ListNode A) {
        ListNode head = null, next=null;
        ListNode current = A;
        while( current != null ) {
            next = current.next;
            current.next = head;
            head = current;
            current = next;
        }

        return head;
    }
}
