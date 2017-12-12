/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaxDepth {
	public int maxDepth(TreeNode a) {
	    return findMaxDepth( a, 1 );
	}
	
	public int findMaxDepth( TreeNode a, int currentDepth ) {
	    if ( a == null ) return currentDepth-1;
	    int depthLeft = findMaxDepth(a.left, currentDepth+1);
	    int depthRight = findMaxDepth(a.right, currentDepth+1);
	    return Math.max(depthLeft,depthRight);
	}
}
