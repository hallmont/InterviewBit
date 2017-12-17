/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class IdenticalBinaryTrees {
	public int isSameTree(TreeNode a, TreeNode b) {
	    return isSame( a, b );
	}
	
	public int isSame( TreeNode a, TreeNode b ) {
	    if( a == null && b == null ) return 1;
	    if( a != null && b != null ) {
	        if( a.val == b.val ) {
	            return isSame( a.left, b.left ) & isSame( a.right, b.right );
	        }
	        return 0;
	    }
	    return 0;
	}
}
