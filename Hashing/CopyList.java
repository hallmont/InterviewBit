/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class CopyList {
    public RandomListNode copyRandomList(RandomListNode head) {
        
        HashMap map = new HashMap();
        RandomListNode node = head;
        RandomListNode newHead = new RandomListNode(0);
        RandomListNode node2 = newHead;
        
        // Traverse original list and make copy
        while( node != null ) {
            node2.label = node.label;
            map.put( node, node2 );
            if ( node.next != null ) {
                node2.next = new RandomListNode(0);
            }
            else node2.next = null;
            
            node = node.next;
            node2 = node2.next;
        }
        
        // Adjust random pointer in copied list
        node = head;
        while( node != null ) {
            node2 = (RandomListNode)map.get(node);
            node2.random = (RandomListNode)map.get( node.random );
            node = node.next;
        }
        
        return newHead;
    }
}
