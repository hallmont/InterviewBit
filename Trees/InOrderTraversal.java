/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InOrderTraversal {
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    inorder( a, list );
	    return list;
	}
	
	public void inorder( TreeNode node, ArrayList<Integer> list ) {
	    if( node == null ) return;
	    inorder( node.left, list );
	    list.add( node.val );
	    inorder( node.right, list );
	}
}
