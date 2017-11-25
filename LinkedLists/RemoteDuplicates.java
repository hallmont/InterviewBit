public class RemoveDuplicates
{
    public ListNode deleteDuplicates(ListNode A) {
        ListNode node = A;
        boolean dontAdvance = false;
        while( node != null ) {
            ListNode next = node.next;
            if( next != null ) {
                if( node.val == next.val ) {
                    node.next = next.next;
                    dontAdvance = true;
                }
            }
            if( dontAdvance )
                dontAdvance = false;
            else
                node = node.next;
        }
        return A;
    }
}

