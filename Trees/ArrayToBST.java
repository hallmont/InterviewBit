/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ArrayToBST {
	public TreeNode sortedArrayToBST(final List<Integer> a) {
	    return toBST( a, 0, a.size()-1);
	}
	
	public TreeNode toBST( List<Integer> a, int start, int end ) {
	    if( start > end ) return null;
	    
	    int mid = start + (end-start)/2;
	    TreeNode node = new TreeNode( a.get(mid) );
	    node.left = toBST( a, start, mid-1);
	    node.right = toBST( a, mid+1, end );
	    
	    return node;
	}
}
